package com.vogella.junit5;

import java.util.ArrayList;
import java.util.Date;

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
	
	public void addScreening(Film film, Date date) {
		screenings.add(new Screening(film, date, getRows()));
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
