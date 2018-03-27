package com.actiTime.generic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Reporter;


public class ExcelData
{

	
	public static String getData(String path,String Sheet,int rn,int cn) throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		File file = new File(path);
		FileInputStream fis = new FileInputStream(file);
		Workbook wb = WorkbookFactory.create(fis);
		String data = wb.getSheet(Sheet).getRow(rn).getCell(cn).getStringCellValue().toString();
		return data;
	}
	
	//to get Row count
	
	public static int getRowCount(String path,String Sheet) throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		FileInputStream fis = new FileInputStream(new File(path));
		Workbook wb = WorkbookFactory.create(fis);
		int rn = wb.getSheet(Sheet).getLastRowNum();
		return rn;
	}
	
	public static short getCellCount(String path,String Sheet,int rn) throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		FileInputStream fis = new FileInputStream(new File(path));
		Workbook wb = WorkbookFactory.create(fis);
		short cn = wb.getSheet(Sheet).getRow(rn).getLastCellNum();
		return cn;
		
		
		
	}
	
	

}