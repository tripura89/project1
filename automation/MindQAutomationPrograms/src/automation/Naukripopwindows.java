package automation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukripopwindows {

	public static void main(String[] args) throws InterruptedException {
         System.setProperty("webdriver.chrome.driver","C://drivers1/chromedriver.exe");
         WebDriver driver=new ChromeDriver();
         driver.get("https://www.naukri.com");
         Thread.sleep(10000);
         driver.findElement(By.xpath("//*[@id=\'qsbClick\']/span[1]")).sendKeys("Testing");
         Alert alert=driver.switchTo().alert();
         alert.accept();
         driver.findElement(By.xpath("//*[@id=\'qsbClick\']/span[2]")).click();
         
	}

}
