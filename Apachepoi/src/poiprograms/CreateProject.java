package poiprograms;

import org.testng.annotations.Test;

@Test
public class CreateProject extends Baseclass{
	
	public void testCreateProject() throws InterruptedException
	{
		OpenTaskPage otp=new OpenTaskPage();
		otp.clickOnProjectsAndCustomersLink();
		ActiveProjectsAndCustomersPage apacp=new ActiveProjectsAndCustomersPage();
		apacp.clickOnAddNewProjectButton();
		AddNewProjectPage anpp=new AddNewProjectPage();
		anpp.selectCustomerFromDropDown("Qspiderskphb");
		Thread.sleep(1000);
		anpp.enterProjectName("1st Project");
		Thread.sleep(1000);
		anpp.clickOnCreateProjectButton();
		String s=apacp.retriveSuccessMessage();
		System.out.println(s);
		
		
		
	}
}