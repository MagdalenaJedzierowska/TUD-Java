package com.example.jdbcdemo.domain;

public class Console {
		
	private int id_console;
	private String name;
	private Brand brand;
	private int yearOfPremiere;
	private double price;

	public Console(){
	}
	
	public int getYearOfPremiere() {
		return yearOfPremiere;
	}

	public void setYearOfPremiere(int yearOfPremiere) {
		this.yearOfPremiere = yearOfPremiere;
	}
	
	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	public int getId(){
		return id_console;
	}
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setId(int id){
		this.id_console=id;
	}
	
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	
}
