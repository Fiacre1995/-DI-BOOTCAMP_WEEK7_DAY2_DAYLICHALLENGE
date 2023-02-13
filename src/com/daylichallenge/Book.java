package com.daylichallenge;

public class Book extends Auteur {
	
	public Book(String name, String email, char gender) {
		super(name, email, gender);
		// TODO Auto-generated constructor stub
	}


	private String name;
	private String auteur;
	private double price;
	private int qry;
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQry() {
		return qry;
	}
	public void setQry(int qry) {
		this.qry = qry;
	}
	public String getName() {
		return name;
	}
	public String getAuteur() {
		return auteur;
	}
	
	
	@Override
	public String toString() {
		return "Book [name=" + name + ", auteur=" + auteur + ", price=" + price + ", qry=" + qry + "]";
	}
	
	
	
	

}
