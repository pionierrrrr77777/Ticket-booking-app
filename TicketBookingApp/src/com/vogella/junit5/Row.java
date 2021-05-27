package com.vogella.junit5;

import java.util.ArrayList;

public class Row {
	
	private int numberOfRow;
	
	private ArrayList<Seat> seats;
	
	public Row(int numberOfRow ,int amountOfSeats) {
		seats = new ArrayList<Seat>();
		
		for(int i=1; i<=amountOfSeats; ++i) {
			seats.add(new Seat(i));
		}
	}
	
	public ArrayList<Seat> getSeats(){
		return seats;
	}
	
	public int getNumberOfRow() {
		return numberOfRow;
	}

}
