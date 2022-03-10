package edu.ics372.companyv1.business.entities;


public class ClothWasher extends Appliance{

	private double repairPlanCost;
	private static final String WASHER_STRING = "CW";
	
	public ClothWasher(String brand, String model, double price, double repairPlanCost) {
		super(brand, model, price);
		this.repairPlanCost = repairPlanCost;
	}


	@Override
	public void setApplianceID() {
		super.applianceID = WASHER_STRING + IDserver.instance().getApplianceID(); 
	}


	@Override
	public String toString() {
		return "Washer >> " + super.toString() + ", Repair Plan Cost: " + repairPlanCost;
	}
}
