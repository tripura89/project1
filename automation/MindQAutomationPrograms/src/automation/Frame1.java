package automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/drivers1/chromedriver.exe");
	      WebDriver driver=new ChromeDriver();
	      driver.manage().window().maximize();  //maximize window
	      driver.manage().deleteAllCookies();   //delete all cookies
	      //dynamic wait or explicit wait
	      driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	      driver.get("http://www.freecrm.com/index.html");
	      driver.findElement(By.xpath("/html/body/div[1]/header/div/nav/div[2]/div/div[2]/ul/a/span[1]")).click();
	      driver.findElement(By.name("email")).sendKeys("naveenk");
	      driver.findElement(By.name("password")).sendKeys("test@123");
	      driver.findElement(By.xpath("//*[@id='ui']/div/div/form/div/div[3]")).click();
	      
	   // WebElement w1=new WebElement(
	    		//driver.findElement(By.xpath("/html/body/div[1]/header/div/nav/div[2]/div/div[2]/ul/li[3]/span"))
	    		
	
	}

}
