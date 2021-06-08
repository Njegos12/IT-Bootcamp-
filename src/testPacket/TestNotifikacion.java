package testPacket;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Packet1.HomePage;
import Packet1.Notifikacion;
import Packet1.Registracion;
import Packet1.Settings;

public class TestNotifikacion {

	private static WebDriver driver;

	@BeforeClass
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\Drajveri\\chromedriver.exe");
		driver = new ChromeDriver();

	}

	@Test
	public void testNotifikacion() throws InterruptedException {

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
		Settings.clickSettings(driver);
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)");
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.id("pref_pref_email"))).click();

	//	Notifikacion.clickNotifikacion1(driver);
	//	Notifikacion.clickNotifikacion2(driver);
	//	Notifikacion.clickNotifikacion3(driver);
	//	JavascriptExecutor xs = (JavascriptExecutor) driver;
	//	js.executeScript("window.scrollBy(0,300)");
		Notifikacion.clickSaveSettings(driver);
		Thread.sleep(1000);
		driver.navigate().refresh();
	}
}