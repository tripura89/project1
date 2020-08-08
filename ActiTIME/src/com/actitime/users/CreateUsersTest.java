package com.actitime.users;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.genericLib.BaseTest;
import com.actitime.genericLib.FileLib;
import com.actitime.genericLib.WebDriverCommonLib;
import com.actitime.pages.EnterTimeTrackPage;
import com.actitime.pages.UsersListPage;
import com.actitime.timetrack.ValidLoginTest;

@Listeners(com.actitime.genericLib.MyListener.class)
public class CreateUsersTest extends BaseTest {
	@Test
	public void CreateNewUser() throws Throwable
	{
		//login and verify
		ValidLoginTest v1=new ValidLoginTest();
		v1.validLogin();
	
 //Click on Users Tab
	EnterTimeTrackPage ettp=new EnterTimeTrackPage(driver);
	ettp.clickUsersTab();
	
	//verify users list page is displayed
	WebDriverCommonLib wlib=new WebDriverCommonLib();
	FileLib flib=new FileLib();
	wlib.verifyPage(wlib.getPageTitle(),flib.getPropKeyValue(PROPERTY_PATH, "usersTitle"), "Users List Page");
	
	//click on Add users Button
	UsersListPage ul=new UsersListPage(driver);
	ul.clickAddUserBtn();
	
	//verify AddUsers Page is Displayed
	wlib.elementDisplayed(ul.getAddUserBtn());
	
	String fn=flib.getCellData(EXCEL_PATH,"Users",0,1);
	String mn=flib.getCellData(EXCEL_PATH,"Users",1,1);
	String ln=flib.getCellData(EXCEL_PATH,"Users",2,1);
	String email=flib.getCellData(EXCEL_PATH,"Users",3,1);
	String un=flib.getCellData(EXCEL_PATH,"Users",4,1);
	String pw=flib.getCellData(EXCEL_PATH,"Users",5,1);
	String rePw=flib.getCellData(EXCEL_PATH,"Users",6,1);
	
	//create user by filling all the mandatory details
	ul.createUser(fn, mn, ln, email, un, pw, rePw);
	
	Thread.sleep(4000);
	//Verify the user is successfully created or not
	ul.getUsersText("Tripura");	
	}
}
	
