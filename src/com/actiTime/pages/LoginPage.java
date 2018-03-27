package com.actiTime.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import com.actiTime.generic.BasePage;

import junit.framework.Assert;

public class LoginPage extends BasePage 
{
	
	@FindBy(id="username")
	private WebElement unTB;
	
	@FindBy(name="pwd")
	private WebElement pwdTB;
	
	@FindBy(xpath="//div[.='Login ']")
	private WebElement loginBTN;
	
	@FindBy(xpath="//span[contains(.,'invalid')]")
	private WebElement errMsg;
	
	@FindBy(xpath="//nobr[contains(.,'actiTIME 2017')]")
	private WebElement version;
	
	//initialization
	public LoginPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	//utilization
	
	public void enterUserName(String un)
	{
		unTB.sendKeys(un);
	}
	
	public void enterPassword(String pwd)
	{
		pwdTB.sendKeys(pwd);
	}
	
	public void clickOnLogin()
	{
		loginBTN.click();
	}
	
	public void verifyErrMsg()
	{
		verifyElement(errMsg);
		
	}
	
	public void verifyingTitle(String eTitle)
	{
		
		verifyTitle(eTitle);
	}
	
	public void verifyVersion(String eVersion)
	{
		
		Assert.assertEquals(version.getText(), eVersion);
		Reporter.log("version is matching",true);
		
	}

}