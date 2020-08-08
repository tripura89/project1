package automation;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClosingPopupWindows {

	public static void main(String[] args) {
//closing pop up windows and switching control to pop windows and switching it back to mainwindowtitle:
		 System.setProperty("webdriver.chrome.driver", "C:/drivers1/chromedriver.exe");
	      WebDriver driver=new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("http://www.naukri.com");
	     // printing pop windows using for each loop
	      String mt = driver.getTitle();
	      String mwindow=driver.getWindowHandle();
	      Set<String> popwindows = driver.getWindowHandles();	
	      for(String id : popwindows)
	      {
	    	  driver.switchTo().window(id);
	    	  if(!driver.getTitle().equalsIgnoreCase(mt))
	    	  {
	    		  driver.close();
	    		  
	    	  }
	    	  driver.switchTo().window(mwindow);
	    	  System.out.println(driver.getTitle()); 
	      }
		
	}

}
