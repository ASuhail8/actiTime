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
public class verifyVersionTest extends BaseTest 
{

	
	@Test
	public void TestverifyVersion() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		String version = ExcelData.getData(input_path, "Login", 1, 3);
		
		LoginPage lp = new LoginPage(driver);
		lp.verifyVersion(version);
	}
}
