package com.test.model.staff;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Staff<T extends StaffComponent> {
	
	List<T> availableStaffList;
	Map<Integer,T> availableStaffMap;
	Integer MAX_STAFF_COUNT;

	public List<T> getStaffComponents() {
		return availableStaffList;
	}

	public void addStaff(T t) {
		if(availableStaffList == null) {
			availableStaffList  = new ArrayList<>(MAX_STAFF_COUNT);
		}
		availableStaffList.add(t);
	}

	public void removeStaff(Integer staffId) {
		if(availableStaffList == null) {
			return;
		}
		StaffComponent removeStaff =availableStaffMap.get(staffId);
		availableStaffList.remove(removeStaff);
		availableStaffMap.remove(staffId);
	}

	public List<T> listStaff() {
		return availableStaffList;
	}

}
