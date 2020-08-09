package sample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popups {

	public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver","C://drivers1//chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("http://127.0.0.1:81/login.do");
    driver.findElement(By.name("username")).sendKeys("admin");
    driver.findElement(By.name("pwd")).sendKeys("manager");
    driver.findElement(By.xpath("//input[@type='submit']")).click();
    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
    driver.findElement(By.linkText("Projects & Customers")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//input[@value='Archive Selected Customers & Projects']")).click();
    Thread.sleep(2000);
    String s=driver.switchTo().alert().getText();
    System.out.println(s);
    int i=driver.switchTo().alert().hashCode();
    System.out.println(i);
    driver.switchTo().alert().dismiss();
   // driver.switchTo().alert().accept();
    
    
    
    
    
    
    
    
    
    
    
    /*output:
     
     Please select customers and / or projects to archive
       1045997582 */

     
    
    
	}
	

}
