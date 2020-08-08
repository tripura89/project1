package programsTestNG;

import org.testng.annotations.Test;

public class PriorityTest {
	public class Sample
	{
		@Test(priority=3)
		public void testcc()
		{
			System.out.println("cc is executed");
			
		}
		@Test(priority=2)
		public void testbb()
		{
			System.out.println("bb is executed");
		}
		@Test(priority=1)
		public void testaa()
		{
			System.out.println("aa is executed");
		}
		//here user is giving priority manually
	}

}
