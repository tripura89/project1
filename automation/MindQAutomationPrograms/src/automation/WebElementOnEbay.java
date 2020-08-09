package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementOnEbay {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "C://drivers1/chromedriver.exe");
	        WebDriver driver=new ChromeDriver();
	        driver.get("http://www.ebay.com");
	        //1st way of creating webelement
	        WebElement txt=driver.findElement(By.id("gh-cat"));
	        txt.sendKeys("Baby");
	        WebElement btn=driver.findElement(By.id("gh-btn"));
	        btn.click(); 		
	        driver.findElement(By.id("gh-cat")).sendKeys("Cameras & Photo");
	        driver.findElement(By.id("gh-btn")).click();
   
	}

}
