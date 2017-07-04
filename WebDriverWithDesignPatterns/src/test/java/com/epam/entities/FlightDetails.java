package com.epam.entities;

import com.epam.utils.Logger;

public class FlightDetails {
	private String Origin;
	private String Destination;
	private String DepartureDate;
	private String ReturnDate;
	private String Adults;
	private int Children;
	private String resultsPageHeader;
	private String connectionIn;
	private String departingDateInResults;
	private String returningDateInResults;
	private String flightOutboundPrices;
	private String flightReturnPrices;
	
	public FlightDetails(){
		
	}
	
	public FlightDetails(String Origin,String Destination, String DepartureDate, String ReturnDate, String Adults,
			int Children, String resultsPageHeader, String connectionIn, String departingDateInResults,String returningDateInResults ){
		
		this.Origin = Origin;
		this.Destination = Destination;
		this.DepartureDate = DepartureDate;
		this.ReturnDate = ReturnDate;
		this.Adults = Adults;
		this.Children = Children;
		this.resultsPageHeader = resultsPageHeader;
		this.connectionIn = connectionIn;
		this.departingDateInResults = departingDateInResults;
		this.returningDateInResults = resultsPageHeader; 
	}
	
	public FlightDetails withOrigin(String origin){
		setOrigin(origin);
		Logger.printLogAs().trace("Setting the Origin City/Country");
		return this;
	}
	
	public FlightDetails withDestination(String destination){
		setDestination(destination);
		Logger.printLogAs().trace("Setting the Destination City/Country");
		return this;
	}
	
	public FlightDetails withDepartureDate(String departureDate){
		setDepartureDate(departureDate);
		Logger.printLogAs().trace("Setting the Departure Date");
		return this;
	}
	
	public FlightDetails withRetrunDate(String returnDate){
		setReturnDate(returnDate);
		Logger.printLogAs().trace("Setting the Return Date");
		return this;
	}
	
	public FlightDetails withNoOfAdults(String adults){
		setAdults(adults);
		Logger.printLogAs().trace("Setting Number of Adults");
		return this;
	}
	
	public FlightDetails withNoOFChildren(int children){
		setChildren(children);
		Logger.printLogAs().trace("Setting Number of children");
		return this;
	}
	
	public FlightDetails withresultPageHeader(String header){
		setResultsPageHeader(header);
		Logger.printLogAs().trace("Setting the Expected pageHeader");
		return this;
	}
	
	public FlightDetails withConnectionIn(String connectioIn){
		setConnectionIn(connectioIn);
		Logger.printLogAs().trace("Setting the ConnectionIn value");
		return this;
	}
	
	public FlightDetails withDepartingDateInResults(String departingDate){
		setDepartingDateInResults(departingDate);
		Logger.printLogAs().trace("Setting the departing Date");
		return this;
	}
	
	public FlightDetails withReturningDateInResults(String returningDate){
		setReturningDateInResults(returningDate);
		Logger.printLogAs().trace("Setting the returning Date");
		return this;
	}
	
	public FlightDetails withFlightOutboundPrices(String pricesAsString){
		setFlightOutboundPrices(pricesAsString);
		Logger.printLogAs().trace("Setting the First Outbound Flight Prices as String");
		return this;
	}
	
	public FlightDetails withFlightRetunrPrices(String pricesAsString){
		setFlightReturnPrices(pricesAsString);
		Logger.printLogAs().trace("Setting the First Return Flight prices as String");
		return this;
	}
	
	
	public String getOrigin() {
		return Origin;
	}
	public void setOrigin(String from) {
		Origin = from;
	}
	public String getDestination() {
		return Destination;
	}
	public void setDestination(String to) {
		Destination = to;
	}
	public String getDepartureDate() {
		return DepartureDate;
	}
	public void setDepartureDate(String departureDate) {
		DepartureDate = departureDate;
	}
	public String getReturnDate() {
		return ReturnDate;
	}
	public void setReturnDate(String returnDate) {
		ReturnDate = returnDate;
	}

	public String getAdults() {
		return Adults;
	}

	public void setAdults(String adults) {
		Adults = adults;
	}

	public int getChildren() {
		return Children;
	}

	public void setChildren(int children) {
		Children = children;
	}

	public String getResultsPageHeader() {
		return resultsPageHeader;
	}

	public void setResultsPageHeader(String resultsPageHeader) {
		this.resultsPageHeader = resultsPageHeader;
	}

	public String getConnectionIn() {
		return connectionIn;
	}

	public void setConnectionIn(String connectionIn) {
		this.connectionIn = connectionIn;
	}

	public String getDepartingDateInResults() {
		return departingDateInResults;
	}

	public void setDepartingDateInResults(String departingDateInResults) {
		this.departingDateInResults = departingDateInResults;
	}

	public String getReturningDateInResults() {
		return returningDateInResults;
	}

	public void setReturningDateInResults(String returningDateInResults) {
		this.returningDateInResults = returningDateInResults;
	}

	public String getFlightOutboundPrices() {
		return flightOutboundPrices;
	}

	public void setFlightOutboundPrices(String flightOutboundPrices) {
		this.flightOutboundPrices = flightOutboundPrices;
	}

	public String getFlightReturnPrices() {
		return flightReturnPrices;
	}

	public void setFlightReturnPrices(String flightReturnPrices) {
		this.flightReturnPrices = flightReturnPrices;
	}
	
	
	
	
	
	
}