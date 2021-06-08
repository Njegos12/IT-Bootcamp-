
package Packet1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Registracion {

	public static final String URL = "https://www.humanity.com/";
	public static final String USERNAME =  "/html/body/div[1]/div[2]/div/form[1]/div[1]/div[2]/div/input";
	public static final String PASSWORD = "//*[@id=\"password\"]";
	public static final String LOGIN = "//*[@id=\"LoginForm\"]/div[3]/div/button[1]";
    public static final String CLOSE = "//*[@id=\"tcp-modal\"]/div/div/div[1]/button";
    public static final String ABOUTUS = "//*[@id=\"navbarSupportedContent\"]/ul/li[6]";
    public static final String aboutUS = "//*[@id=\"navbarSupportedContent\"]/ul/li[6]/ul/li[1]/a/p[1]";
  
	
    public static void close(WebDriver driver) {
    	driver.findElement(By.xpath(CLOSE)).click();
    }

	public static void inputUserName(WebDriver driver, String username) {
		driver.findElement(By.xpath(USERNAME)).sendKeys(username);
	}

	public static void inputPaswword(WebDriver driver, String password) {
		driver.findElement(By.xpath(PASSWORD)).sendKeys(password);
	}
	
	public static void clickLogIn(WebDriver driver) {
		driver.findElement(By.xpath(LOGIN)).click();
	}
	public static void aboutUS(WebDriver driver) {
		driver.findElement(By.xpath(ABOUTUS)).click();
	}
	
	public static void clickAboutUs(WebDriver driver) {
		driver.findElement(By.xpath(aboutUS)).click();
	}

}