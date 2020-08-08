package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectLGINAmazon {

	public static void main(String[] args) {
     System.setProperty("webdriver.chrome.driver","C://drivers1/chromedriver.exe");
     WebDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("http://www.amazon.com");
     driver.findElement(By.id("twotabsearchtextbox")).sendKeys("lg projector");
     driver.findElement(By.className("nav-input")).click();
     //for everything when we inspect and right click on any tag for this here <i with class> and</i>
     //we'll get xpath copy it and save it in a notepad replace " " with '' for String 
     driver.findElement(By.xpath("//*[@id='nav-hamburger-menu']/i")).click();
     driver.findElement(By.xpath("//*[@id=\'hmenu-content\']/ul[32]/li[2]/a/div")).click();
     driver.findElement(By.xpath("//*[@id=\'hmenu-content\']/ul[1]/li[1]/a")).click();
     //how to close drop down one when we open that drop down automatically
    // driver.findElement(By.xpath("//*[@id='nav-hamburger-menu']/i")).clear();;
     // menu bar
     //drop down conntrol
   /*WebElement w1=driver.findElement(By.className("hmenu-item hmenu-title"));
      Select s1=new Select(w1);
      s1.selectByIndex(1);*/
      //boolean t = driver.findElement(By.xpath("//*[@id=\'hmenu-content'\"]/ul[32]/li[3]/a")).isSelected();
     // System.out.println(t);
     //clicking on checkbo'/\
    
    //driver.findElement(By.xpath("//*[@id='p_89/ViewSonic']/span/a/div/label/i")).click();
     }
}
