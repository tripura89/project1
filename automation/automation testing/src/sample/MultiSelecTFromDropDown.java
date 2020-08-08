package sample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelecTFromDropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "c://drivers1/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://127.0.0.1:81/login.do");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.linkText("Reports")).click();
		//how to select values in drop down box
		 WebElement w1 = driver.findElement(By.name("firstGrouping"));
		 //if the source is giving <select>   take name="users  or dropdown control it is selecting and deselecting
		 //select> take webelement
		 Select s1=new Select(w1);
		 s1.selectByIndex(0);
	       s1.selectByIndex(1);
	       s1.selectByIndex(2);
	       s1.selectByValue("Project names");
	       //Thread.sleep(1000);
	      // s1.deselectByIndex(0);
	      // s1.deselectByIndex(1);
		 
		
	}

}
