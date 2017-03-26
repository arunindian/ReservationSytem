package com.test.model.seating;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class LawnSeatingArea implements SeatingArea{
	
	List<Seats> seatList;
	Map<String,Seats> userNameSeatMap;
	Integer seatCount;
	Integer availableSeatCount;
	
	public LawnSeatingArea(Integer seatCount){
		this.seatList= new ArrayList<>(seatCount);
		this.seatCount =seatCount;
		this.availableSeatCount = seatCount;
	}
	
	public Integer getSeatCount() {
		return seatCount;
	}

	public void setSeatCount(Integer seatCount) {
		this.seatCount = seatCount;
	}

	public Integer getAvailableSeatCount() {
		return availableSeatCount;
	}

	public void setAvailableSeatCount(Integer availableSeatCount) {
		this.availableSeatCount = availableSeatCount;
	}

	public List<Seats> getSeatList() {
		return seatList;
	}
	
	@Override
	public Seats addUser(String allocatedUserName){
		if(availableSeatCount == 0) {
			return null;
		}
		Seats seat = new Seats();
		seat.setAllocatedUser(allocatedUserName);
		seatList.add(seat);
		this.availableSeatCount--;
		return seat;
	}

	public void setSeatList(List<Seats> seatList) {
		this.seatList = seatList;
	}
	
	public SeatingAreaType getSeatingAreaType(){
		return SeatingAreaType.LAWN;
	}

	@Override
	public void removeUser(String allocatedUserName) throws Exception {
		if(allocatedUserName == null) {
			throw new Exception("Allocated User Name cannot be null");
		}
		
		Seats seat = userNameSeatMap.get(allocatedUserName);
		seatList.remove(seat);
		userNameSeatMap.remove(allocatedUserName);
	}

}
