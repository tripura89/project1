package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class MouseOperationDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C://drivers1//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.amazon.com");
		Thread.sleep(2000);
		//driver.findElement(By.className("nav-action-inner")).click(); //how come class name is not working
		driver.findElement(By.xpath("//*[@id=\'nav-link-accountList\']/span[1]")).click();//System xpath
	    // driver.findElement(By.xpath("//span[@class='nav-line-2']")).click(); //test engineer xpath nav=line-1 is Hello Sign in
		driver.findElement(By.name("email")).sendKeys("tripura63@gmail.com");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys("Indamz2019$");
		driver.findElement(By.className("a-button-input")).click();
		System.out.println("Button clicked");
		/*From dropdown selecting India and giving number
	      WebElement dpdn = driver.findElement(By.id("a-autoid-0-announce"));
	      Select s1=new Select(dpdn);
	      s1.selectByVisibleText("India +91");
	      //Entering number in text field
	      driver.findElement(By.xpath("//input[@name='mobilePhoneNumber']")).sendKeys("8074096727");
	      driver.findElement(By.xpath("//input[@type='submit']")).click();
	      System.out.println("Add mobile number clicked");*/
		  //mousehovering
		WebElement dpdn = driver.findElement(By.xpath("//*[@id=\'nav-link-accountList\']/span[2]/span"));
		//WebElement dpdn1=driver.findElement(By.className("nav-icon nav-arrow"));
		Actions a1=new Actions(driver);
		a1.moveToElement(dpdn).build().perform();
		driver.findElement(By.xpath("//span[text()='Sign Out']")).click();
		
	      
	}
	

}
