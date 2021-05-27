package com.vogella.junit5;

import java.util.ArrayList;
import java.util.Date;

public class Screening {

	private ArrayList<Row> rows;
	
	private Film film;
	
	private Date date;
	
	public Screening(Film film, Date date, ArrayList<Row> rows) {
		this.film = film;
		this.date = date;
		this.rows = rows;
	}
	
	public ArrayList<Row> getRows(){
		return rows;
	}
	
	public Film getFilm() {
		return film;
	}
	
	public Date getDate() {
		return date;
	}
	
	public String toString() {
		return film.getName() + " " + date;
	}
	
}
