package edu.ics372.companyv1.business.entities;

public class KitchenRanges extends Appliance {
	private String id;
	public KitchenRanges(String brand, String model, double price) {
		super(brand, model, price);
		this.applianceID =id;
	}

	@Override
	public void setApplianceID() {
		// TODO Auto-generated method stub
		this.applianceID =id;
	}

}
