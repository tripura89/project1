package poiprograms;

import org.testng.annotations.Test;
@Test
public class CreateCustomer extends Baseclass{
	
	public void testCreateCustomer()
	{
		OpenTaskPage otp=new OpenTaskPage();
		otp.clickOnProjectsAndCustomersLink();
		ActiveProjectsAndCustomersPage apacp=new ActiveProjectsAndCustomersPage();
		apacp.clickOnAddNewCustomerButton();
		AddNewCustomerPage ancp=new AddNewCustomerPage();
		ancp.enterCustomerName("111");
		ancp.clickOnCreateCustomerButton();
		String s=apacp.retriveSuccessMessage();
		System.out.println(s);
		}

}
