package edu.ics372.companyv1.business.entities;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;
import java.util.List;


public class Customer {
	private String customerID;
	private String name;
	private String address;
	private String phoneNumber;
	private boolean hasRepairPlan;
	private static final String CUSTOMER_STRING = "CU";
	private static int id;

	public Customer(String name, String address, String phoneNumber) {
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		hasRepairPlan = false;
	}

	public String getCustomerID() {
		return customerID;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public boolean isHasRepairPlan() {
		return hasRepairPlan;
	}
	
	public void setCustomerID() {
		customerID = CUSTOMER_STRING + IDserver.instance().getCustomerID();
	}
	
	public void setHasRepairPlan(boolean hasRepairPlan) {
		this.hasRepairPlan = hasRepairPlan;
	}
	/**
	public boolean issueRepairPlan(Appliance appliance) {
        if (appliance.instanceOf(Dryer) || appliance.instanceOf(Washer)) {
            if (repairPlans.add(appliance)) {
                transactions.add(new Transaction("Issued a repair plan", appliance.getID()));
                return true;
            }
            return false;
        }
    }
	*/
	/**
	public void chargeRepairPlan() {
        if (isHasRepairPlan()) {
            for (int i = 0; i < repairPlans.size(); i++) {
                amountDue = repairPlans.get(i).getRepairCost(); // getRepairCost() not yet implemented
            }
        }
    }
*/
	public String toString() {
		return "Customer ID: " + customerID + ", Name: " + name + ", Address: " + address + ", Phone Number: "
				+ phoneNumber + ", Has Repair Plan: " + hasRepairPlan;
	}

	public static void retrieve(ObjectInputStream input) throws ClassNotFoundException, IOException {
		id= (int) input.readObject();
		
	}
	public static void save(ObjectOutputStream output) throws IOException {
		output.writeObject(id);
	}

	}

