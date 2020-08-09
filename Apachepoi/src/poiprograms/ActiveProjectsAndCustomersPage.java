package poiprograms;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//git3 for apachepoi
public class ActiveProjectsAndCustomersPage {
	@FindBy(xpath="//input[@value='Add New Customer']")
     private WebElement addNewCustomerButton;
	@FindBy(className="successmsg")
	private WebElement successMessage;
	//This is for add new project
	@FindBy(xpath="//input[@value='Add New Project']")
	 private WebElement addNewProjectButton;
	
	public ActiveProjectsAndCustomersPage()
	{
		PageFactory.initElements(Baseclass.driver,this);
	}
	public void clickOnAddNewCustomerButton() 
	{
	    addNewCustomerButton.click();	
	}
	public String retriveSuccessMessage()
	{
		String s=successMessage.getText();
		return s;
		
	}
	//this is for add new project button()
	public void clickOnAddNewProjectButton()
	{
		addNewProjectButton.click();
	}
}
