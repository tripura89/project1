package poiprograms;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MindqPageObjectModel {

	public static void main(String[] args) throws IOException {
      XSSFWorkbook wb=new XSSFWorkbook("D:\\New folder\\ApachePoiExcel\\Book1.xlsx");
      XSSFSheet ws=wb.getSheet("Sheet1");
      int rows=ws.getPhysicalNumberOfRows();
      
      System.setProperty("webdriver.chrome.driver","C://drivers1//chromedriver.exe");
 	 WebDriver driver=new ChromeDriver();
 	 driver.manage().window().maximize();
 	 driver.get("http://www.ebay.com");
 	 for(int i=1;i<rows;i++)
 	 {
 		 String ddvalue=ws.getRow(i).getCell(0).getStringCellValue();
 		 String txtvalue=ws.getRow(i).getCell(1).getStringCellValue();
 		WebElement dd=driver.findElement(By.id("gh-cat"));
 		Select s=new Select(dd);
 		s.selectByVisibleText(ddvalue);
 		WebElement txt= driver.findElement(By.id("gh-ac"));
 		txt.clear();
 		txt.sendKeys(txtvalue);
 		driver.findElement(By.id("gh-btn")).click();
 	 }
	}
 		
}
      
   