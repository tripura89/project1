package automation;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popupwindow {

	public static void main(String[] args) {
      System.setProperty("webdriver.chrome.driver", "C:/drivers1/chromedriver.exe");
      WebDriver driver=new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("http://www.naukri.com");
     // printing pop windows using for each loop
      Set<String> childadd = driver.getWindowHandles();
    		  for(String id : childadd)
    		  {
    				  System.out.println(driver.getTitle()); 
    			  
    		  }
    		  
    		  /*output:
    		  Jobs - Recruitment - Job Search - Employment - Job Vacancies - Naukri.com
    		  Jobs - Recruitment - Job Search - Employment - Job Vacancies - Naukri.com
    		  Jobs - Recruitment - Job Search - Employment - Job Vacancies - Naukri.com
    		  Jobs - Recruitment - Job Search - Employment - Job Vacancies - Naukri.com*/

      
      
	}

}
