package edu.ics372.companyv1.business.facade;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

import edu.ics372.companyv1.business.collections.ApplianceList;
import edu.ics372.companyv1.business.entities.Appliance;
import edu.ics372.companyv1.business.entities.ClothDryer;
import edu.ics372.companyv1.business.entities.ClothWasher;
import edu.ics372.companyv1.business.entities.Customer;
import edu.ics372.companyv1.business.entities.DishWashers;
import edu.ics372.companyv1.business.entities.Furnaces;
import edu.ics372.companyv1.business.entities.KitchenRanges;
import edu.ics372.companyv1.business.entities.Refrigerators;

public class Company implements Serializable{
	private static Company company;
	private ApplianceList appliance = ApplianceList.getIntance();
	private Company() {
	}
	
	public static Company instance() {
		if(company == null) {
			return company = new Company();
		}else {
			return company;
		}
	}
	public Result addAppliance(Request request){
		Result result = new Result();
		if (request.getType() == 1) {
		ClothDryer dryer = new ClothDryer(request.getBrandName(), request.getModelName(), request.getPrice(),request.getRepairCost());
		}
		else if (request.getType()== 2){ 
			ClothWasher clothWasher = new ClothWasher(request.getBrandName(), request.getModelName(), request.getPrice());
		}
		
		DishWashers dishWasher = new DishWashers(request.getBrandName(), request.getModelName(), request.getPrice());
		Furnaces furnace = new Furnaces(request.getBrandName(), request.getModelName(), request.getPrice());
		KitchenRanges kitchenRange = new KitchenRanges(request.getBrandName(), request.getModelName(), request.getPrice());
		Refrigerators refrigerator = new Refrigerators(request.getBrandName(), request.getModelName(), request.getPrice());
		if(appliance.insertAppliance())
		return result;
	}
	
	public Result addCustomer(Request request) {
		Result result = new Result();
		Customer customer = new Customer(request.getName(),request.getAddress(), request.getPhone());
		if()
		result.setResultInt(Result.OPERATION_COMPLETED);
		return result;
	}
	
	// increment the id of customer
	public Company retrieve() {
		try {
			FileInputStream file = new FileInputStream("LibraryData");
			ObjectInputStream input = new ObjectInputStream(file);
			company = (Company) input.readObject();
			Customer.retrieve(input);
			return company;
		} catch (IOException ioe) {
			ioe.printStackTrace();
			return null;
		} catch (ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
			return null;
		}
	}
}
