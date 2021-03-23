package com.rjo.flightcheckin.integration.dto;


public class Reservation {
	private long id;
	private boolean checkIn;
	private Integer numberOfBags;
	private Passenger passenger;
	private Flight flight;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public boolean isCheckIn() {
		return checkIn;
	}

	public void setCheckIn(boolean checkIn) {
		this.checkIn = checkIn;
	}

	public Integer getNumberOfBags() {
		return numberOfBags;
	}

	public void setNumberOfBags(Integer numberOfBags) {
		this.numberOfBags = numberOfBags;
	}

	public Passenger getPassenger() {
		return passenger;
	}

	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}

	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}
}
