package Packet1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Notifikacion {

 //   public static final String Notifikacon1 = "//*[@id=\"pref_pref_email\"]"; 
//	public static final String Notifikacon2 = "//*[@id=\"pref_pref_sms\"]";
//	public static final String Notifikacion3 = "//*[@id=\"pref_pref_mobile_push\"]";
	public static final String SAVEsettenigs = "//*[@id=\"act_primary\"]";

	
	public static void clickNotifikacion1(WebDriver driver) {
		driver.findElement(By.id("pref_pref_email")).sendKeys(Keys.RETURN);
	}
	
	public static void clickNotifikacion2(WebDriver driver) {
		driver.findElement(By.id("pref_pref_sms")).click();
	}
	
	
	public static void clickNotifikacion3(WebDriver driver) {
		driver.findElement(By.id("pref_pref_mobile_push")).click();
	}
	
	
	public static void clickSaveSettings(WebDriver driver) {
		driver.findElement(By.xpath(SAVEsettenigs)).click();
	}
}
