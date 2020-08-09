package sample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardActions3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://drivers1/chromedriver.exe");
	      WebDriver driver=new ChromeDriver();
	      driver.get("http://127.0.0.1:81/login.do");
	      driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	      driver.findElement(By.name("username")).sendKeys("admin" +Keys.CONTROL+ "a" +"c");
	      //here they are copying selecting admin and copy
	      driver.findElement(By.name("pwd")).sendKeys(Keys.CONTROL + "v");
	      // paste the admin in password textbox
	      driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

}
