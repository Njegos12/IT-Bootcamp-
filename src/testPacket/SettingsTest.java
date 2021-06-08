package testPacket;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.openqa.selenium.support.ui.Select;
import Packet1.HomePage;
import Packet1.Registracion;
import Packet1.Settings;

public class SettingsTest {
	
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
	   Thread.sleep(1000);
	   driver.navigate().refresh();
	   Thread.sleep(1000);
	   Settings.clickSettings(driver);
	   Thread.sleep(1000);
	   Select drpLanguage = new Select(driver.findElement(By.name("language")));
	   drpLanguage.selectByVisibleText("German (machine)");
	   Settings.clcikSaveSettings(driver);
	   driver.navigate().refresh();
	   Thread.sleep(2000);
	  // WebElement notifiikacion = driver.findElement(By.xpath("//*[@id=\"pref_pref_email\"]"));
	 //  notifiikacion.getAttribute("checked");
	   String curretntText = Settings.getElement(driver);
	   String expectedText = "Einstellungen";
	   sa.assertEquals(curretntText, expectedText);
	   sa.assertAll();
 
}
	
}