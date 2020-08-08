package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonDropDown {
//git4 automation folder
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C://drivers1//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.amazon.com");
		//<span class=<"nav-line-1">Hello,Sign-in</span> copy xpath of this one i.e, sign in button
		driver.findElement(By.xpath("//*[@id=\'nav-link-accountList\']/span[1]")).click(); //hello sign in
        // Sign in button
		Thread.sleep(2000);
		//textfield
		driver.findElement(By.name("email")).sendKeys("tripura63@gmail.com");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys("Indamz2019$");
		driver.findElement(By.id("signInSubmit")).click();
		//dropdown xpath;
		WebElement dpdn = driver.findElement(By.xpath("//*[@id=\'nav-link-accountList\']/span[2]/span"));
		Actions a1=new Actions(driver);
		a1.moveToElement(dpdn).build().perform();
		//signout xpath
		driver.findElement(By.xpath("//span[text()='Sign Out']")).click();

	}

}
