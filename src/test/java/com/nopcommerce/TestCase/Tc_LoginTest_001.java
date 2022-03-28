package com.nopcommerce.TestCase;

import org.testng.Assert;
//import org.testng.Assert;
import org.testng.annotations.Test;

import com.nopcommerverce.PageObjects.LoginPage;

public class Tc_LoginTest_001 extends BaseClass{
	
	@Test
	public void Login() throws InterruptedException {
		driver.get(baseURL);
		
		logger.info("Opened the URL");
		LoginPage lp = new LoginPage(driver);
		Thread.sleep(3000);
		
		logger.info("Entered the credentials");
//		lp.setuname(username);
//		Thread.sleep(2000);
//		lp.setpassword(pwd);
//		Thread.sleep(2000);
		lp.clklogin();
		
		
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("arguments[0].click()","lnklogout");
//		
//		Thread.sleep(8000);
		//lp.clklogout();
		
		
		if (driver.getTitle().equals("admin-demo.nopcommerce.com/admin/"))
		{
			Thread.sleep(5000);
			lp.clklogout();
			Assert.assertTrue(true);
			
		}
		
		logger.info("Clicked Logout");
	}
		

		
	}


