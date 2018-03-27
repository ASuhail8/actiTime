package com.actiTime.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class BasePage 
{
	
	public static WebDriver driver;
	
	public BasePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	//To verify Title
	
	public static void verifyTitle(String eTitle)
	{
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		try {
		wait.until(ExpectedConditions.titleIs(eTitle));
		Reporter.log("Title iS matching "+eTitle,true);
		}
		catch(Exception e)
		{
		Reporter.log("Title not matching",true);
		Assert.fail();
		}
		
		
	}	//to verify element
		
		public static void verifyElement(WebElement element)
		{
			WebDriverWait wait = new WebDriverWait(driver,10);
			try {
			wait.until(ExpectedConditions.visibilityOf(element));
			Reporter.log("Element is present " +element.getText(),true);
			}
			catch(Exception e)
			{
				Reporter.log("Element is not present",true);
				Assert.fail();
			
			
			
		}
		
		
		
		
		
	}

}
