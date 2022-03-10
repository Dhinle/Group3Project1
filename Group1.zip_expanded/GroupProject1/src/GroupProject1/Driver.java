package GroupProject1;

import java.util.ArrayList;
import java.util.List;

public class Driver {

	public static void main(String[] args) {
		String brandName = "Maytag";
		String brandName2 = "Samsung";
		String modelNameOne = "001A";
		String modelNameTwo = "001B";
		double price = 750;
		double repairPlanCost = 30;
		
		Company company = Company.instance();
		
		
		Appliance wash = company.addWasher(brandName, modelNameOne, price, repairPlanCost);
		Appliance dry = company.addDryer(brandName, modelNameTwo, price, repairPlanCost);
		Appliance kitchenRange = company.addKitchenRange(brandName2, modelNameOne, 2500);
		
		company.listAppliance();
		
		company.addInventory("CW0001", 2);
		company.addInventory("CD0002", 2);
		
		System.out.println();
		company.listAppliance("dryer");
		System.out.println();
		
		company.listAppliance();
		
		String name = "John Doe";
		String name2 = "Jane Doe";
		String address = "1414 S Cherry St, Kansas City, MO, 64118";
		long pNumber = 4123554577L;
		long pNumber2 = 4123554241L;
		
		Customer cust1 = company.addCustomer(name, address, pNumber);
		Customer cust2 = company.addCustomer(name2, address, pNumber2);
		
		System.out.println();
		company.listCustomer();
		System.out.println();
		
		List<ItemList> listLineItem = new ArrayList<ItemList>();
		ItemList lt1 = new ItemList(wash, 1);
		ItemList lt2 = new ItemList(dry, 1);
		ItemList lt3 = new ItemList(kitchenRange, 1);
		listLineItem.add(lt1);
		listLineItem.add(lt2);
		listLineItem.add(lt3);
		Order order1 = new RegularOrder(cust1, listLineItem);
		System.out.println(order1.toString());
		
	}

}

