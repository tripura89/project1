package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DifferentXpaths {

	public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver", "C://drivers1/chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().deleteAllCookies();
    driver.get("http://www.ebay.com");
    //Absolute xpath is not recommended
    //*[@id='headsearchbar']/div/div[2]/table/tbody/tr/td[2]/input
    
    
    //everytime we should use relative xpath for better performance
    //driver.findElement(By.xpath("//input[@class='gh-tb ui-autocomplete-input']")).sendKeys("java");
   //driver.findElement(By.xpath("//input[@placeholder='Search for anything']")).sendKeys("java");
   driver.findElement(By.xpath("//*[@id=\'gh-ac\']")).sendKeys("java"); 
   //this is actual xpath which is inspected and right click and copy from xpath
   
   
   //****xpath with contains()
  
   //dynamic xpath
   /* id=test_123
    By.id(test_123)
    after some action is done it'll change to 
    
    starts with
   id=test_456,
   id=test_789 
   
   
   ends with
   id=1234_test_t
   id=23456_test_t
   id=6789_test_t 
   
    so how to overcome this problem is*/
   //****** starts with
   //***** ends with
    
  /*Example
    driver.findElement(By.xpath("//input[contains(@id,'test_')]")).sendKeys("Test");
  
   driver.findElement(By.xpath("//input[starts-with(@id,'test_')]")).sendKeys("Test");
   driver.findElement(By.xpath("//input[ends-with(@id,'-test_t')]")).sendKeys("Test"); */
   
   //real custom path with link 
 // driver.findElement(By.xpath("//a[contains(text()='Saved')]")).click();
  // driver.findElement(By.xpath("//a[(text()='Electronics')]")).click();
  // driver.findElement(By.xpath("//*[@id=\'mainContent\']/div[1]/ul/li[2]/a")).click();
   //by linktext
   driver.findElement(By.linkText("Electronics")).click();
  
  
   
   
   
    
	}

}
