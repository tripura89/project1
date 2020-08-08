package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigationcontrols {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://drivers1/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.gmail.com");
		driver.get("https://www.ebay.com");
		driver.navigate().back();
		//driver.close();
		driver.navigate().forward();
		driver.get("http://www.w3schools.com");
		driver.navigate().refresh();

	}

}
