package com.qa.utility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.qa.testBase.TestBase;

public class ListenersSetup extends TestBase implements ITestListener {

	
	public void onTestStart(ITestResult result) {
		logger.info("Test Case Execution Started");
	}

	
	public void onTestSuccess(ITestResult result) {
		logger.info("Test Case Execution Completed");
	}

	
	public void onTestFailure(ITestResult result) {
		logger.info("Test Case Failed");
		UtilClass.getScreenshot(result.getName());
		logger.info("ScreenShot Taken");
	}

	
	public void onTestSkipped(ITestResult result) {
		
	}

	
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	
	public void onStart(ITestContext context) {
		
	}

	@Override
	public void onFinish(ITestContext context) {
		
	}

}
