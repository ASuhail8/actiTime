package com.actiTime.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actiTime.generic.BasePage;

public class EnterTimeTrackPage extends BasePage 
{

	@FindBy(xpath="//a[.='Logout']")
	private WebElement logoutBTN;
	
	


//init

public EnterTimeTrackPage(WebDriver driver)
{
	super(driver);
	PageFactory.initElements(driver, this);
}

//util

public void clickOnLogout()
{
	logoutBTN.click();
	
}


public void verifyingTitle(String eTitle)
{
	verifyTitle(eTitle);
}
}