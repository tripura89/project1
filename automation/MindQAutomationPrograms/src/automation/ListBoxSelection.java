package automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ListBoxSelection {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/drivers1/chromedriver.exe");
	      WebDriver driver=new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("https://jqueryui.com/selectable/");
	      driver.switchTo().frame(0);  //there is only one frame we have given index as 0
	      System.out.println("Control is in frame");
	      //listbox tag starts< ol> and options in list box are represented as <li>
	      // <ol id="selectable" class="ui-selectable">     </ol>
	    WebElement lsbx=driver.findElement(By.id("selectable"));
	          List<WebElement> items = lsbx.findElements(By.tagName("li"));
	          Actions a1=new Actions(driver);
	          a1.keyDown(Keys.CONTROL).click(items.get(0)).click(items.get(2)).click(items.get(4)).click(items.get(6)).build().perform();
	          
	          
	    
	
	}

}
