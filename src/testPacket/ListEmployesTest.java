package testPacket;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Packet1.AddEmployes;
import Packet1.HomePage;
import Packet1.Registracion;
import Packet1.StartMenu;

public class ListEmployesTest {

	private static WebDriver driver;

	@BeforeClass
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\Drajveri\\chromedriver.exe");
		driver = new ChromeDriver();

	}

	@Test
	public void testFormRegDashBoard() throws InterruptedException, IOException  {

		driver.navigate().to(Registracion.URL);
		driver.manage().window().maximize();
		driver.navigate().refresh();

		Thread.sleep(4000);

		HomePage.clicLoginButton(driver);
		Registracion.inputUserName(driver, "petarpetrovic1212@gmail.com");
		Registracion.inputPaswword(driver, "rukomet1212");
		Registracion.clickLogIn(driver);
		
		File f = new File("ZAPOSLENI.xlsx");
		try {
		InputStream is = new FileInputStream(f);
		XSSFWorkbook wb = new XSSFWorkbook(is);
		Sheet sheet = wb.getSheetAt(0);
       // SoftAssert sa = new SoftAssert();
		
		for (int i = 0; i < 5; i++) {
			Row row = sheet.getRow(i);
			Cell c0 = row.getCell(0);
			Cell c1 = row.getCell(1);
			Cell c2 = row.getCell(2);

			String firstname = c0.toString();
			String lastname = c1.toString();
			String email = c2.toString();
			

			

			Thread.sleep(3000);
			StartMenu.clickStaff(driver);
			Thread.sleep(3000);
			AddEmployes.clicAddEmployes(driver);
			Thread.sleep(1500);
			AddEmployes.addFristname(driver, firstname);
			AddEmployes.addLastname(driver, lastname);
			AddEmployes.addEmail(driver, email);
			
			try {
				Thread.sleep(4000);
				AddEmployes.clickSaveEmployes(driver);
				
			} catch (InterruptedException e) {
				e.printStackTrace();
				
			}
			
			AddEmployes.clicAddEmployes(driver);
		   StartMenu.clickStaff(driver);
			Assert.assertTrue(driver.getPageSource().contains(email));
		  // String currentUrl = driver.getCurrentUrl();
		  // String expceteddUrl = "https://petarpetrovic2.humanity.com/app/staff/add/";
		  // sa.assertEquals(currentUrl, expceteddUrl,firstname + " " + i);
		   
			
		}
		//sa.assertAll();
		wb.close();
	}
		catch (IOException e) {
			e.printStackTrace();
		}
}
}