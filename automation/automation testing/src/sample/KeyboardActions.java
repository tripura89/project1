package sample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardActions {

	public static void main(String[] args) throws InterruptedException {
      System.setProperty("webdriver.chrome.driver", "C://drivers1/chromedriver.exe");
      WebDriver driver=new ChromeDriver();
      driver.get("http://127.0.0.1:81/login.do");
      driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
      driver.findElement(By.name("username")).sendKeys("admin");
      Thread.sleep(2000);
      driver.findElement(By.name("pwd")).sendKeys("manager" +Keys.ENTER);
      
	}

}
