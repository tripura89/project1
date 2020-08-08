package sample;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "c://drivers1/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://127.0.0.1:81/login.do");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.linkText("Reports")).click();
       WebElement w1 = driver.findElement(By.name("users"));
       Select s1=new Select(w1);
       s1.selectByIndex(0);
       s1.selectByIndex(1);
       s1.selectByIndex(2);
       Thread.sleep(1000);
       s1.deselectByIndex(0);
       s1.deselectByIndex(1);
       //how many fields in dropdown element (to get size)
       int i=s1.getOptions().size();
       System.out.println(i);
       boolean t=s1.isMultiple();
       if(t==true)
       {
    	   System.out.println("This is a multiselect dropdown");
       }
       else
       {
    	   System.out.println("This is a single select dropdown");
    	   
       }
       List<WebElement> a1 = s1.getOptions();
       for(int j=0;j<a1.size();j++)
       {
    	   String s = a1.get(j).getText();
    	   System.out.println(s);
       }
       }
	}


