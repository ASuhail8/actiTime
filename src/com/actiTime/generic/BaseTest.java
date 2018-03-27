package com.actiTime.generic;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseTest implements AutoConst

{
	
	public static WebDriver driver;		
	
	@Parameters({"nodeURL","browserName","AppURL"})
	@BeforeMethod
	public void preCondition(String nodeURL,String browserName,String AppURL) throws MalformedURLException
	{		
	URL url = new URL(nodeURL);
	DesiredCapabilities dc = new DesiredCapabilities();
	dc.setBrowserName(browserName);
	RemoteWebDriver driver = new RemoteWebDriver(url,dc);
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 driver.get(AppURL);	
		
	}
	
	@AfterMethod
	public void postCondition()
	{
		driver.close();
	}
	
	
}
