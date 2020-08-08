package automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Implicit_Wait {

	public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver","C://drivers1//chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("http://www.google.com");
    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
    driver.findElement(By.name("q")).sendKeys("Selenium web driver");
    Actions a=new Actions(driver);
    a.sendKeys(Keys.ENTER).build().perform();
    //driver.findElement(By.xpath("//*[@id=\'hdtb-msb-vis\']/div[2]/a")).click(); this is correct one
    driver.findElement(By.xpath("gggggggg")).click();
    
	}

}
