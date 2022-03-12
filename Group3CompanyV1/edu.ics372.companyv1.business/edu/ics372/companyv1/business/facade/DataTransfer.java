package edu.ics372.companyv1.business.facade;

import java.util.HashSet;
import java.util.Set;

import edu.ics372.companyv1.business.entities.Appliance;
import edu.ics372.companyv1.business.entities.Customer;

//use to transfer data between Company and UserInterface
public abstract class DataTransfer {
	private String ApplianceId;
	private String brandName;
	private String modelName;
	private double price;
	private String customerName;
	private String customerAddress;
	private String customerPhoneNumber;
	private String customerId;
	private double repairCost;
	private HashSet<Integer> choosenAppliances;
	public double getRepairCost() {
		return repairCost;
	}

	public void setRepairCost(double repairCost) {
		this.repairCost = repairCost;
	}

	public DataTransfer(){
		reset();
	}
	
	public String getApplianceId() {
		return ApplianceId;
	}

	public void setApplianceId(String applianceId) {
		ApplianceId = applianceId;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getName() {
		return customerName;
	}

	public void setName(String name) {
		this.customerName = name;
	}

	public String getAddress() {
		return customerAddress;
	}

	public void setAddress(String address) {
		this.customerAddress = address;
	}

	public String getPhone() {
		return customerPhoneNumber;
	}

	public void setPhone(String phone) {
		this.customerPhoneNumber = phone;
	}

	public String getId() {
		return customerId;
	}

	public void setId(String id) {
		this.customerId = id;
	}
	//set all fields related with Customer using Customer parameter.
	public void setCustomerFields(Customer customer) {
		customerId = customer.getCustomerID();
		customerName = customer.getName();
		customerAddress = customer.getAddress();
		customerPhoneNumber = customer.getPhoneNumber();
	}
	//set all fields related with Appliance using Appliance parameter.
	public void setApplianceField(Appliance appliance) {
		ApplianceId = appliance.getApplianceID();
		brandName = appliance.getBrandName();
		modelName = appliance.getModelName();
		price = appliance.getPrice();
	}
	
	public void setAppliancesToDisplay(int applianceType) {
        choosenAppliances = new HashSet<Integer>();
        choosenAppliances.add(applianceType);
	}
	 public Set<Integer> getChoosenAppliances() {
	        return choosenAppliances;
	    }

	//set all fields to none
	public void reset(){
		
	}
}
