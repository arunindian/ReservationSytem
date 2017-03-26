package com.test.service;

import java.util.List;

import com.test.model.items.Item;

public interface MenuService {
	
	void displayMenu();
	
	void takeOrder(String guestName,List<Item> item)  throws Exception;
	
	void generateBill();

}
