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
	public boolean insertAppliance(Appliance appliance) {
		appliances.add(appliance);
		return true;
	}
	@Override
	public Iterator<Appliance> iterator() {
		return appliances.iterator();
	}
}
