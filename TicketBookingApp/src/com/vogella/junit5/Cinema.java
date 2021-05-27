package com.vogella.junit5;

import java.util.ArrayList;

public class Cinema {

	private ArrayList<Room> rooms; 
	
	private ArrayList<Film> films;
	
	public Cinema() {
		rooms = new ArrayList<Room>();
		films = new ArrayList<Film>();
		
		createInMemoryDatabase();
	}
	
	public void createInMemoryDatabase() {
		rooms.add(new Room(1, 10, 15));
		rooms.add(new Room(2, 5, 5));
		rooms.add(new Room(3, 10, 10));
		
		films.add(new Film("Titanic"));
		films.add(new Film("Madagaskar"));
		films.add(new Film("Seven"));
		
		
	}
	
	public ArrayList<Room> getRooms(){
		return rooms;
	}
	
	public ArrayList<Film> getFilms(){
		return films;
	}
	
}
