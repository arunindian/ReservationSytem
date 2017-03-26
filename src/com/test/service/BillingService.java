package com.test.service;

import com.test.model.booking.Bill;
import com.test.model.booking.Order;

public interface BillingService {
	
	Bill generateBill(String guestName,Order order)  throws Exception ;

}
