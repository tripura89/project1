package poiprograms;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNewCustomerPage {
	@FindBy(name="name")     //special annotation used here to represent attribute name and value
	private WebElement customerNameTextField; //WebElement=variables
	@FindBy(name="createCustomerSubmit")
	private WebElement createCustomerSubmitButton;
	
	//using constructor only we can run this program
	public AddNewCustomerPage()
	{
		PageFactory.initElements(Baseclass.driver, this); //PageFactory is a  class and it is static and 
		//initElements is a method is used to initiate non static variables as well as static variable
		//this indicates present class
	}
	public void enterCustomerName(String customername)
	{
		customerNameTextField.sendKeys(customername);
	}
	public void clickOnCreateCustomerButton()
	{
		createCustomerSubmitButton.click();
	}
	
		
	}
	

