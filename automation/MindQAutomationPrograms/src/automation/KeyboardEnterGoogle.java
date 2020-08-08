package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardEnterGoogle {

	public static void main(String[] args) {
     System.setProperty("webdriver.chrome.driver", "C://drivers1//chromedriver.exe");
     WebDriver driver=new ChromeDriver();
     driver.get("https://www.google.com/");
     driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Selenium Web Driver");
     Actions a=new Actions(driver);
    // a.sendKeys(Keys.ENTER).build().perform();  either way we can write
     a.sendKeys(Keys.ENTER);
     a.build().perform();
     
	}

}
