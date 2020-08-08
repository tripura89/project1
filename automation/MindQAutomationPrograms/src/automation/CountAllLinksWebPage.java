package automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountAllLinksWebPage {

	public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver","C://drivers1/chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.ebay.com");
    List<WebElement> links = driver.findElements(By.tagName("a"));
    System.out.println("Total links are "+links.size());
    for(WebElement link : links)
    {
    	System.out.println(link.getText()); 
    }
}
}
/*//output:
Total links are 328

Advanced
Sign in
register
Daily Deals
Sell
Help & Contact
Watch List
My eBay
Saved
Electronics
Fashion
Health & Beauty
Motors
Collectibles

null*/
