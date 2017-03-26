package com.test.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.test.model.booking.BookingDetails;
import com.test.model.booking.BookingStatus;
import com.test.model.booking.Guest;
import com.test.model.seating.LawnSeatingArea;
import com.test.model.seating.SeatingArea;
import com.test.model.seating.SeatingAreaType;
import com.test.model.seating.Seats;
import com.test.model.staff.CateringStaffMember;
import com.test.model.staff.HouseKeepingStaffMember;
import com.test.service.ReservationService;

public class ReservationServiceImpl implements ReservationService {
	
	List<HouseKeepingStaffMember> authenticUsers;
	Map<SeatingAreaType,SeatingArea> seatingAreaTypeToSeatingArea;
	
	// Init reservation service
	public void init(){
		LawnSeatingArea lawnArea  = new LawnSeatingArea(100);
		seatingAreaTypeToSeatingArea.put(SeatingAreaType.LAWN, lawnArea);
		List<HouseKeepingStaffMember> authenticUsers = new ArrayList<>();
		HouseKeepingStaffMember hm1= new HouseKeepingStaffMember();
		hm1.setStaffId(1);
		hm1.setStaffName("Ramesh");
		authenticUsers.add(hm1);
	}
	
	private boolean isValidUser(HouseKeepingStaffMember bookingUser) {
		for(HouseKeepingStaffMember houseKeepingMember : authenticUsers){
			if(houseKeepingMember.getStaffId().equals(bookingUser.getStaffId())){
				return true;
			}
		}
		return false;
	}

	@Override
	public BookingStatus reserveSeat(HouseKeepingStaffMember bookingUser,SeatingAreaType seatingAreaType,BookingDetails bookingDetails) throws Exception {
		
		if(bookingUser == null){
			throw new Exception("Booking usercannot be null");
		}
		
		if(!isValidUser(bookingUser)) {
			throw new Exception("Booking user is not authorized");
		}
		
		SeatingArea seatingArea = seatingAreaTypeToSeatingArea.get(seatingAreaType);
		BookingStatus bookingStatus = null;
		synchronized(seatingArea) {
			List<Seats> bookedSeats = new ArrayList<>();
			for(Guest g: bookingDetails.getGuests()) {
				Seats seat = seatingArea.addUser(g.getGuestName());
				bookedSeats.add(seat);
			}
			
			if(bookedSeats.size() == bookingDetails.getGuests().size()) {
				bookingStatus = BookingStatus.BOOKED;
			} else {
				bookingStatus = BookingStatus.BOOKINGFAILED;
			}
		}
		
		return bookingStatus;
	}


}
