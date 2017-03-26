package com.test.model.booking;

import java.util.List;

public class BookingDetails {
	
	List<Guest> guests;
	Integer reservationCount;

	public List<Guest> getGuests() {
		return guests;
	}

	public void setGuests(List<Guest> guests) {
		this.guests = guests;
	}
	
	public Integer getReservationCount() {
		return reservationCount;
	}
	public void setReservationCount(Integer reservationCount) {
		this.reservationCount = reservationCount;
	}
	
	public void addGuest(String guestName, String guestId){
		Guest g  = new Guest();
		g.setGuestName(guestName);
		guests.add(g);
	}
	

}
