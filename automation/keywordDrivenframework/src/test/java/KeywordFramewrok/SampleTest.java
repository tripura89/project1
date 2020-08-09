package KeywordFramewrok;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleTest 
{
  
	  public WebDriver driver;
	  @Test
	  public void MyTest() throws Exception
	  {
		  XSSFWorkbook wb=new XSSFWorkbook(System.getProperty("user.dir") + "//ExcelData//AmazonKeyword.xlsx");
		  XSSFSheet ws=wb.getSheet("Sheet1");
		  int rows=ws.getPhysicalNumberOfRows();
		  
		  for(int i=1;i<rows;i++)
		  {
			  String cTestCase=ws.getRow(i).getCell(0).getStringCellValue(); //for 1st iteration row--1  cell--0 null
			  String cLocType=ws.getRow(i).getCell(1).getStringCellValue();    //row--1 cell--1
			  String cLocValue=ws.getRow(i).getCell(2).getStringCellValue();   //row---1 cell--2
			  String cTestData=ws.getRow(i).getCell(3).getStringCellValue();  //row--1   cell--3 iterates all 1st row is completed
			  //cursor goes to 2nd row and its corresponding cell values
			  
			  
			  switch(cTestCase)
			  {
			  case "open_Browser":
				  if(cTestData.equalsIgnoreCase("Chrome"))
				  {
					  WebDriverManager.chromedriver().version("83").setup();
					  driver=new ChromeDriver();
				  }
				 
				 
				  driver.manage().window().maximize();
				  break;
				  
			  case "enter_Url":
				 driver.get(cTestData);
				  Thread.sleep(3000);
				  break;
				  
			  case "select_Dropdown":
			      WebElement dd=driver.findElement(LocatorInto(cLocType,cLocValue));
			      Select s=new Select(dd);
			      s.selectByVisibleText(cTestData);
			      break;
			      
			  case "enter_Text":
				  WebElement txt=driver.findElement(LocatorInto(cLocType,cLocValue));
				  txt.sendKeys(cTestData);
				  break;
			  case "click_Button":
				  WebElement btn=driver.findElement(LocatorInto(cLocType,cLocValue));
				  btn.click();
				  break;
				  }
			  }
		  }
	  
	  @Test
	  public By LocatorInto(String lType, String lValue)
	  {
		  By b=null;
		  switch(lType)
		  {
		    case "id":
			 b=By.id(lValue);
			 break;
		    case "name":
				 b=By.name(lValue);
				 break;
		    case "class":
				 b=By.className(lValue);
				 break;
		    case "xpath":
				 b=By.xpath(lValue);
				 break;
		    case "cssSelector":
				 b=By.cssSelector(lValue);
				 break;
		    case "linktext":
				 b=By.linkText(lValue);
				 break;
		    case "tagName":
				 b=By.tagName(lValue);
				 break;
		    case "partialLinkText":
				 b=By.partialLinkText(lValue);
				 break;
		  }
		  
		  return b;  		  
	  }
  }

