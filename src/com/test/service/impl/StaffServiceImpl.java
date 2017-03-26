package com.test.service.impl;

import java.util.List;

import com.test.model.booking.Order;
import com.test.model.items.Item;
import com.test.model.staff.CateringStaffMember;
import com.test.model.staff.Staff;
import com.test.service.BillingService;
import com.test.service.MenuService;
import com.test.service.StaffService;
 
public class StaffServiceImpl implements StaffService<CateringStaffMember> {

	BillingService billingService;
	Staff<CateringStaffMember> staff;
	MenuService menuService;
	
	@Override
	public void addStaff(CateringStaffMember t) throws Exception {
		if(staff == null) {
			throw new Exception("No Staff present");
		}
		staff.addStaff(t);
	}

	@Override
	public void removeStaff(Integer staffId) {
		if(staff == null) {
			return;
		}
		staff.removeStaff(staffId);
	}

	@Override
	public List<CateringStaffMember> listStaff() {
		return staff.listStaff();
	}
	
	public void showMenuDetails() {
		menuService.displayMenu();
	}
	
	public void takeOrder(String guestName,List<Item> items) throws Exception{
		menuService.takeOrder(guestName, items);
	}
	
	public void generateBill(String guestName, Order order) throws Exception{
		billingService.generateBill(guestName, order);
	}
	


}
