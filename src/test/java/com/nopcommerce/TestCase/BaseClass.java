package com.nopcommerce.TestCase;


import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	public String baseURL = "https://admin-demo.nopcommerce.com";
	public String username="admin@yourstore.com";
	public String pwd ="admin";
	public static WebDriver driver;
	
	public static Logger logger;
	
	@BeforeClass
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver","C://Users//Harsath Aarya//eclipse-workspace//nopcommerce//Driver//chromedriver.exe");
		driver= new ChromeDriver();
		
		logger = Logger.getLogger("Tc_LoginTest_001.java");
		PropertyConfigurator.configure("Log4j.properties");
		
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}

}
