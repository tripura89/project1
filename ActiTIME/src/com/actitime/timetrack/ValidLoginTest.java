package com.actitime.timetrack;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.genericLib.BaseTest;
import com.actitime.genericLib.FileLib;
import com.actitime.genericLib.WebDriverCommonLib;
import com.actitime.pages.LoginPage;


@Listeners(com.actitime.genericLib.MyListener.class)
public class ValidLoginTest extends BaseTest{
	@Test
	public void validLogin() throws Throwable {
		LoginPage lp=new LoginPage(driver);
		FileLib flib=new FileLib();
		lp.login(flib.getPropKeyValue(PROPERTY_PATH,"username"), flib.getPropKeyValue(PROPERTY_PATH, "password"));
		WebDriverCommonLib wlib=new WebDriverCommonLib();
		wlib.waitForPageTitle(flib.getPropKeyValue(PROPERTY_PATH, "homeTitle"));
		wlib.verifyPage(wlib.getPageTitle(),flib.getPropKeyValue(PROPERTY_PATH, "homeTitle"),"HomePage");
		Thread.sleep(4000);
	}

}
