package com.vogella.junit5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class Cinema {

	private ArrayList<Room> rooms; 
	
	private ArrayList<Film> films;
	
	private ArrayList<Screening> screenings;
	
	public Cinema() throws ParseException {
		rooms = new ArrayList<Room>();
		films = new ArrayList<Film>();
		screenings = new ArrayList<Screening>();
		
		createInMemoryDatabase();
	}
	
	public void createInMemoryDatabase() throws ParseException {
		rooms.add(new Room(1, 10, 15));
		rooms.add(new Room(2, 5, 5));
		rooms.add(new Room(3, 10, 10));
		
		films.add(new Film("Titanic"));
		films.add(new Film("Madagaskar"));
		films.add(new Film("Seven"));
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm");
		
		rooms.get(0).addScreening(films.get(0), sdf.parse("03-06-2021 17:00"));
		rooms.get(0).addScreening(films.get(2), sdf.parse("03-06-2021 21:00"));
		rooms.get(1).addScreening(films.get(1), sdf.parse("03-06-2021 17:30"));
		rooms.get(1).addScreening(films.get(2), sdf.parse("04-06-2021 15:30"));
		rooms.get(2).addScreening(films.get(0), sdf.parse("05-06-2021 15:00"));
		rooms.get(2).addScreening(films.get(1), sdf.parse("03-06-2021 20:30"));
		
	}
	
	public ArrayList<Room> getRooms(){
		return rooms;
	}
	
	public ArrayList<Film> getFilms(){
		return films;
	}
	
	public ArrayList<Screening> getScreenings(){
		screenings.clear();
		
		for(int i=0; i<rooms.size(); ++i) {
			for(int j=0; j<rooms.get(i).getScreenings().size(); ++j) {
				screenings.add(rooms.get(i).getScreenings().get(j));
			}
		}
		
		return screenings;
	}
	
}
