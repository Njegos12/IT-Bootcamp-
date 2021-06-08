package Packet1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ChangeName {

	public static final String EMPLOYESpersonX = "//*[@id=\"7\"]/a";
	public static final String EDDIT = "//*[@id=\"_cd_staff\"]/div[2]/div[2]/div[1]/a[2]"; 
	public static final String EDDITname = "//*[@id=\"first_name\"]";
	public static final String EDDITlastname = "//*[@id=\"last_name\"]";
	public static final String SAVEemployes = "//*[@id=\"act_primary\"]";

	public static void clickONemployes(WebDriver driver) {
		driver.findElement(By.xpath(EMPLOYESpersonX)).click();

	}

	public static void clickEddit(WebDriver driver) {
		driver.findElement(By.xpath(EDDIT)).click();
	}

	public static void clearName(WebDriver driver) {
		driver.findElement(By.xpath(EDDITname)).clear();
	}

	public static void clearLastName(WebDriver driver) {
		driver.findElement(By.xpath(EDDITlastname)).clear();
	}

	public static void addNewName(WebDriver driver, String Newname) {
		driver.findElement(By.xpath(EDDITname)).sendKeys(Newname);

	}
	public static void addNewLastname(WebDriver driver, String Newlastname) {
		driver.findElement(By.id("last_name")).sendKeys(Newlastname);
	}
	public static void clickSaveEmployes(WebDriver driver) {
		driver.findElement(By.xpath(SAVEemployes)).click();
	}
	
}