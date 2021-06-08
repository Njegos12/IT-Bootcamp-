
package Packet1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	public static final String URL = "https://www.humanity.com/";
	public static final String XpathLogin = "//*[@id=\"navbarSupportedContent\"]/div/a[2]/p";

	public static void clicLoginButton(WebDriver driver) {
		driver.findElement(By.xpath(XpathLogin)).click();

	}

}
