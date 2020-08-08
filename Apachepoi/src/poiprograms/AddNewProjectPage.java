package poiprograms;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddNewProjectPage {
	@FindBy(name="customerId")
	/*<select name="selectedCustomer" style="width: 300px">
	<option value="0" selected="selected">-- All active customers --</option> */
	private WebElement customerDropDown;
	
	@FindBy(name="name")
	private WebElement projectNameTextField;
	
	@FindBy(name="createProjectSubmit")
	private WebElement createProjectButton;
	
	//constructor
	public AddNewProjectPage()
	{
		PageFactory.initElements(Baseclass.driver,this);
		
	}
	public void selectCustomerFromDropDown(String customerName)
	{
		Select s1=new Select(customerDropDown);
		s1.selectByVisibleText(customerName);
}
	public void enterProjectName(String projectName)
	{
		projectNameTextField.sendKeys(projectName);
	}
	public void clickOnCreateProjectButton()
	{
		createProjectButton.click();
	}
	 
}
  

