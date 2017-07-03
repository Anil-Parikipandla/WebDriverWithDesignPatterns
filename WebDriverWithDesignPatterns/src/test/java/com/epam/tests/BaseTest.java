package com.epam.tests;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.epam.listeners.CustomListeners;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;

import com.epam.drivers.EnhancedDriver;
import com.epam.pages.FlightSearchResultsPage;
import com.epam.pages.HomePage;

@Listeners(CustomListeners.class)
public class BaseTest {
	protected static final String APPLICATION_URL = "https://www.emirates.com/uk/english/";
	protected static final String EXPECTED_PAGE_TITLE = "Emirates flights – Book a flight, browse our flight offers and explore the Emirates Experience";
	protected static final String EXPECTED_FROM_CITY_NAME = "St Petersburg (LED)";
	protected static final String EXPECTED_TO_CITY_NAME = "Dubai (DXB)";
	protected static final String EXPECTED_DEPARTURE_DATE = "14.07.2017";
	protected static final String EXPECTED_RETURN_DATE = "15.07.2017";
	protected static final String EXPECTED_NO_OF_ADULTS = "1";
	protected static final int EXPECTED_NO_OF_CHILDREN = 1;
	protected static final String EXPECTED_SEARCH_RESULTS_PAGE_HEADER = "Make a booking";
	protected static final String EXPECTED_CONNECTION_IN = "via DME";
	protected static final String EXPECTED_DEPARTING_DATE = "14 July 2017";
	protected static final String EXPECTED_RETURNING_DATE = "15 July 2017";
	protected static final String EXPECTED_FIRST_OUTBOUND_FLIGHT_PRICES = "[55,009,64,349]";
	protected static final String EXPECTED_FIRST_RETURN_FLIGHT_PRICES = "[37,216,57,586,171,979]";

	protected static WebDriver driver;
	protected HomePage Homepage;
	protected FlightSearchResultsPage flight_Search_Results_Page;
	protected Logger log = LogManager.getLogger();
	
	
		@BeforeClass(description = "Start browser")
	public WebDriver start_Browser() {

		// initiate the Webdriver and open the browser
		if (null == driver) {
			System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
			DesiredCapabilities capabilities_chrome = DesiredCapabilities.chrome();
			driver = new EnhancedDriver(new ChromeDriver(capabilities_chrome));
		}
		return driver;

	}

	@BeforeClass(dependsOnMethods = "start_Browser", description = "Add implicit wait and maximize window")
	public void add_Implicit_Wait() {
		// set a certain implicit wait timeout
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Maximize browser window
		driver.manage().window().maximize();
	}

	@BeforeClass(dependsOnMethods = "add_Implicit_Wait", description = "create and return Homepage")
	public HomePage get_HomePage() {
		Homepage = new HomePage(driver);
		return Homepage;
	}

	@AfterTest
	public void closeBrowser() {
		if (null != driver) {
			driver.close();
			driver.quit();
			driver = null;
		}
	}
	
	public void goToURL(String url) {
		driver.get(url);
	}
	
	public static WebDriver getDriver(){
		return driver;
	}

}
