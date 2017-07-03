package com.epam.tests;

import java.util.ArrayList;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.epam.entities.FlightDetails;
import com.epam.entities.FlightFactory;
import com.epam.tests.BaseTest;

public class BookAFlight extends BaseTest{

		private static String ACTUAL_PAGE_TITLE = "";
		private static String ACTUAL_FROM_CITY_NAME = "";
		private static String ACTUAL_TO_CITY_NAME = "";
		private static String ACTUAL_NO_OF_ADULTS = "";
		private static int ACTUAL_NO_OF_CHILDREN = 1;
		private static String ACTUAL_SEARCH_RESULTS_PAGE_HEADER = "";
		private static String ACTUAL_DEPARTING_DATE = "";
		private static String ACTUAL_RETURNING_DATE = "";
		private static ArrayList<String> ACTUAL_FIRST_OUTBOUND_FLIGHT_PRICES = new ArrayList<String>();
		private static ArrayList<String> ACTUAL_FIRST_RETURN_FLIGHT_PRICES = new ArrayList<String>();

		private FlightDetails flight = FlightFactory.createSimpleFlight()
																	.withOrigin(EXPECTED_FROM_CITY_NAME)
																	.withDestination(EXPECTED_TO_CITY_NAME)
																	.withDepartureDate(EXPECTED_DEPARTURE_DATE)
																	.withRetrunDate(EXPECTED_RETURN_DATE)
																	.withNoOfAdults(EXPECTED_NO_OF_ADULTS)
																	.withNoOFChildren(EXPECTED_NO_OF_CHILDREN)
																	.withresultPageHeader(EXPECTED_SEARCH_RESULTS_PAGE_HEADER)
																	.withConnectionIn(EXPECTED_CONNECTION_IN)
																	.withDepartingDateInResults(EXPECTED_DEPARTING_DATE)
																	.withReturningDateInResults(EXPECTED_RETURNING_DATE)
																	.withFlightOutboundPrices(EXPECTED_FIRST_OUTBOUND_FLIGHT_PRICES)
																	.withFlightRetunrPrices(EXPECTED_FIRST_RETURN_FLIGHT_PRICES);
		
		
		@Test
		public void search_for_flights(){

			//verify Home page is opened successfully.
			goToURL(APPLICATION_URL);
			ACTUAL_PAGE_TITLE = driver.getTitle();
			Assert.assertEquals(ACTUAL_PAGE_TITLE, EXPECTED_PAGE_TITLE);

			Homepage.open_Flight_Booking_Window();
			Homepage.enter_Origin_And_Destination(flight.getOrigin(), flight.getDestination());
			
			//verify Origin is selected as expected.
			ACTUAL_FROM_CITY_NAME = Homepage.get_expected_from_city().getAttribute("value");
			Assert.assertEquals(ACTUAL_FROM_CITY_NAME, flight.getOrigin());
			
			//verify Destination is selected as expected.
			ACTUAL_TO_CITY_NAME = Homepage.get_expected_to_city().getAttribute("value");
			Assert.assertEquals(ACTUAL_TO_CITY_NAME, flight.getDestination());
			
			Homepage.select_Departure_and_returnDate(flight.getDepartureDate(), flight.getReturnDate());
			
			//verify No of Adults selected by default.
			ACTUAL_NO_OF_ADULTS = Homepage.get_no_of_Adults();
			Assert.assertEquals(ACTUAL_NO_OF_ADULTS, flight.getAdults());
			
			//verify no of children selected.
			Homepage.add_Children(ACTUAL_NO_OF_CHILDREN);
			Assert.assertEquals(ACTUAL_NO_OF_CHILDREN, flight.getChildren());

			flight_Search_Results_Page = Homepage.search_for_flights();
			
			//verify Search results page is opened successfully.
			ACTUAL_SEARCH_RESULTS_PAGE_HEADER = flight_Search_Results_Page.get_page_header().getText();
			Assert.assertEquals(ACTUAL_SEARCH_RESULTS_PAGE_HEADER, flight.getResultsPageHeader());
			
			//verify departing date.
			ACTUAL_DEPARTING_DATE = flight_Search_Results_Page.get_departing_date().getText().substring(10);
			Assert.assertEquals(ACTUAL_DEPARTING_DATE, flight.getDepartingDateInResults());
			
			//verify returning date.
			ACTUAL_RETURNING_DATE = flight_Search_Results_Page.get_returning_date().getText().substring(10);
			Assert.assertEquals(ACTUAL_RETURNING_DATE, flight.getReturningDateInResults());
			
			//verify the flight has connection to Moscow
			for(WebElement i : flight_Search_Results_Page.get_list_of_flights()){
				String List = i.getText();
				if(!List.isEmpty()){
				Assert.assertEquals(i.getText().substring(0, 7), flight.getConnectionIn());
				}
			}
			
			//verify the different prices available for Outbound
			ACTUAL_FIRST_OUTBOUND_FLIGHT_PRICES.addAll(flight_Search_Results_Page.get_Flight_Prices_Outbound());
			Assert.assertEquals(ACTUAL_FIRST_OUTBOUND_FLIGHT_PRICES.toString().replaceAll(" ", ""), EXPECTED_FIRST_OUTBOUND_FLIGHT_PRICES);
			
			//verify the different prices available for Return
			ACTUAL_FIRST_RETURN_FLIGHT_PRICES.addAll(flight_Search_Results_Page.get_Flight_Prices_return());
			Assert.assertEquals(ACTUAL_FIRST_RETURN_FLIGHT_PRICES.toString().replaceAll(" ", ""), EXPECTED_FIRST_RETURN_FLIGHT_PRICES);
			
		}

	}

