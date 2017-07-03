package com.epam.listeners;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
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

public class CustomListeners implements ITestListener,ISuiteListener,IInvokedMethodListener{
	private Logger log = LogManager.getRootLogger();
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
		log.info("Started executing the Suite:"+suite.getName());
		
	}

	@Override
	public void onFinish(ISuite suite) {
		log.info("Completed execution of the Suite: " +suite.getName());
	}

	@Override
	public void onTestStart(ITestResult result) {
		log.info("Started executing the Test: "+result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		log.info("Succesfully completed the Test: "+result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		log.info("Failed while exeuting the Test: "+ result.getName());
		log.info("Taking Screenshot");
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
		File screenCapture = ((TakesScreenshot)BaseTest.getDriver()).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screenCapture, new File(".//target/screenshots/" + methodName + "screenshot.png"));
			log.info("Screenshot Captured!");
		} catch (IOException e) {
			log.info("Failed to save screenshot: " + e.getLocalizedMessage());
		}
	}

}
