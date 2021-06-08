package Packet1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddEmployes {
	
	public static final String EMPLOYES = "//*[@id=\"act_primary\"]";
	public static final String FIRSTname = "//*[@id=\"_asf1\"]";
	public static final String LASTname = "//*[@id=\"_asl1\"]";
	public static final String EMAIL = "//*[@id=\"_ase1\"]";
	public static final String SAVEemplyes = "//*[@id=\"_as_save_multiple\"]";
	public static final String ELEMENT2 = "//*[@id=\"10\"]/span";
	
	public static void clicAddEmployes (WebDriver driver) {
		driver.findElement(By.xpath(EMPLOYES)).click();
	}
	
	public static void addFristname(WebDriver driver,String firstname) {
		driver.findElement(By.xpath(FIRSTname)).sendKeys(firstname);
		
	}
	public static void addLastname(WebDriver driver, String lastname) {
		
		driver.findElement(By.id("_asl1")).sendKeys(lastname);
	}

	public static void addEmail(WebDriver driver, String email) {
		
		driver.findElement(By.xpath(EMAIL)).sendKeys(email);
	}
	
	public static void clickSaveEmployes(WebDriver driver) {
		driver.findElement(By.xpath(SAVEemplyes)).click();
	}
	
	public static String getElement(WebDriver driver) {
		  String Text = driver.findElement(By.xpath(ELEMENT2)).getText();
		  return Text;
		}
		
	
	
	
}
