package com.test.service;

import java.util.List;

import com.test.model.staff.StaffComponent;

public interface StaffService<T extends StaffComponent> {
	
	void addStaff(T t) throws Exception ;
	
	void removeStaff(Integer staffId);
	
	List<T> listStaff();

}
