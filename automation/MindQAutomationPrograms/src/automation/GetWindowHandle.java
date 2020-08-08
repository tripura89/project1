package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://drivers1/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.w3schools.com");
		String whandle = driver.getWindowHandle();
		System.out.println(whandle);
	}

}
//output: display the address of current window