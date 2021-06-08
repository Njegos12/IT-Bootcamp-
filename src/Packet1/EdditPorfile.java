package Packet1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EdditPorfile {

	
	
	
	public static final String PETARpetrovic = "//*[@id=\"locations-positions-container\"]/li[1]/a";
	public static final String EmployesPETAR = "//*[@id=\"7\"]/a";
	public static final String EDDITdetalis = "//*[@id=\"_cd_staff\"]/div[2]/div[2]/div[1]/a[2]";
	public static final String EDDITfirstname = "//*[@id=\"first_name\"]";
	public static final String InputNICKAname = "//*[@id=\"nick_name\"]";
	public static final String SaveEmployes = "//*[@id=\"act_primary\"]";
	
	
	
	
	public static void clickPetar(WebDriver driver) {
		driver.findElement(By.xpath(PETARpetrovic)).click();
		
	}
	public static void clickEmployesPetar(WebDriver driver) {
		driver.findElement(By.xpath(EmployesPETAR)).click();
		
	}
	public static void clickEditdetalis(WebDriver driver) {
		driver.findElement(By.xpath(EDDITdetalis)).click();
	}
	
	public static void clearFirstNAME(WebDriver driver) {
	  driver.findElement(By.xpath(EDDITfirstname)).clear();
	  
	}
	public static void nickNAME(WebDriver driver,String nickname) {
		
		driver.findElement(By.xpath(InputNICKAname)).sendKeys(nickname);
	}
	public static void clickSaveEmployes(WebDriver driver) {
		driver.findElement(By.xpath(SaveEmployes)).click();
	}
	
   // public static void inputNewName(WebDriver driver, String newname) {
	//	driver.findElement(By.xpath(EDDITfirstname)).sendKeys(newname);
	//}
	}
