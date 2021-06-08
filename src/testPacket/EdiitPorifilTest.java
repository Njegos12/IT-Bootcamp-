package testPacket;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Packet1.EdditPorfile;
import Packet1.HomePage;
import Packet1.Registracion;
import Packet1.StartMenu;

public class EdiitPorifilTest {
	
	

	private static WebDriver driver;

	@BeforeClass
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\Drajveri\\chromedriver.exe");
		driver = new ChromeDriver();

	}

	@Test
	public void testEditName() throws InterruptedException {

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
		StartMenu.clickStaff(driver);
		Thread.sleep(3000);
		EdditPorfile.clickPetar(driver);
		Thread.sleep(1000);
		 EdditPorfile.clickEmployesPetar(driver);
		 Thread.sleep(2000);
		 EdditPorfile.clickEditdetalis(driver);
		 Thread.sleep(2000);
		 EdditPorfile.clearFirstNAME(driver);
		 EdditPorfile.nickNAME(driver, "Pera");
		 

}
}