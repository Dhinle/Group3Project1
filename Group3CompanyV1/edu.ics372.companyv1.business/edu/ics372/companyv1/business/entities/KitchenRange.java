package edu.ics372.companyv1.business.entities;


public class KitchenRange extends Appliance {
	private static final String KITCHENRANGE_STRING = "KR";

	public KitchenRange(String brand, String model, double price) {
		super(brand, model, price);
		
	}

	@Override
	public void setApplianceID() {
		super.applianceID = KITCHENRANGE_STRING + IDserver.instance().getApplianceID();
	}
	
	@Override
	public String toString() {
		return "Kitchen Range >> " + super.toString();
	}


}
