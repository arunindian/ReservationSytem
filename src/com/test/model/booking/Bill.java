package com.test.model.booking;

import java.math.BigDecimal;
import java.util.List;

import com.test.model.items.Item;

public class Bill {
	
	String guestName;
	List<Item> items;
	BigDecimal finalAmont;
	
	public String getGuestName() {
		return guestName;
	}
	public void setGuestName(String guestName) {
		this.guestName = guestName;
	}
	public List<Item> getItems() {
		return items;
	}
	public void setItems(List<Item> items) {
		this.items = items;
	}
	public BigDecimal getFinalAmont() {
		return finalAmont;
	}
	public void setFinalAmont(BigDecimal finalAmont) {
		this.finalAmont = finalAmont;
	}
	

}
