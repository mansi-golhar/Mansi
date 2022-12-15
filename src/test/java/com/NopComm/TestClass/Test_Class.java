package com.NopComm.TestClass;


import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.NopCom.BaseClass.Base_Class_BL;
import com.NopCom.POMClasses.DashBoard;
import com.NopCom.POMClasses.Login_Page;

public class Test_Class extends Base_Class_BL
{

	Login_Page lp ;
	  DashBoard logoV;
	 
	@BeforeClass
	public void BrowerLaunch() throws EncryptedDocumentException, IOException, InterruptedException
	{
		 BrowserLaunch();
		 lp = new  Login_Page(driver);
		  logoV = new DashBoard(driver);
	}
	@Test(priority=1)
	public void Title() throws EncryptedDocumentException, IOException, InterruptedException
	{
		
		String ActR = driver.getTitle();
		String expect = lp.TitleV();
		 Assert.assertEquals(ActR, expect);
		 
	}
	@Test(priority=2)
	public void CheckB() throws EncryptedDocumentException, IOException, InterruptedException
	{
		 lp.CheckBox();
		 
	}
	@Test(priority=3)
	public void login() throws EncryptedDocumentException, IOException, InterruptedException
	{
		 lp.userid();
		 
		 lp.password();
		 
		 lp.enter();
		 
	 }
	@Test(dependsOnMethods="login")
	 public void logo() throws EncryptedDocumentException, IOException, InterruptedException
		 {
		 	logoV.logo(driver);
		 	
		 }
//	@Test
//	public void CheckDB()
//	{
//		logoV.DashBo();
//		logoV.DashBoa();
//	}
	@AfterClass
	 public void BC()
		 {
		 	driver.close();
		 }
		}
		
		
	

