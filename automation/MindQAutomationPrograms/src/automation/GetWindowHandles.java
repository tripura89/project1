package automation;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandles {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://drivers1/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.w3schools.com");
		driver.get("http://www.facebook.com");
		driver.get("http://www.ebay.com");
		driver.get("http://www.nykaa.com");
		driver.get("http://www.amazon.com");
		driver.get("http://www.indubindu.com");
		Set<String> whandles = driver.getWindowHandles();
		for(String ids : whandles)	
		System.out.println(ids);	
		System.out.println(whandles);  
		//It is displaying only one window address which is 
		//-in last one*/
		System.out.println(whandles.size());
		System.out.println(whandles);
	}
}
	
	//output
	/*CDwindow-08A962C2A4759E47368B638500BFC071
	[CDwindow-08A962C2A4759E47368B638500BFC071]
	1
	[CDwindow-08A962C2A4759E47368B638500BFC071]*/



