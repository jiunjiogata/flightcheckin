package com.rjo.flightcheckin.integration.dto;

import java.sql.Timestamp;
import java.util.Date;


public class Flight {
	private long id;
	private String flightnumber;
	private String operatingairlines;
	private String departurecity;
	private String arrivalcity;
	private Date dateofdeparture;
	private Timestamp estimatedeparturetime;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	public String getFlightnumber() {
		return flightnumber;
	}

	public void setFlightnumber(String flightNumber) {
		this.flightnumber = flightNumber;
	}

	public String getOperatingairlines() {
		return operatingairlines;
	}

	public void setOperatingairlines(String operatingAirlines) {
		this.operatingairlines = operatingAirlines;
	}

	public String getDeparturecity() {
		return departurecity;
	}

	public void setdeparturedity(String departurecity) {
		this.departurecity = departurecity;
	}

	public String getArrivalcity() {
		return arrivalcity;
	}

	public void setArrivalcity(String arrivalCity) {
		this.arrivalcity = arrivalCity;
	}

	public Date getDateofdeparture() {
		return dateofdeparture;
	}

	public void setDateOfDeparture(Date dateOfDeparture) {
		this.dateofdeparture = dateOfDeparture;
	}

	public Timestamp getEstimatedeparturetime() {
		return estimatedeparturetime;
	}

	public void setEstimatedeparturetime(Timestamp estimateDepartureTime) {
		this.estimatedeparturetime = estimateDepartureTime;
	}


}
