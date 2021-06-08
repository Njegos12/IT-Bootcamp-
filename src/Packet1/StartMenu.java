package Packet1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StartMenu {
	
	
	
	//public static final String DASHBOARD = "//*[@id=\"sn_dashboard\"]/span";
	public static final String SHFITPLANNER = "//*[@id=\"sn_schedule\"]/span"; 
	public static final String TIME =  "//*[@id=\"sn_timeclock\"]/span";
	public static final String LEAVE = "//*[@id=\"sn_requests\"]/span/p";
	public static final String TRAINING = "//*[@id=\"sn_training\"]/span";
	public static final String STAFF = "//*[@id=\"sn_staff\"]/span";
	public static final String AVILABILITY = "//*[@id=\"sn_availability\"]/span/p";
	public static final String PAYROLL = "//*[@id=\"sn_payroll\"]/span";
	public static final String REPORTS = "//*[@id=\"sn_reports\"]/span/p";
	

	public static void clickDaschboard(WebDriver driver) {
		driver.findElement(By.className("primNavQtip__inner")).click();
	}
	
	public static void clickShiftplanner(WebDriver driver) {
		driver.findElement(By.xpath(SHFITPLANNER)).click();
	}
	public static void clickTime(WebDriver driver) {
		driver.findElement(By.xpath(TIME)).click();
	}
	public static void clickLeave(WebDriver driver) {
		driver.findElement(By.xpath(LEAVE)).click();
	}
	public static void clickTraining(WebDriver driver) {
		driver.findElement(By.xpath(TRAINING)).click();
	}
	public static void clickStaff(WebDriver driver) {
		driver.findElement(By.xpath(STAFF)).click();
	}
	public static void clickAvialibility(WebDriver driver) {
		driver.findElement(By.xpath(AVILABILITY)).click();
	}
	public static void clickPayroll(WebDriver driver) {
		driver.findElement(By.xpath(PAYROLL)).click();
	}
	public static void clickReports(WebDriver driver) {
		driver.findElement(By.xpath(REPORTS)).click();
	}
	
	
	
	
	
}  
