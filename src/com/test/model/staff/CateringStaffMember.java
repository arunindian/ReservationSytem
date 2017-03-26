package com.test.model.staff;

public class CateringStaffMember implements StaffComponent{
	
	private Integer staffId;
	private String staffName;
	
	public Integer getStaffId() {
		return staffId;
	}
	public void setStaffId(Integer staffId) {
		this.staffId = staffId;
	}
	public String getStaffName() {
		return staffName;
	}
	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}
	
	@Override
	public StaffType getStaffType() {
		return StaffType.CATERING;
	}

}
