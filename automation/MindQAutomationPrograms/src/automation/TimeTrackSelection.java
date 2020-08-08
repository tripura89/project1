package automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TimeTrackSelection {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C://drivers1/chromedriver.exe");
	      ChromeDriver driver=new ChromeDriver();
	      driver.get("http://127.0.0.1:81/login.do");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.findElement(By.name("username")).sendKeys("admin");
			driver.findElement(By.name("pwd")).sendKeys("manager");
			driver.findElement(By.xpath("//input[@type='submit']")).click();
            driver.findElement(By.linkText("Time-Track")).click();
            WebElement w1 = driver.findElement(By.name("selectedUser"));
            Select s1=new Select(w1);
    		s1.selectByIndex(1);
    		Thread.sleep(5000);
    		driver.findElement(By.xpath("//span[text(),'Mar, 2020']")).click();
    		
	}

}
