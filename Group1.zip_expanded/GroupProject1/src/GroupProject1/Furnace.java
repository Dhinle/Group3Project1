package GroupProject1;

public class Furnace extends Appliance{
	private double maxHeat;
	private static final String FURNACE_STRING = "CF";

	public Furnace(String brand, String model, double price, double btu) {
		super(brand, model, price);
		this.maxHeat = btu;
	}

	@Override
	public void setApplianceID() {
		super.applianceID = FURNACE_STRING + IDserver.instance().getApplianceID();
	}
	
	@Override
	public String toString() {
		return "Furnace >>" + super.toString() + ", Maximum Heating Output: " + maxHeat;
	}

}
