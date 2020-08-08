package automation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingPopUP {

	public static void main(String[] args) throws InterruptedException {
     //alerts which we are getting when we are not supposed to enter text in any field and press 
		//ok or go button
		System.setProperty("webdriver.chrome.driver", "C://drivers1/chromedriver.exe");
		WebDriver driver=new ChromeDriver();//Launching the chromedriver
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		//these are basically alerts or confirmation mails
		//with the fire bug we can't inspect or spy the popups
		driver.findElement(By.name("proceed")).click();   //this is for button clicking
		Thread.sleep(3000);
		Alert alert=driver.switchTo().alert(); //switchto.alert() gives you a predefined Alert class
		//which is from selenium wehave to import that in program store in a reference variable 'alert'
		//This is for transfering control main window to popupwindow
		System.out.println(alert.getText());
		//printing popup text otherthan ok and cancel buttons whatever the text present in confirmation popup
		alert.accept(); //clicks on ok button using the
		//alert.dismiss();//clicks on cancel button
		//To check whether alert text equals with text get in output
		String text=alert.getText();
		System.out.println(text);
		if(text.equals("Please enter a valid user name"))
		{
			System.out.println("correct alert message");
		}
		else
			{
				System.out.println("Incorrect alert message");
			}
		}
		
		
		
	}


