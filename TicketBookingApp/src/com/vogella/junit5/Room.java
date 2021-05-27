package com.vogella.junit5;

import java.util.ArrayList;

public class Room {
	
	private int numberOfRoom;
	
	private ArrayList<Row> rows;
	
	private ArrayList<Screening> screenings;
	
	public Room(int numberOfRoom, int amountOfRows, int amountOfSeatsInRow) {
		this.numberOfRoom = numberOfRoom;
		rows = new ArrayList<Row>();
		
		for(int i=1; i<amountOfRows; ++i) {
			rows.add(new Row(i, amountOfSeatsInRow));
		}
		
		screenings = new ArrayList<Screening>();
	}
	
	public void addScreening(Film film) {
		screenings.add(new Screening(film, getRows()));
	}
	
	public int getNumberOfRoom() {
		return numberOfRoom;
	}
	
	public ArrayList<Row> getRows(){
		return rows;
	}
	
	public ArrayList<Screening> getScreenings(){
		return screenings;
	}
	
}
