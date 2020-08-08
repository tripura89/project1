package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrl {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://drivers1/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.w3schools.com");
		String cuurl = driver.getCurrentUrl();
		System.out.println(cuurl);
		
		
		//gets the address from getCurretnUrl() which we have stored in cuurl and is of String type
		//output: https://www.w3schools.com/

       
	}

}
