package automation;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {

	public static void main(String[] args) {
      System.setProperty("webdriver.chrome.driver","C://drivers1/chromedriver.exe");
      ChromeDriver driver=new ChromeDriver();
      driver.get("https://www.ebay.com");
      String title = driver.getTitle();
      System.out.println(title);
      
  //title variable gets address from getTitle() so title variable is of local variable String.
      //output:Electronics, Cars, Fashion, Collectibles & More | eBay

	}

}
