package com.vogella.junit5;

public class Person {
	
	private String name;
	
	private String surname;
	
	private PersonType personType;
	
	public Person() {}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setSurName(String surname) {
		this.surname = name;
	}
	
	public void setPersonType(PersonType personType) {
		this.personType = personType;
	}
	
	public String getName() {
		return name;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public PersonType getPersonType() {
		return personType;
	}
	
}
