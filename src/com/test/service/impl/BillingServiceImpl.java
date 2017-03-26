package com.test.service.impl;

import java.math.BigDecimal;
import java.util.List;

import com.test.model.booking.Bill;
import com.test.model.booking.Order;
import com.test.service.BillingService;

public class BillingServiceImpl implements BillingService{

	@Override
	public Bill generateBill(String guestName,Order order) throws Exception {
		if(guestName == null) {
			throw new Exception("Cannot generate billwithout user name");
		}
		BigDecimal itemBasePrice = order.getItemBasePrice();
		BigDecimal finalAmount  = itemBasePrice.add(getVariablePrice());
		
		Bill bill  = new Bill();
		bill.setGuestName(guestName);
		bill.setFinalAmont(finalAmount);
		return bill;
		
	}
	
	private BigDecimal getVariablePrice(){
		return new BigDecimal(2);
	}

}
