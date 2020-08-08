package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartiallinkText {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C://drivers1/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com");
		String title = driver.getTitle();
		System.out.println(title);
		//if(title.equals("Electronics, Cars, Fashion, Collectibles & More | eBay"))
		if(title.equalsIgnoreCase("Electronics, Cars, Fashion, Collectibles & More | eBay"))
		{
        System.out.println("correct title is printed");
	}
		else
		{
			System.out.println("not a correct title");
		}

}
}
