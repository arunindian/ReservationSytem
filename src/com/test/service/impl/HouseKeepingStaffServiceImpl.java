package com.test.service.impl;

import java.util.List;
import com.test.model.staff.HouseKeepingStaffMember;
import com.test.model.staff.Staff;
import com.test.service.MenuService;
import com.test.service.StaffService;

public class HouseKeepingStaffServiceImpl implements StaffService<HouseKeepingStaffMember> {

	Staff<HouseKeepingStaffMember> staff;
	MenuService menuService;
	
	@Override
	public void addStaff(HouseKeepingStaffMember t) throws Exception {
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
	public List<HouseKeepingStaffMember> listStaff() {
		return staff.listStaff();
	}
	
	
	

}
