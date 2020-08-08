package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OnlineKeyBoardAction {

	public static void main(String[] args) {
     //System.setProperty("webdriver.chrome.driver", "C://drivers1/chrormedriver.exe");
		System.setProperty("webdriver.chrome.driver", "C://drivers1/chromedriver.exe");
     WebDriver driver=new ChromeDriver();
     driver.get("https://www.facebook.com/");
     //driver.findElement(By.id("email")).sendKeys("tripura63@gmail.com");
    // driver.findElement(By.id("pass")).sendKeys("nikihil63");
    // driver.findElement(By.id("loginbutton")).click();
     		
   driver.findElement(By.name("email")).sendKeys("tripura63@gmail.com" +Keys.TAB + "nikihil63" +Keys.ENTER);
	}

}
