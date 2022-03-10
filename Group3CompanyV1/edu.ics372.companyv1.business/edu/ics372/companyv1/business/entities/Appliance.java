package edu.ics372.companyv1.business.entities;

import java.io.Serializable;
import java.text.DecimalFormat;
import java.util.Calendar;

public abstract class Appliance implements Serializable {
	private String brandName;
	private String modelName;
	private int inStock;
	protected String applianceID;
	private double price;
	private static final DecimalFormat df = new DecimalFormat("0.00");

	public Appliance(String brand, String model, double price) {
		this.brandName = brand;
		this.modelName = model;
		this.price = price;
		this.inStock = 0;
	}

	
	public String getBrandName() {
		return brandName;
	}

	public String getModelName() {
		return modelName;
	}

	public int getInStock() {
		return inStock;
	}

	public double getPrice() {
		return price;
	}

	public String getApplianceID() {
		return applianceID;
	}

	public abstract void setApplianceID();

	public void increaseStock(int quantity) {
		inStock += quantity;
	}

	public boolean decreaseStock(int quantity) {
		if (inStock > quantity) {
			inStock -= quantity;
			return true;
		}
		return false;
	}

	public String toString() {         
		return "ID " + applianceID + ", Brand Name: " + brandName + ", Model Name: " + modelName + ", Price: $"   
	+ df.format(price) + ", In Stock: " + inStock;    
		}

}
