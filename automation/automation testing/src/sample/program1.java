package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://drivers1/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://127.0.0.1:81/login.do");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.linkText("Projects & Tasks")).click();
		WebElement w1 = driver.findElement(By.name("customerProject.shownCustomer"));
		Select s1=new Select(w1);
		boolean t = s1.isMultiple();
		if(t==true)
		{
			System.out.println("this is multiselect dropdown");
		}
		else
		{
			System.out.println("this is single dropdown");
		}
	}

}
