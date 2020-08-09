package testNGPrograms;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class EnquiryTest {
  @Test
  public void getStatement() {
	  System.out.println("StatementTest....(EnquireTest--TestSet1");
  }
  
  @AfterTest
  public void AT() {
	  System.out.println("Script after TestSet1....");
  }
  
}
