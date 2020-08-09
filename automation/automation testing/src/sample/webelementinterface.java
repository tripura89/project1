package sample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class webelementinterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "c://drivers1/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://127.0.0.1:81/login.do");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		 driver.findElement(By.xpath("//input[@type='submit']")).click();
		 //whether button is enabled or not it'll display
		boolean t=driver.findElement(By.xpath("//input[@type='submit']")).isEnabled();
		System.out.println(t);
		//up to here
		//driver.findElement(By.linkText("Projects & Tasks")).click();
		driver.findElement(By.linkText("Projects & Customers")).click();
		driver.findElement(By.xpath("//input[@value='Add New Customer']")).click();
		driver.findElement(By.name("name")).sendKeys("shloka");
		driver.findElement(By.name("description")).sendKeys("automation testing");
		
		//It is button of create customer
		driver.findElement(By.name("createCustomerSubmit")).click();
		System.out.println("Button clicked");
		String s = driver.findElement(By.xpath("//input[@value='Add New Customer']")).getAttribute("value");
		System.out.println(s);
		//To get button name use this getAttribute(value) with String type and print it
	}

}
