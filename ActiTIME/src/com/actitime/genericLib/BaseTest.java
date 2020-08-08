package com.actitime.genericLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
//git5 actitime
//Avoids repeatative tasks like open browser and close browser
public class BaseTest implements IAutoConstants{
	
	public static WebDriver driver;
	@BeforeClass
	public void openBrowser() throws Throwable{
		FileLib flib=new FileLib();
		String browserValue=flib.getPropKeyValue(PROPERTY_PATH,"browser");
		if(browserValue.equalsIgnoreCase("chrome")) {
			System.setProperty(CHROME_KEY, CHROME_VALUE);
			driver=new ChromeDriver();
		}
		else if(browserValue.equalsIgnoreCase("firefox")) {
			System.setProperty("GECKO_KEY", "GECKO_VALUE");
			driver=new FirefoxDriver();
		}
		else {
			System.out.println("Please enter proper browser name");
		}
		
		driver.manage().window().maximize();
		String appUrl=flib.getPropKeyValue(PROPERTY_PATH,"url");
		driver.get(appUrl);
		//verify LoginPage is Displayed
		WebDriverCommonLib wlib=new WebDriverCommonLib();
		wlib.verifyPage(wlib.getPageTitle(),flib.getPropKeyValue(PROPERTY_PATH,"loginTitle"), "LoginPage");
	}
	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}
	}
			
			