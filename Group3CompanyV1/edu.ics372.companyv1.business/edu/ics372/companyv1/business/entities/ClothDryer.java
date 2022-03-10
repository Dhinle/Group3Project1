package edu.ics372.companyv1.business.entities;

public class ClothDryer extends Appliance{

    private double repairPlanCost;
    private static final String DRYER_STRING = "CD";

    public ClothDryer(String brand, String model, double price, double repairPlanCost) {
        super(brand, model, price);
        this.repairPlanCost = repairPlanCost;
    }

    public double getRepairPlanCost() {
    	return repairPlanCost;
    }
    @Override
    public void setApplianceID() {
        super.applianceID = DRYER_STRING + IDserver.instance().getApplianceID(); 
    }


    public String toString() {
        return "Dryer >> " + super.toString() + ", Repair Plan Cost: " + repairPlanCost;
    }

}

