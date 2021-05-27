package com.vogella.junit5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class UseCase {

	private Cinema cinema;
	
	private Date dateStart;
	
	private Date dateEnd;
	
	public UseCase() throws ParseException {
		this.cinema = new Cinema();
		
		dateStart = new Date();
        dateEnd = new Date();
	}
	
	public void bookTicket() throws ParseException {
		//userSelectDayAndTime();
		listOfFilmsInTimeInterval();
	}
	
	public void userSelectDayAndTime() {
		Scanner scan = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm");

		System.out.println("Podaj pocz¹tek okresu wyszukiwania filmów (format dd-MM-yyyy HH:mm): ");
	    String dateStartString = scan.nextLine();
	    System.out.println("Podaj koniec okresu wyszukiwania filmów (format dd-MM-yyyy HH:mm): ");
	    String dateEndString = scan.nextLine();
	
        try {
			dateStart = sdf.parse(dateStartString);
		} catch (ParseException e) {
			System.out.println("Niepoprawny format pierwszej daty");
			e.printStackTrace();
		}
		try {
			dateEnd = sdf.parse(dateEndString);
		} catch (ParseException e) {
			System.out.println("Niepoprawny format drugiej daty");
			e.printStackTrace();
		}

	}
	
	public void listOfFilmsInTimeInterval() {
		System.out.println(cinema.getScreenings());
	}
}
