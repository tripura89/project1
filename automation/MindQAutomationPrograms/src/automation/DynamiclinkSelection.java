package automation;

import java.util.List;
import java.util.Scanner;
import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamiclinkSelection {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C://drivers1/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter specified link");
		String speclink = sc.nextLine();
		boolean isAvail=false;
		driver.get("http://www.ebay.com");
		List<WebElement> links = driver.findElements(By.tagName("a"));
	
	/* for (WebElement link :links)
	if((speclink.getText()).equalsIgnoreCase((links.getText()); we should not write this*/
		 for(WebElement link1: links)
		 {
			 if(link1.getText().equalsIgnoreCase(speclink));
			 {
			 isAvail=true;
			 link1.click();
			 break;
			 }
		 }
		 if(isAvail==false)
		 {
			 System.out.println("specified link is not available in the page");
			 driver.close();
		 }
		
		

	}

}
