package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenPopup1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://drivers1//chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.get("http://127.0.0.1:81/login.do");
		   driver.findElement(By.name("username")).sendKeys("admin");
		   driver.findElement(By.name("pwd")).sendKeys("manager");
		   driver.findElement(By.xpath("//input[@type='submit']")).click();
		   driver.findElement(By.linkText("Projects & Customers")).click();
		   driver.findElement(By.xpath("//input[@value='Add New Customer']")).click();
		   driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Java");
		   Thread.sleep(2000);
		   driver.findElement(By.linkText("Open Tasks")).click();
		   Thread.sleep(2000);
		   String s=driver.findElement(By.id("DiscardChangesButton")).getAttribute("value");
		   System.out.println(s);
		   String s1=driver.findElement(By.id("RemainOnThePageButton")).getAttribute("value");
		   System.out.println(s1);
		   driver.findElement(By.xpath("//input[@value='Cancel Customer Creation and Proceed']")).click();
           System.out.println("button is clicked");
	}

}
