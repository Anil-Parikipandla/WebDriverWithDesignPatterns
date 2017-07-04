package com.epam.entities;

import com.epam.utils.Logger;

public class FlightFactory {
	
	public static FlightDetails createFlightWithEmptyDetails(){
		FlightDetails flight = new FlightDetails();
		flight.setOrigin("");
		flight.setDestination("");
		flight.setDepartureDate("");
		flight.setReturnDate("");
		flight.setAdults("");
		flight.setChildren(0);
		flight.setResultsPageHeader("");
		flight.setConnectionIn("");
		flight.setDepartingDateInResults("");
		flight.setReturningDateInResults("");
		Logger.printLogAs().info("Created flight with empty details");
		return flight;
	}
	
	public static FlightDetails createSimpleFlight(){
		FlightDetails flight = new FlightDetails();
		Logger.printLogAs().info("Created Simple flight with no details.");
		return flight;
	}
}
