
package testPacket;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Packet1.AddEmployes;
import Packet1.HomePage;
import Packet1.Registracion;
import Packet1.Settings;
import Packet1.StartMenu;

public class TestAddEmployes {
	
	
	
	private static WebDriver driver;

	@BeforeClass
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\Drajveri\\chromedriver.exe");
		driver = new ChromeDriver();

		
} 
	
	@Test
	public void testFormRegg() throws InterruptedException {

		SoftAssert sa = new SoftAssert();

		driver.navigate().to(Registracion.URL);
		driver.manage().window().maximize();
		driver.navigate().refresh();

		Thread.sleep(4000);

		HomePage.clicLoginButton(driver);
		Registracion.inputUserName(driver, "petarpetrovic1212@gmail.com");
		Registracion.inputPaswword(driver, "rukomet1212");
		Registracion.clickLogIn(driver);
		Thread.sleep(4000);
        StartMenu.clickStaff(driver);
        
        Thread.sleep(4000);
        AddEmployes.clicAddEmployes(driver);
        Thread.sleep(3000);
		AddEmployes.addFristname(driver, "Mirko");
		AddEmployes.addLastname(driver, "Mirkovic");
		AddEmployes.addEmail(driver, "mirkomirkovic@kucni.com");
	    AddEmployes.clickSaveEmployes(driver);
	    StartMenu.clickStaff(driver);
	    Thread.sleep(10000);
	    
	    String curretntText = Settings.getElement(driver);
		String ExpectedText = "mirkomirkovic@kucni.com";
		sa.assertEquals(curretntText, ExpectedText);
		sa.assertAll();
}
}