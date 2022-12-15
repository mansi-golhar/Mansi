package com.NopCom.POMClasses;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


import com.NopCom.UtilityClass.Uatility;

public class DashBoard 
{
	@FindBy (xpath="(//img[@alt='logo.png'])[2]") private WebElement logo;
//	@FindBy (xpath="(//li[@class='nav-item has-treeview'])[1]") private WebElement DashB;
//	@FindBy (xpath="(//li[@class='nav-item has-treeview'])[2]") private WebElement DashBp;
	
		
	public DashBoard(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void logo(WebDriver driver) throws EncryptedDocumentException, IOException
	{
	boolean	Expect= Uatility.BooleanV("Sheet2", 2, 5);
	boolean Act = logo.isDisplayed();
	Assert.assertEquals(Act, Expect);
	//this is my 2 comment 
	Uatility.ScreenShot(driver);
	}
//	public void DashBo()
//	{
//		DashB.click();
//	}
//	public void DashBoa()
//	{
//		DashBp.click();
//	}
}
