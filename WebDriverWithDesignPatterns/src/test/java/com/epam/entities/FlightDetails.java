package com.epam.entities;

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
		return this;
	}
	
	public FlightDetails withDestination(String destination){
		setDestination(destination);
		return this;
	}
	
	public FlightDetails withDepartureDate(String departureDate){
		setDepartureDate(departureDate);
		return this;
	}
	
	public FlightDetails withRetrunDate(String returnDate){
		setReturnDate(returnDate);
		return this;
	}
	
	public FlightDetails withNoOfAdults(String adults){
		setAdults(adults);
		return this;
	}
	
	public FlightDetails withNoOFChildren(int children){
		setChildren(children);
		return this;
	}
	
	public FlightDetails withresultPageHeader(String header){
		setResultsPageHeader(header);
		return this;
	}
	
	public FlightDetails withConnectionIn(String connectioIn){
		setConnectionIn(connectioIn);
		return this;
	}
	
	public FlightDetails withDepartingDateInResults(String departingDate){
		setDepartingDateInResults(departingDate);
		return this;
	}
	
	public FlightDetails withReturningDateInResults(String returningDate){
		setReturningDateInResults(returningDate);
		return this;
	}
	
	public FlightDetails withFlightOutboundPrices(String pricesAsString){
		setFlightOutboundPrices(pricesAsString);
		return this;
	}
	
	public FlightDetails withFlightRetunrPrices(String pricesAsString){
		setFlightReturnPrices(pricesAsString);
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