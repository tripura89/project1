package automation;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AttachFileInPCloud {

	public static void main(String[] args) throws AWTException {
     /* System.setProperty("webdriver.chrome.driver","C:/drivers1/chromedriver.exe");
      WebDriver driver=new ChromeDriver();*/
		System.setProperty("webdriver.gecko.driver","C:/drivers1/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
      driver.get("https://transfer.pcloud.com/");
     // driver.findElement(By.xpath("//span[text(),'Click here to add files']")).click(); xpath with text()
      ////*[@id="upload-form"]/div/div[2]/div/div[1]/div[2]/a/span/span-  this is chrome xpath
      driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/form/div/div[2]/div/div[1]/div[2]/a/span/span")).click();
     // this is firefox xpath 
      //for collection of String in a specified path we use specified java class "String selection"
      StringSelection str=new StringSelection("C:\\Users\\tripu\\Desktop\\installation folder\\SQL-ORACLE-DATABASE_10G\\database\\doc");
      Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
     //this statement toolkit is used for specified path in clipboard and in set contents of str
      
      Robot r=new Robot();
      r.keyPress(KeyEvent.VK_CONTROL);
      r.keyPress(KeyEvent.VK_V);
      r.keyRelease(KeyEvent.VK_V);
      r.keyRelease(KeyEvent.VK_CONTROL);
      r.keyPress(KeyEvent.VK_ENTER);
      
	}

}
