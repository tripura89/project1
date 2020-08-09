package testNGPrograms;

import org.testng.annotations.Test;

public class DisableTestDemo {
  @Test (priority=1)
  public void Login() {
	  
	  System.out.println("Login Test Script");
  }
  @Test (priority=5,enabled=false)
  public void LogOut()
  {
	  System.out.println("Sign out Test Script");
  }
  @Test (priority=2)
  public void Deposit()
  {
	  System.out.println("Deposit Test Script ");
  }
  @Test (priority=3)
  public void Withdraw()
  {
	 System.out.println("Withdraw Test script"); 
  }
  
 @Test (priority=4)
 public void Balance()
 {
	 System.out.println("Balance Test script");
	 
 }
  }
  
  /*output:
   [RemoteTestNG] detected TestNG version 6.14.3
Login Test Script
Deposit Test Script 
Withdraw Test script
Balance Test script
PASSED: Login
PASSED: Deposit
PASSED: Withdraw
PASSED: Balance

===============================================
    Default test
    Tests run: 4, Failures: 0, Skips: 0
    
   */
   
  

