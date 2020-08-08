package sample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardActions2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://drivers1//chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://127.0.0.1:81/login.do");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.findElement(By.name("username")).sendKeys("admin" +Keys.TAB + "manager" + Keys.ENTER);
	}
} 