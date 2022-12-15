package com.NopCom.BaseClass;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.NopCom.UtilityClass.Uatility;

public class Base_Class_BL 
{
 public static WebDriver driver;
	public static void BrowserLaunch() throws IOException
	{
		String key = "webdriver.chrome.driver";
		String value = System.getProperty("user.dir")+"\\Software\\chromedriver.exe";
		System.setProperty(key,value);
		driver = new ChromeDriver();
		driver.get(Uatility.propertyfile("url"));//https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
	}
}
