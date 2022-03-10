package GroupProject1;

public class Dryer extends Appliance{

	private double repairPlanCost;
	private static final String DRYER_STRING = "CD";
	
	public Dryer(String brand, String model, double price, double repairPlanCost) {
		super(brand, model, price);
		this.repairPlanCost = repairPlanCost;
	}
	

	@Override
	public void setApplianceID() {
		super.applianceID = DRYER_STRING + IDserver.instance().getApplianceID(); 
	}


	public String toString() {
		return "Dryer >> " + super.toString() + ", Repair Plan Cost: " + repairPlanCost;
	}

}
