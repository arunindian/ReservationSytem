package com.test.service;

import com.test.model.booking.BookingDetails;
import com.test.model.booking.BookingStatus;
import com.test.model.seating.SeatingAreaType;
import com.test.model.staff.HouseKeepingStaffMember;

public interface ReservationService {
	
	BookingStatus reserveSeat(HouseKeepingStaffMember bookingUser,SeatingAreaType seatingAreaType,BookingDetails bookingDetails)  throws Exception ;

}
