package com.epam.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    protected WebDriver webDriver;
    protected Logger log = LogManager.getRootLogger();
    
    public BasePage(WebDriver webDriver)
    {
            this.webDriver = webDriver;
            PageFactory.initElements(this.webDriver, this);
    }

    public WebDriver getDriver()
    {
            return this.webDriver;
    }

    public Boolean isElementPresent(By locator)
    {
            return webDriver.findElements(locator).size() > 0;
    }

}
