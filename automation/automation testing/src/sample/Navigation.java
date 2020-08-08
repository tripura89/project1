package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\drivers1/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.ebay.com");
        driver.get("https://www.flipkart.com");
        driver.navigate().forward();
        driver.get("https://www.amazon.com");
        driver.navigate().back();
        driver.navigate().to("https://www.myntra.com");
        String s=driver.getCurrentUrl();
        System.out.print(s);
        //driver.navigate().wait();
        driver.get("https://www.nykaa.com");
        driver.navigate().refresh();
        driver.get("https://www.nykaa.com");
        String s1=driver.getCurrentUrl();
        System.out.println(s1);

	}

}
