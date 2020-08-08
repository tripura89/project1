package com.actitime.genericLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class WebDriverCommonLib extends BaseTest{
	
	public String getPageTitle()
	{
		String title=driver.getTitle();
		return title;
	}
	
	public void verifyPage(String actualPage, String expectedPage, String pageName)
	{
		Assert.assertEquals(actualPage, expectedPage);
		Reporter.log(pageName+ "is Displayed",true);
	}
	
	public void waitForPageTitle(String title)
	{
		WebDriverWait w=new WebDriverWait(driver,20);
		w.until(ExpectedConditions.titleIs(title));
	}
	
	public void waitForElementVisibility(WebElement element)
	{
		WebDriverWait w=new WebDriverWait(driver,20);
		w.until(ExpectedConditions.visibilityOf(element));
	}
	
	public void selectedOption(WebElement element, int index)
	{
		Select sel=new Select(element);
		sel.selectByIndex(index);
	}
	
	public void selectOption(WebElement element,String value)
	{
		Select sel=new Select(element);
		sel.selectByValue(value);
	}
	
	public void selectOption(String text, WebElement element)
	{
		Select sel=new Select(element);
		sel.selectByVisibleText(text);
	}
	
	public void frameSwitch(int index)
	{
		driver.switchTo().frame(index);
	}
	
	public void frameSwitch(String attributeValue)
	{
		driver.switchTo().frame(attributeValue);
	}
	
	public void frameSwitch(WebElement element)
	{
		driver.switchTo().frame(element);
	}
	
	public void mouseHover(WebElement element)
	{
		Actions a=new Actions(driver);
		a.moveToElement(element).perform();
	}
	public void elementDisplayed(WebElement element) {
		if(element.isDisplayed()) {
			Assert.assertTrue(true);
			Reporter.log(element.getText()+"is Displayed",true);
		}
		else {
			Reporter.log(element.getText()+"is not Displayed",true);
			Assert.assertTrue(false);
		}
	}
}	
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	

