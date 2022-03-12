package GroupProject1;

import java.util.List;

public class Company {

	private ApplianceList applianceList;
	private CustomerList customerList;
	private OrderList orderList;
	private static Company company;

	private Company() {
		applianceList = ApplianceList.instance();
		customerList = CustomerList.instance();
		orderList = OrderList.instance();
	}

	public static Company instance() {
		if (company == null) {
			return (company = new Company());
		}
		return company;
	} 

	public Appliance addWasher(String brand, String model, double price, double repairPlanCost) {
		Appliance washer = new Washer(brand, model, price, repairPlanCost);
		if (applianceList.insertAppliance(washer)) {
			return washer;
		}
		return null;
	}

	public Appliance addDryer(String brand, String model, double price, double repairPlanCost) {
		Appliance Dryer = new Dryer(brand, model, price, repairPlanCost);
		if (applianceList.insertAppliance(Dryer)) {
			return Dryer;
		}
		return null;
	}

	public Appliance addDishWasher(String brand, String model, double price) {
		Appliance dishWasher = new DishWasher(brand, model, price);
		if (applianceList.insertAppliance(dishWasher)) {
			return dishWasher;
		}
		return null;
	}

	public Appliance addKitchenRange(String brand, String model, double price) {
		Appliance kitchenRange = new KitchenRange(brand, model, price);
		if (applianceList.insertAppliance(kitchenRange)) {
			return kitchenRange;
		}
		return null;
	}

	public Appliance addRefrigerator(String brand, String model, double price, int capacity) {
		Appliance refrigerator = new Refrigerator(brand, model, price, capacity);
		if (applianceList.insertAppliance(refrigerator)) {
			return refrigerator;
		}
		return null;
	}

	public Appliance addFurnace(String brand, String model, double price, double maxHeat) {
		Appliance furnace = new Furnace(brand, model, price, maxHeat);
		if (applianceList.insertAppliance(furnace)) {
			return furnace;
		}
		return null;
	}
	public Customer addCustomer(String name, String address, long phoneNumber) {
		Customer customer = new Customer(name, address, phoneNumber);
		if(customerList.insertCustomer(customer)) {
			return customer;
		}
		return null;
	}
	
//	public Order addOrder(Customer cust, List<ItemList> itemList) {
//		orderList.insertOrder(cust, itemList);
//	}

	public void addInventory(String applianceID, int quantity) {
		Appliance app = applianceList.searchAppliance(applianceID);
		app.increaseStock(quantity);
	}

	public void listAppliance() {
		applianceList.displayAppliance();
	}

	public void listAppliance(String type) {
		applianceList.displayAppliance(type);
	}

	public void listCustomer() {
		customerList.displayCustomer();
	}

}
