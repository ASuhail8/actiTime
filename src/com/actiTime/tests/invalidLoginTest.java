package com.actiTime.tests;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actiTime.generic.BaseTest;
import com.actiTime.generic.ExcelData;
import com.actiTime.pages.LoginPage;

@Listeners(com.actiTime.generic.ListenersTest.class)
public class invalidLoginTest extends BaseTest
{

@Test
public void TestinvalidLogin() throws EncryptedDocumentException, InvalidFormatException, IOException
{
	String lptitle = ExcelData.getData(input_path, "Login", 1, 2);
	
	String un = ExcelData.getData(input_path, "login", 2, 0);
	
	String pwd = ExcelData.getData(input_path, "login", 2, 1);
	
	LoginPage lp = new LoginPage(driver);
	lp.verifyingTitle(lptitle);
	
	//enter username
	lp.enterUserName(un);
	
	//enter password
	
	lp.enterPassword(pwd);
	
	//click on login
	
	lp.clickOnLogin();
	
	//verify err msg
	
	lp.verifyErrMsg();
}
	
}
