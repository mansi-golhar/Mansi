package com.NopCom.UtilityClass;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;


public class Uatility
{
	static Workbook WBF;
	public static String StringV(String SheetName, int Rownumber, int CellNumber) throws EncryptedDocumentException, IOException
	  {
	FileInputStream file = new FileInputStream("D:\\Aspire Eclips\\Selenium\\TestData\\File1.xlsx");
	WBF = WorkbookFactory.create(file);
	String data = WBF.getSheet(SheetName).getRow(Rownumber-1).getCell(CellNumber-1).getStringCellValue();
	return data;
	}
	public static boolean BooleanV(String SheetName, int Rowno, int Cellno) throws EncryptedDocumentException, IOException
	{	
//		FileInputStream file = new FileInputStream("D:\\Aspire Eclips\\Selenium\\TestData\\File1.xlsx");
//		WBF = WorkbookFactory.create(file);
	boolean Data = WBF.getSheet(SheetName).getRow(Rowno-1).getCell(Cellno-1).getBooleanCellValue();
	return Data;
	//my third command 
	
	}
	public static double NumbericV(String SheetName, int Rowno, int Cellno) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("D:\\Aspire Eclips\\Selenium\\TestData\\File1.xlsx");
		WBF=WorkbookFactory.create(file);
		double data = WBF.getSheet(SheetName).getRow(Rowno-1).getCell(Cellno-1).getNumericCellValue();
		return data;
	}
	public static void ScreenShot(WebDriver driver) throws IOException
	{
		
		TakesScreenshot TS= (TakesScreenshot)driver;
		File source = TS.getScreenshotAs(OutputType.FILE);
		Date d= new Date();
		String TimeStamp = d.toString().replace(":", "_").replace(" ","_");
		System.out.println(TimeStamp);
		File Distination = new  File(System.getProperty("user.dir")+"\\ScreenShot\\"+TimeStamp+".jpg");
		FileHandler.copy(source, Distination);
		
	}
	public static String propertyfile(String key) throws IOException
	{
		Properties prop= new Properties();
		FileInputStream propfile= new FileInputStream(System.getProperty("user.dir")+"\\NopPro.properties");
		prop.load(propfile);
		String value = prop.getProperty(key);
		 return value;
	}
}
