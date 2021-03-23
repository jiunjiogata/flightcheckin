package com.rjo.flightcheckin.integration;

import com.rjo.flightcheckin.integration.dto.Reservation;
import com.rjo.flightcheckin.integration.dto.ReservationUpdateRequest;

public interface ReservationRestClient {

	public Reservation findReservation(long id);
	
	public Reservation updateReservation(ReservationUpdateRequest request);
}
