package GroupProject1;

import java.util.LinkedList;
import java.util.List;

public class ApplianceList {
	private List<Appliance> appliances;
	private static ApplianceList applianceList;
	
	private ApplianceList() {
		appliances = new LinkedList<Appliance>();
	}
	
	public static ApplianceList instance() {
		if(applianceList == null) {
			return (applianceList = new ApplianceList());
		}
		return applianceList;
	}

	
	public boolean insertAppliance (Appliance newAppliance) {
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
		}
		return false;
	}
	
	
}
