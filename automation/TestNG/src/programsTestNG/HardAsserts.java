package programsTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAsserts {
	
	@Test
	public void testSample()
	{
		//Assert.assertTrue(3==4);       here if it is hard asserts whether any statement is failed 
		//later on statements will not execute it is drawback of hard asserts  
		//System.out.println("First Statement Checked");
		Assert.assertTrue(2>1);
		System.out.println("Second statement checked");
		Assert.assertEquals("abc", "abc");
		System.out.println("3rd statement checked");
		Assert.assertEquals("actitime","actitime");
		System.out.println("4th statement is checked");
		Assert.assertEquals("actitime","actitime","actitime");
		System.out.println("5th statement is checked");
				
		
	}
	
	
	
	
	
	

}
