package com.daylichallenge;

public class Auteur {
	
	private String name;
	private String email;
	private char gender = 'm';
	
	
	//constructeur sans parametre
	
	public Auteur(String name, String email, char gender) {
		super();
		this.name = name;
		this.email = email;
		this.gender = gender;
	}


	//Getters et Setters
	
	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getName() {
		return name;
	}


	public char getGender() {
		return gender;
	}



	//methode toString
	@Override
	public String toString() {
		return "Auteur [name=" + name + ", email=" + email + ", gender=" + gender + "]";
	}
	
}
	
	