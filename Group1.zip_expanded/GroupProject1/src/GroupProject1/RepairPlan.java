package GroupProject1;

import java.util.List;

public class RepairPlan {
	private String orderID;
	private Customer cust;
	private List<Appliance> appliances;
	private static final String REPAIRPLAN_STRING = "RP";

	public RepairPlan(Customer cust, Appliance ap) {
		this.cust = cust;
		appliances.add(ap);
	}

	public RepairPlan(Customer cust, Appliance ap1, Appliance ap2) {
		this.cust = cust;
		appliances.add(ap1);
		appliances.add(ap2);
	}

	public String getOrderID() {
		return orderID;
	}

	public void setOrderID() {
		orderID = REPAIRPLAN_STRING + IDserver.instance().getOrderID();
	}

	@Override
	public String toString() {
		return super.toString();
	}

}
