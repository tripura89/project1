package testNGPrograms;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TransTests {
  @Test
  public void Deposit() {
	  System.out.println("Deposit Test Script......(TransTests----TestSet2)");
  }
  
  @Test
  public void Withdraw()
  {
	  System.out.println("Withdraw Test Script.....(TransTests.....TestSet2)");
  }
  
  @BeforeMethod
  public void BM()
  {
	  System.out.println("Before Trans balance:");  
  }
  
  @AfterMethod
  public void AM()
  {
	  System.out.println("After Trans Balance:");
  }
  
  
}
