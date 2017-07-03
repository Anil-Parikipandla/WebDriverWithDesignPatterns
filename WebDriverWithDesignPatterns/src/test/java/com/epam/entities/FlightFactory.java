package com.epam.entities;

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
		return flight;
	}
	
	public static FlightDetails createSimpleFlight(){
		FlightDetails flight = new FlightDetails();
		return flight;
	}
}
