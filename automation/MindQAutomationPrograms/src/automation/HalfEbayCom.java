package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HalfEbayCom {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C://drivers1/ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://scgi.half.ebay.com/ws/eBayISAPI.dll?RegisterEnterInfo&usage=2943&ru=");
		driver.findElement(By.name("firstname")).sendKeys("Tripura");
		driver.findElement(By.cssSelector("#lastname")).sendKeys("Duggirala");
		driver.findElement(By.id("address1")).sendKeys("Beside sivalayam, nizam pet");	
		driver.findElement(By.id("address2")).sendKeys("Dno:10/288");
		driver.findElement(By.name("city")).sendKeys("Machilipatnam");
	    Select s1=new Select(driver.findElement(By.name("state")));
	   s1.selectByIndex(1);
	   s1.selectByVisibleText("California");
	   driver.findElement(By.id("zip")).sendKeys("95630");
	   driver.findElement(By.cssSelector("#dayphone1")).sendKeys("807");
	   driver.findElement(By.name("dayphone2")).sendKeys("409");
	   driver.findElement(By.name("dayphone3")).sendKeys("6727");
	   driver.findElement(By.name("dayphone4")).sendKeys("+91");
	   driver.findElement(By.xpath("//*[@id=\'email\']")).sendKeys("tripura63@gmail.com");
	   driver.findElement(By.cssSelector("#retype_email")).sendKeys("Wonderful@2023");
	   driver.findElement(By.name("userid")).sendKeys("tripura@ebay2020");
	   driver.findElement(By.name("pass")).sendKeys("Shopping@ebay");
	   driver.findElement(By.name("rpass")).sendKeys("Shopping@ebay");
	   Select s2=new Select(driver.findElement(By.name("canned")));  //drop down control
	   s2.selectByVisibleText("What is your pet's name?");    //selecting a value by visible text
	   driver.findElement(By.name("myanswer")).sendKeys("My pet name is snoopy");
	   Select s3=new Select(driver.findElement(By.name("birthdate2")));
	   s3.selectByIndex(5);      //month selection
	   //s3.selectByVisibleText(");
	   Select s4=new Select(driver.findElement(By.id("birthdate1")));// date selection
	   s4.selectByValue("23");
	   Select s5=new Select(driver.findElement(By.id("birthdate3")));
	   s5.selectByVisibleText("1989");  //year selection
	  //driver.findElement(By.id("acceptq1")).click();//checkbox by name is working so i used by id
	  WebElement checkboxsel = driver.findElement(By.id("acceptq1"));
	  for(int i=0;i<1;i++)
		  checkboxsel.click();
	   System.out.println(checkboxsel.isSelected());
	  // driver.findElement((By.xpath("//*[@id=\'continue\']/span/span"))).click();//button by xpath
	   WebElement buttonsel = driver.findElement(By.xpath("//*[@id=\'continue\']/span/span"));
	   for(int j=0;j<1;j++)
	        buttonsel.click();
	   System.out.println(buttonsel.isSelected());
	   
	   
	   
	
	}

}
