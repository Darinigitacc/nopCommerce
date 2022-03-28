package com.nopcommerverce.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public WebDriver ldriver;

	public LoginPage(WebDriver rdriver)
	{
	ldriver=rdriver;	
	PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(id="Email")
	@CacheLookup
	WebElement txtEmail;
	
	@FindBy(id="Password")
	@CacheLookup
	WebElement txtPwd;
	
	@FindBy(xpath="/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button")
	@CacheLookup
	WebElement btnLogin;
	
	@FindBy(xpath="//*[@id=\"navbarText\"]/ul/li[3]/a")
	@CacheLookup
	WebElement lnklogout;
	
	
//	public void setuname(String username)
//	{
//		txtEmail.sendKeys(username);
//	}
//	
//	public void setpassword(String pwd)
//	{
//		txtPwd.sendKeys(pwd);
//	}
	
	public void clklogin()
	{
		btnLogin.click();
	}
	
	public void clklogout()
	{
		lnklogout.click();
	}
}
