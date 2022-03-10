package GroupProject1;

public class DishWasher extends Appliance{
	
	private static final String DISHWASHER_STRING = "DW";

	public DishWasher(String brand, String model, double price) {
		super(brand, model, price);
	}

	@Override
	public void setApplianceID() {
		super.applianceID = DISHWASHER_STRING + IDserver.instance().getApplianceID();
	}
	
	@Override
	public String toString() {
		return "Dish Washer >> " + super.toString();
	}

}
