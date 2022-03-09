package edu.ics372.companyv1.business.entities;

public class Appliance {
	private String name;
	private String model;
	private int stock;
	private String id;
	private double price;
	
	public Appliance (String name, String model, double price) {
		this.name = name;
		this.model = model;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public String getModel() {
		return model;
	}
	
	public double getPrice() {
		return price;
	}
	
}
