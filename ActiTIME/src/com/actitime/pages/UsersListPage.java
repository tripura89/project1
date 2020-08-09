package com.actitime.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class UsersListPage {
	
	@FindBy(id="userDataLightBox_firstNameField") private WebElement firstNameTB;
	@FindBy(id="userDataLightBox_middleNameField") private WebElement middleNameTB;
	@FindBy(id="userDataLightBox_lastNameField") private WebElement lastNameTB;
	@FindBy(id="userDataLightBox_emailField") private WebElement emailTB;
	@FindBy(id="userDataLightBox_usernameField") private WebElement userNameTB;
	@FindBy(id="userDataLightBox_passwordField") private WebElement passwordTB;
	@FindBy(id="userDataLightBox_passwordCopyField") private WebElement retypePasswordTB;
	@FindBy(xpath="//span[.='Create User']") private WebElement createUserBtn;
	
	public WebElement getFirstNameTB() {
		return firstNameTB;
	}
	public WebElement getMiddleNameTB() {
		return middleNameTB;
	}
	public WebElement getLastNameTB() {
		return lastNameTB;
	}
	public WebElement getEmailTB() {
		return emailTB;
	}
	public WebElement getUserNameTB() {
		return userNameTB;
	}
	public WebElement getPasswordTB() {
		return passwordTB;
	}
	public WebElement getRetypePasswordTB() {
		return retypePasswordTB;
	}
	public WebElement getCreateUserBtn() {
		return createUserBtn;
	}
	
	//setter methods might become a bit longer code so we can optimize like these below one
	public void createUser(String fn, String mn, String ln, String email, String un, String pw,String rePw)
	{
		firstNameTB.sendKeys(fn);
		middleNameTB.sendKeys(mn);
		lastNameTB.sendKeys(ln);
		emailTB.sendKeys(email);
		userNameTB.sendKeys(un);
		passwordTB.sendKeys(pw);
		retypePasswordTB.sendKeys(rePw);
		createUserBtn.click();
	}
	
	
	@FindBy(xpath="//span[@class=['userNameSpan']") private List<WebElement> users;
	public List<WebElement> getUsers()
	{
		return users;
	}
	
	public void getUsersText(String expText)
	{
		for(int i=0;i<users.size();i++)
		{
			String text=users.get(i).getText();
			if(text.contains(expText))
			{
				Assert.assertTrue(true);
				Reporter.log("User is Successfully created and displayed in list of Users",true);
			}
			else
			{
				Reporter.log("User is not Successfully created and displayed in list of Users", true);
				Assert.assertTrue(false);
			
			}
		}
	}
	@FindBy(xpath="//div[.='Add User' and @class='buttonText']") private WebElement addUserBtn;
	
	public WebElement getAddUserBtn()
	{
		return addUserBtn;
	}
	public void clickAddUserBtn()
	{
		addUserBtn.click();
	}
	
	//To get Add User Text i.e; Add User Heading
	@FindBy(id="userDataLightbox_titlePlaceholder") private WebElement addUserText;
	public WebElement getAddUserText() {
		return addUserText;
	}
	public String getTextAddUserText()
	{
		return addUserText.getText();
	}
	public UsersListPage(WebDriver driver) {
	  
		PageFactory.initElements(driver,this);
	}	
		
	}
	
