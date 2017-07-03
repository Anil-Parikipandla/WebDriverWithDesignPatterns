package com.epam.drivers;

import java.util.List;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.internal.WrapsDriver;

public class EnhancedDriver implements WebDriver,WrapsDriver{
	protected WebDriver driver;
	private Logger log = LogManager.getRootLogger();
	
	public EnhancedDriver(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebDriver getWrappedDriver() {
		return driver;
	}

	public void get(String url) {
		driver.get(url);
	}

	public String getCurrentUrl() {
		return driver.getCurrentUrl();
	}

	public String getTitle() {
		return driver.getTitle();
	}

	public List<WebElement> findElements(By by) {
		log.trace("Searching for the "+by+" element.");
		return driver.findElements(by);
	}

	public WebElement findElement(By by) {
		log.trace("Searching for the "+by+"element.");
		return driver.findElement(by);
	}

	public String getPageSource() {
		return driver.getPageSource();
	}

	public void close() {
		driver.close();		
	}

	public void quit() {
		driver.quit();
	}

	public Set<String> getWindowHandles() {
		return driver.getWindowHandles();
	}

	public String getWindowHandle() {
		return driver.getWindowHandle();
	}

	public TargetLocator switchTo() {
		return driver.switchTo();
	}

	public Navigation navigate() {
		return driver.navigate();
	}

	public Options manage() {
		return driver.manage();
	}

}
