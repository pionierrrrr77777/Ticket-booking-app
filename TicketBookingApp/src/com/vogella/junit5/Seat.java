package com.vogella.junit5;

public class Seat {
	
	private int numberOfSeat;
	
	private boolean isReserved;
	
	public Seat(int numberOfSeat) {
		this.numberOfSeat = numberOfSeat;
		isReserved = false;
	}
	
	public void reserve() {
		isReserved = true;
	}
	
	public int getNumberOfSeat() {
		return numberOfSeat;
	}
	
	public boolean getIsReserved() {
		return isReserved;
	}
	
}
