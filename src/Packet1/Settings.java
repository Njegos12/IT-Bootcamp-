package Packet1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Settings {

	
	public static final String SETTINGS = "//*[@id=\"_nav\"]/div[3]/ul/li";
	public static final String SAVEsetting = "//*[@id=\"act_primary\"]";
	public static final String LANGUAGE = "//*[@id=\"adminSettingsForm\"]/div[1]/table/tbody/tr[3]/td[2]/select";
	public static final String ELEMENT = "//*[@id=\"_cd_admin\"]/div[1]/div/div/div[1]/div/div";
    
	public static void clickSettings (WebDriver driver) {
		driver.findElement(By.xpath(SETTINGS)).click();
	}
	
	public static void clcikSaveSettings(WebDriver driver) {
		driver.findElement(By.xpath(SAVEsetting)).click();
	}
   
	public static String getElement(WebDriver driver) {
	  String Text = driver.findElement(By.xpath(ELEMENT)).getText();
	  return Text;
	}
	
	
	
}

