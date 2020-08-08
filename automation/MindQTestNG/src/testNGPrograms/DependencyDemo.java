package testNGPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyDemo extends DriverFactory{
  @Test
  public void Search() {
	  driver.findElement(By.id("fakebox-input")).sendKeys("Selenium Web driver");
	  Actions a=new Actions(driver);
	  a.sendKeys(Keys.ENTER).build().perform();
  }	  
	/*  @Test
	  public void checkTitle()
	  {
	  String title=driver.getTitle();
	  Assert.assertEquals(title,"google");
	  
  }*/
}
