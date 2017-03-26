package com.test.model.booking;

import java.math.BigDecimal;
import java.util.List;

import com.test.model.items.Item;

public class Order {

	String guestName;
	List<Item> items;
	
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
	
	public BigDecimal getItemBasePrice() {
		BigDecimal basePrice = BigDecimal.ZERO;
		for(Item item : items) {
			basePrice.add(item.getItemBasePrice());
		}
		return basePrice;
	}

	

}
