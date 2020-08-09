package com.actitime.genericLib;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.google.common.io.Files;

public class MyListener extends BaseTest implements ITestListener {
	
	@Override
	public void onTestStart(ITestResult result) {
		Reporter.log(result.getName()+"method started",true);
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log(result.getName()+"method PASSED",true);
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
		Reporter.log(result.getName()+"method FAILED",true);
	
	TakesScreenshot ts=(TakesScreenshot)driver;
	File src=ts.getScreenshotAs(OutputType.FILE);
	File dest=new File("./screenshots/"+result.getName()+".png");
	try {
		Files.copy(src, dest);
	}catch(IOException e) {
		e.printStackTrace();
	}
	}
	
    @Override
    public void onTestSkipped(ITestResult result) {
    	Reporter.log(result.getName()+" method SKIPPED",true);
    }
    
    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
    	
    }
    
    @Override
    public void onStart(ITestContext context) 
    {
    	Reporter.log(context.getName()+" started",true);
    }
    
    @Override
    public void onFinish(ITestContext context)
    {
    	Reporter.log(context.getName()+" ended",true);
    		
    }
    
}
    
