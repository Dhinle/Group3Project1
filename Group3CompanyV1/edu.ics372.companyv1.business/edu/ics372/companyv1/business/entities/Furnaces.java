package edu.ics372.companyv1.business.entities;

public class Furnaces extends Appliance{

	private String id;
	private double heatOutput;
	public Furnaces(String brand, String model, double price) {
		super(brand, model, price);
		// TODO Auto-generated constructor stub
		this.applianceID = id;
	}

	@Override
	public void setApplianceID() {
		// TODO Auto-generated method stub
		this.applianceID = id;
	}
	
	public void setHeatOutPut(double heatOutPut) {
		this.heatOutput = heatOutPut;
	}
}
