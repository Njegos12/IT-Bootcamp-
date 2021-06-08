package testPacket;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Packet1.HomePage;
import Packet1.Registracion;
import Packet1.StartMenu;

public class TestStartMenu {

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

		StartMenu.clickDaschboard(driver);

		String currentUrl = driver.getCurrentUrl();
		String ExpectedUrl = "https://petarpetrovic2.humanity.com/app/dashboard/";
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(currentUrl, ExpectedUrl);
		sa.assertAll();
	}

	@Test(priority = 2)
	public void clckSchiftPlanner() {

		StartMenu.clickShiftplanner(driver);

		String currentUrl = driver.getCurrentUrl();
		String ExpectedUrl = "https://petarpetrovic2.humanity.com/app/schedule/employee/week/overview/overview/5%2c5%2c2021/";
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(currentUrl, ExpectedUrl);
		sa.assertAll();
	}

	@Test(priority = 3)
	public void clickTime() {

		StartMenu.clickTime(driver);

		String currentUrl = driver.getCurrentUrl();
		String ExpectedUrl = "https://petarpetrovic2.humanity.com/app/timeclock/";
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(currentUrl, ExpectedUrl);
		sa.assertAll();
	}

	@Test (priority = 4)
	public void clickLeave() {
		
		StartMenu.clickLeave(driver);
		
		String currentUrl = driver.getCurrentUrl();
		String ExpectedUrl = "https://petarpetrovic2.humanity.com/app/requests/vacation/";
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(currentUrl, ExpectedUrl);
		sa.assertAll();

	}
	@Test (priority = 5)
	public void clickTraining() {
		
		StartMenu.clickTraining(driver);

		String currentUrl = driver.getCurrentUrl();
		String ExpectedUrl = "https://petarpetrovic2.humanity.com/app/training/";
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(currentUrl, ExpectedUrl);
		sa.assertAll();

	}
	@Test (priority = 6)
	public void clickStaff() throws InterruptedException {
		
		StartMenu.clickStaff(driver);
		
		Thread.sleep(3000);

		String currentUrl = driver.getCurrentUrl();
		String ExpectedUrl ="https://petarpetrovic2.humanity.com/app/staff/list/load/true/";
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(currentUrl, ExpectedUrl);
		sa.assertAll();
	}
	
	@Test (priority = 7)
	public void clickPayRoll() {
		
		StartMenu.clickPayroll(driver);
		
		
		String currentUrl = driver.getCurrentUrl();
		String ExpectedUrl ="https://petarpetrovic2.humanity.com/app/payroll/scheduled-hours/";
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(currentUrl, ExpectedUrl);
		sa.assertAll();
	}
	@Test (priority = 8)
	public void clickReports() {
		StartMenu.clickReports(driver);

		String currentUrl = driver.getCurrentUrl();
		String ExpectedUrl ="https://petarpetrovic2.humanity.com/app/reports/dashboard/";
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(currentUrl, ExpectedUrl);
		sa.assertAll();
		
	}
	
	@Test (priority = 9)
	public void clicAvialibiily() throws InterruptedException {
		
		StartMenu.clickAvialibility(driver);
		
		Thread.sleep(5000);
		
		String currentUrl = driver.getCurrentUrl();
		String ExpectedUrl ="https://petarpetrovic2.humanity.com/fe/availability/#/requests/week/2021-05-30/1";
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(currentUrl, ExpectedUrl);
		sa.assertAll();
		
	}
	@AfterClass
	public void closeDriver() {
		driver.quit();
	}
	
}