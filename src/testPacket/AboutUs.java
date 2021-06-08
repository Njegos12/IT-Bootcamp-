package testPacket;

import java.io.File;
import java.io.IOException;



import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Packet1.Registracion;

public class AboutUs {
	
	private static WebDriver driver;

	@BeforeClass
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\Drajveri\\chromedriver.exe");
		driver = new ChromeDriver();

	}
	
	@Test
	public static void AboutUs() throws InterruptedException {

		driver.navigate().to(Registracion.URL);
		driver.manage().window().maximize();
		driver.navigate().refresh();

		Thread.sleep(4000);

		Registracion.aboutUS(driver);

		Registracion.clickAboutUs(driver);
		
        File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		try {
			FileUtils.copyFile(file, new File("C:\\Users\\njego\\Desktop\\Slika\\slika.jpeg"));
		} catch (IOException e) {
			e.printStackTrace();
		}

		String currentUrl = driver.getCurrentUrl();
		String expectedUrl = "https://www.humanity.com/about" ;

		SoftAssert sa = new SoftAssert();

		sa.assertEquals(currentUrl, expectedUrl);
		sa.assertAll();
     
	}

}
