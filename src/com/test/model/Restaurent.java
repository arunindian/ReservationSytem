package com.test.model;

import java.util.List;

import com.test.model.items.Menu;
import com.test.model.staff.Staff;
import com.test.model.staff.StaffComponent;

public class Restaurent{
	
	private Menu menu;
	private List<Staff<StaffComponent>> staffs;
	
	public Menu getMenu() {
		return menu;
	}
	public void setMenu(Menu menu) {
		this.menu = menu;
	}
	public List<Staff<StaffComponent>> getStaffs() {
		return staffs;
	}
	public void setStaffs(List<Staff<StaffComponent>> staffs) {
		this.staffs = staffs;
	}

}
