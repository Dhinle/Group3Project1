package edu.ics372.companyv1.business.entities;


public class Refrigerator extends Appliance {
	private int capacity; 
	private static final String REFRIGERATOR_STRING = "RF";
	
	public Refrigerator(String brand, String model, double price, int capacity) {
		super(brand, model, price);
		this.capacity = capacity;
	}

	@Override
	public void setApplianceID() {
		super.applianceID = REFRIGERATOR_STRING + IDserver.instance().getApplianceID();
	}
	
	@Override
	public String toString() {
		return "Refrigerator >> " + super.toString() + ", Capacity: " + capacity;
	}

}
