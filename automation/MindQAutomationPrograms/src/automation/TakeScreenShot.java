package automation;

import java.io.File;

import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenShot {

	public static void main(String[] args) throws Exception {
		
     System.setProperty("webdriver.chrome.driver","C://drivers1//chromedriver.exe");
     WebDriver driver=new ChromeDriver();
     driver.get("http://www.ebay.com");
     File fsource = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
     File fdest=new File("D:\\New folder\\TakeaScreenShot\\errorpic.png");
     FileHandler.copy(fsource,fdest);
}
}