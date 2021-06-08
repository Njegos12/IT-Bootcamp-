package testPacket;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Packet1.AddEmployes;
import Packet1.ChangeName;
import Packet1.HomePage;
import Packet1.Registracion;
import Packet1.StartMenu;

public class TestChangeName {

	private static WebDriver driver;

	@BeforeClass
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\Drajveri\\chromedriver.exe");
		driver = new ChromeDriver();

	}

	@Test(priority = 1)
	public void testFormRegDashBoard() throws InterruptedException {

		driver.navigate().to(Registracion.URL);
		driver.manage().window().maximize();
		driver.navigate().refresh();

		Thread.sleep(4000);

		HomePage.clicLoginButton(driver);
		Registracion.inputUserName(driver, "petarpetrovic1212@gmail.com");
		Registracion.inputPaswword(driver, "rukomet1212");
		Registracion.clickLogIn(driver);

		Thread.sleep(3000);

		StartMenu.clickStaff(driver);

		
		Thread.sleep(3000);
		ChangeName.clickONemployes(driver);	
		Thread.sleep(2000);
		ChangeName.clickEddit(driver);
		Thread.sleep(1000);
		ChangeName.clearName(driver);
		ChangeName.clearLastName(driver);
		ChangeName.addNewName(driver, "Danijel");
		ChangeName.addNewLastname(driver, "Danilovic");
		ChangeName.clickSaveEmployes(driver);
	    Thread.sleep(3000);
		String currentUrl = driver.getCurrentUrl();
		String ExpectedUrl = "https://petarpetrovic2.humanity.com/app/staff/edit/6361932/";
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(currentUrl,ExpectedUrl );
		sa.assertAll();
	}
	
}