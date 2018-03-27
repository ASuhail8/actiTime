package com.actiTime.tests;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actiTime.generic.BaseTest;
import com.actiTime.generic.ExcelData;
import com.actiTime.pages.EnterTimeTrackPage;
import com.actiTime.pages.LoginPage;

@Listeners(com.actiTime.generic.ListenersTest.class)
public class validloginlogoutTest extends BaseTest
{
	
@Test
public void Testloginlogout() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
{
	

String un = ExcelData.getData(input_path, "Login", 1, 0);
String pwd = ExcelData.getData(input_path, "Login", 1, 1);
String lptitle = ExcelData.getData(input_path, "Login", 1, 2);
String epTitle = ExcelData.getData(input_path, "actiTIME - Enter Time-Track", 1, 0);

LoginPage lp = new LoginPage(driver);
EnterTimeTrackPage ep = new EnterTimeTrackPage(driver);

//verify title
lp.verifyingTitle(lptitle);

//enter username

lp.enterUserName(un);

//enter password

lp.enterPassword(pwd);

//click on login

lp.clickOnLogin();

//verify timetrack page

ep.verifyingTitle(epTitle);

//click on logout

ep.clickOnLogout();

//verify login title

//lp.verifyingTitle(lptitle);


}
}
