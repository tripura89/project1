package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindowPopUP {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://drivers1/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://html.com/input-type-file/");
		//driver.findElement(By.xpath("//*[@id=\'fileupload\']")).sendKeys("D://testFile.txt");
		//this is working but nextline was not working
		driver.findElement(By.name("fileupload")).sendKeys("E://Documents/Tripura Duggirala_Resume.docx");
			
	}

}
