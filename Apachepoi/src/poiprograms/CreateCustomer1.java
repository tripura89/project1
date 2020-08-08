package poiprograms;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.poifs.crypt.Encryptor;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CreateCustomer1{

	@Test
	public void testCreateCustomer() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
	
		String url = ExcelOperation.readData("Sheet1",1,0);
		String un=ExcelOperation.readData("Sheet1",1,1);
		String psd=ExcelOperation.readData("Sheet1",1,2);
		String customername= ExcelOperation.readData("Sheet1",1,3);
		String exp= ExcelOperation.readData("Sheet1",1,4);
		//step2 writing the testing logic
		System.setProperty("webdriver.chrome.driver","C://drivers1//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get(url);
		driver.findElement(By.name("username")).sendKeys(un);
		driver.findElement(By.name("pwd")).sendKeys(psd);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Projects & Customers")).click();
		driver.findElement(By.xpath("//input[@value='Add New Customer']")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("name")).sendKeys(customername);
		Thread.sleep(1000);
		driver.findElement(By.name("createCustomerSubmit")).click();
		Thread.sleep(1000);
		String actResult = driver.findElement(By.className("successmsg")).getText();
		System.out.println(actResult);
		ExcelOperation.writeData("Sheet1",1,5,actResult);
		if(exp.equals(actResult))
		{
			ExcelOperation.writeData("Sheet1",1,6,"pass");
		}
		else
		{  
			ExcelOperation.writeData("Sheet1",1,6,"fail");
	    }
		Thread.sleep(1090);
	     driver.findElement(By.className("logoutImg")).click();
	     driver.close();
			
		}
		
		
	}
	
