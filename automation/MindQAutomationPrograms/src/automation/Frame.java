package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

	public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C://drivers1/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.qhmit.com/html/html_editors/scratchpad/?example=/javascript/examples/javascript_alert_box_onclick");
	    //driver.switchTo().frame("preview");
          driver.switchTo().frame(0);
	    //we can write according to frameindex, framename etc
	    Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@value='Click me']")).click();
        Thread.sleep(2000);
        System.out.println("Button is clicked");
        driver.switchTo().alert().accept(); //this is for ok button
        driver.switchTo().defaultContent();
        driver.findElement(By.xpath("//button[@title='Refreshes the result in the preview pane.']")).click();
        System.out.println("Run Button is clicked");
	}
	

}
