package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousehovering {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C://drivers1//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		//WebElement w1=driver.findElement(By.xpath("//input[@title='Women']"));
		/*WebElement w1=*/
		driver.findElement(By.linkText("Women")).click();
		System.out.println("link clicked");
		//Actions a1=new Actions(driver);
		//a1.moveToElement(w1).build().perform();
		Thread.sleep(1000);
		//driver.findElement(By.linkText("T-shirts")).click();

		
	}

}
