package edu.ics372.companyv1.business.collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import edu.ics372.companyv1.business.entities.Appliance;

public class ApplianceList implements Iterable<Appliance>{
	private List<Appliance> appliances = new LinkedList<Appliance>();
	private static ApplianceList appliancesList;
	
	private ApplianceList() {
	}
	
	public static ApplianceList getIntance() {
		if(appliancesList == null) {
			appliancesList = new ApplianceList();
		}
		return appliancesList;
	}

	/**
	 * Insert a appliance into the collection
	 * @param appliance the appliance to be inserted
	 * @return true if the appliance able to insert
	 */
	public boolean insertAppliance(Appliance newAppliance) {
		if(!checkDuplicates(newAppliance)) {		
			appliances.add(newAppliance);
			newAppliance.setApplianceID();
			return true;
		}
		return false;

	}
	
	public Appliance searchAppliance(String applianceID) {
		for(Appliance ap : appliances) {
			if(ap.getApplianceID().equalsIgnoreCase(applianceID)) {
				return ap;
			}
		}
		return null;
	}
	
	public void displayAppliance() {
		for(int i = 0; i < appliances.size(); i++) {
			System.out.println(appliances.get(i).toString());
		}
	}
	
	public void displayAppliance(String type) {
		for(int i = 0; i < appliances.size(); i++) {
			if(appliances.get(i).getClass().getName().equalsIgnoreCase("groupproject1." + type)) {
				System.out.println(appliances.get(i).toString());
			}
		}
	}

	private boolean checkDuplicates(Appliance newAppliance) {
		for(Appliance ap: appliances) {
			if(ap.getBrandName().equalsIgnoreCase(newAppliance.getBrandName()) &&
					ap.getModelName().equalsIgnoreCase(newAppliance.getModelName())) {
				return true;
			}
		}		return false;
	}

	@Override
	public Iterator<Appliance> iterator() {
		return appliances.iterator();
	}
}
