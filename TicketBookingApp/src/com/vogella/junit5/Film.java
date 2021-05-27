package com.vogella.junit5;

import java.util.Date;

public class Film {

	private String name;
	
	private Date date;
	
	public Film(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
	
	public Date getDate() {
		return date;
	}
	
}
