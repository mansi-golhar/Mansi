package com.NopCom.POMClasses;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


import com.NopCom.UtilityClass.Uatility;

public class Login_Page
{
	@FindBy (xpath="//input[@type='checkbox']") private  WebElement CheckB;
	@FindBy (xpath="//input[@type='email']")private WebElement un;
	@FindBy (xpath="//input[@class='password']") private  WebElement pass;
	@FindBy (xpath="//button[@type='submit']") private WebElement login;
	
	public Login_Page (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
//login

	public String TitleV() throws EncryptedDocumentException, IOException
	{
		String expect = Uatility.StringV("Sheet2", 2, 1);
		return expect;
	}
	public void CheckBox () throws EncryptedDocumentException, IOException
	{	
		boolean Expect= Uatility.BooleanV("Sheet2", 2, 2);
	//	CheckB.click();
		boolean ActR = CheckB.isSelected();
		Assert.assertEquals(ActR, Expect);
	}
		public void userid() throws EncryptedDocumentException, IOException, InterruptedException
		{
			un.clear();
			un.sendKeys(Uatility.propertyfile("UI"));//OR(Uatility.StringV("Sheet2", 2, 3))
		
		}
		public void password() throws EncryptedDocumentException, IOException, InterruptedException
		{
			pass.clear();
			pass.sendKeys(Uatility.propertyfile("PWD"));//OR(Uatility.StringV("Sheet2", 2, 3))
		
		}
		public void enter() throws InterruptedException
		{
			login.click();
		}

		
	}
	
	


