package testNGPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AmazonLGTest {
  @Test
  public void AmazonSearch() {
	  System.setProperty("webdriver.chrome.driver","C://drivers1//chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.amazon.com");
	  
	  
	  Reporter.log("Amazon search is successful",true);
	  
	  
	  
  }
}
