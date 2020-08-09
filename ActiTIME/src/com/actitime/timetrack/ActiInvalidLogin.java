package com.actitime.timetrack;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.genericLib.BaseTest;
import com.actitime.genericLib.FileLib;
import com.actitime.genericLib.WebDriverCommonLib;
import com.actitime.pages.LoginPage;


@Listeners(com.actitime.genericLib.MyListener.class)
public class ActiInvalidLogin extends BaseTest{
	@Test
	public void invalidLoginTest() throws Throwable{
		
		//Assert.fail(); To take picture of invalidlogin we use this assert method
		FileLib flib=new FileLib();
		int lastRowNum=flib.getRowCount(EXCEL_PATH, "Invalid");
		for(int i=1;i<=lastRowNum;i++)
		{
			WebDriverCommonLib wlib=new WebDriverCommonLib();
			//Input invalid username,invalid password and click login button
			LoginPage lp=new LoginPage(driver);
			lp.login(flib.getCellData(EXCEL_PATH, "Invalid", i, 0), flib.getCellData(EXCEL_PATH, "Invalid", i, 1));
			Thread.sleep(2000);
			wlib.waitForPageTitle(flib.getPropKeyValue(PROPERTY_PATH, "loginTitle"));
			wlib.verifyPage(wlib.getPageTitle(),flib.getPropKeyValue(PROPERTY_PATH, "loginTitle"),"LoginPage");
			Thread.sleep(2000);
			flib.setCellData(EXCEL_PATH, "Invalid", i, 2, "PASS");
			
		}
		
	}

}
