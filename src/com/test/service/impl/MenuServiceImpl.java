package com.test.service.impl;

import java.util.List;

import com.test.model.booking.Order;
import com.test.model.items.Item;
import com.test.model.items.ItemType;
import com.test.model.items.Menu;
import com.test.service.MenuService;

public class MenuServiceImpl implements MenuService {
	
	private Menu menu  = new Menu();

	@Override
	public void displayMenu() {
		menu.showItems();
	}

	@Override
	public void takeOrder(String guestName,List<Item> items) throws Exception {
		
		if(items ==  null) {
			throw new Exception("Order Items cannot be null");
		}
		
		Order order = new Order();
		order.setItems(items);
		order.setGuestName(guestName);
		
	}

	@Override
	public void generateBill() {
		// TODO Auto-generated method stub
		
	}

}
