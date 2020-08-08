package sample;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoaardRobotClass {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C://drivers1/chromedriver.exe");
	      WebDriver driver=new ChromeDriver();
	      driver.get("http://127.0.0.1:81/login.do");
	      driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	      driver.findElement(By.name("username")).sendKeys("admin"+Keys.TAB + "manager" + Keys.ENTER);
	      WebElement w1=driver.findElement(By.linkText("Projects & Customers"));
	      Actions a1=new Actions(driver);
	      Thread.sleep(5000);
	      a1.contextClick(w1).build().perform(); //This is for right click on projects and customer
	      Thread.sleep(2000);
	      Robot r1=new Robot();
	      r1.keyPress(KeyEvent.VK_DOWN); // 
	      Thread.sleep(5000);
	      r1.keyPress(KeyEvent.VK_UP);
	      Thread.sleep(5000);
	      r1.keyPress(KeyEvent.VK_ENTER);
	      
	      
	      
	      
	      
	      
	}

}
