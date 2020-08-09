package com.actitime.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	//storing all the page elements in one place is called element repository
			//declaration
			@FindBy(name="username") private WebElement untb;
			//utilization
			//Address returning methods
			public WebElement getUntb() {
				return untb;
			}
			
			//Action performing methods
			public void setUntb(String un) {
				untb.sendKeys(un);
			}
			
			@FindBy(name="pwd") private WebElement pwtb;
			public WebElement getPwtb() {
				return pwtb;
			}
			 
			public void setPwtb(String pw) {
				pwtb.sendKeys(pw);
			}
			
			@FindBy(xpath="//div[.='Login ']") private WebElement loginBtn;
			public WebElement getLoginBtn()
			{
				return loginBtn;
			}
			public void clickLoginBtn()
			{
				loginBtn.click();
			}
			public void login(String un, String pw)
			{
				untb.sendKeys(un);
				pwtb.sendKeys(pw);
				loginBtn.click();
			}
			//Initialization
			public LoginPage(WebDriver driver)
			{
				PageFactory.initElements(driver, this);
				}


}
