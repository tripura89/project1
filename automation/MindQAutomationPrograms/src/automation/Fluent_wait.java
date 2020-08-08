package automation;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class Fluent_wait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C://drivers1//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demos.telerik.com/aspnet-ajax/ajaxloadingpanel/functionality/explicit-show-hide/defaultcs.aspx");
        String beforesel=driver.findElement(By.id("ctl00_ContentPlaceholder1_Label1")).getText();
        System.out.println(beforesel);
        driver.findElement(By.linkText("25")).click();
        FluentWait w=new FluentWait(driver)
        		.withTimeout(Duration.ofSeconds(10))
        		.pollingEvery(Duration.ofSeconds(5))
        		.ignoring(NoSuchElementException.class);
        w.until(ExpectedConditions.invisibilityOfElementLocated(By.className("raDiv")));
         
        
        String aftersel=driver.findElement(By.xpath("//*[@id=\'ctl00_ContentPlaceholder1_RadCalendar1_Top\']/tbody/tr[4]/td[7]/a")).getText();
        //here it  is 
       System.out.println(aftersel);
        		
        		}

}
