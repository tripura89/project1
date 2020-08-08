package testNGPrograms;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UsingAsserts {
  @Test
  public void Function() {
	 System.out.println("Beginning....");
	 Assert.assertTrue(true);
	 System.out.println("Test1 is passed");
	 Assert.assertTrue(false);
	 System.out.println("Test2 is failed");
	 Assert.assertTrue(false);
	 System.out.println("Test3 is failed");
	 
	 
  }
}
