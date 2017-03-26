package com.test.model.seating;

public interface SeatingArea {
	
	public Seats addUser(String allocatedUserName);
	
	public void removeUser(String allocatedUserName) throws Exception ;

}
