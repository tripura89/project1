package testNGPrograms;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class AdminTests {
  @Test
  public void createcustomer() {
	  System.out.println("Create Customer Tests----(AdminTests--TestSet2");
  }
  @Test
  public void removecustomer()
  {
	  System.out.println("Remove Customer Tests-----(AdminTest----TestSet2");
  }
  @BeforeSuite
  public void bs()
  {
	  System.out.println("Test suite exection is beginning");
  }
  @BeforeClass
  public void bc()
  {
	  System.out.println("Script before AdminTest Class");
	  
  }
  
  @AfterClass
  public void ac()
  {
	  System.out.println("Script after AdminTest Class");
  }
  
  
}
