package GroupProject1;
//GroupProject1.Washer
public class Washer extends Appliance{
	private double repairPlanCost;
	private static final String WASHER_STRING = "CW";
	
	public Washer(String brand, String model, double price, double repairPlanCost) {
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
