package com.epam.listeners;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.epam.tests.BaseTest;
import com.epam.utils.Logger;

public class CustomListeners implements ITestListener,ISuiteListener,IInvokedMethodListener{
	
	@Override
	public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ISuite suite) {
		Logger.printLogAs().info("Started executing the Suite:"+suite.getName());
		
	}

	@Override
	public void onFinish(ISuite suite) {
		Logger.printLogAs().info("Completed execution of the Suite: " +suite.getName());
	}

	@Override
	public void onTestStart(ITestResult result) {
		Logger.printLogAs().info("Started executing the Test: "+result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		Logger.printLogAs().info("Succesfully completed the Test: "+result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		Logger.printLogAs().info("Failed while exeuting the Test: "+ result.getName());
		Logger.printLogAs().info("Taking Screenshot");
		takeScreenshot(result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}
	
	public void takeScreenshot(String methodName) {
//		EnhancedDriver driver = new EnhancedDriver(BaseTest.getDriver());
		File screenCapture = ((TakesScreenshot)BaseTest.originalDriver()).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screenCapture, new File(".//target/screenshots/" + methodName + "screenshot.png"));
			Logger.printLogAs().info("Screenshot Captured!");
		} catch (IOException e) {
			Logger.printLogAs().info("Failed to save screenshot: " + e.getLocalizedMessage());
		}
	}

}
