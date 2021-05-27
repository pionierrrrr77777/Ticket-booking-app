package com.vogella.junit5;

import java.util.ArrayList;

public class Screening {

	private ArrayList<Row> rows;
	
	private Film film;
	
	public Screening(Film film, ArrayList<Row> rows) {
		this.film = film;
		this.rows = rows;
	}
	
	public ArrayList<Row> getRows(){
		return rows;
	}
	
	public Film getFilm() {
		return film;
	}
	
}
