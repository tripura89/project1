package com.flipkart.men;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
//tripura git2
public class Test1 {
	
	@Test
	public void runTest() {
		
		Reporter.log("This is men module in        flipkart",true);
	    new ChromeDriver();
	}

}
