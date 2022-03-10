package edu.ics372.companyv1.business.entities;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.LinkedList;
import java.util.List;


public class Customer {
	private String customerID;
	private String name;
	private String address;
	private long phoneNumber;
	private boolean hasRepairPlan;
	private static final String CUSTOMER_STRING = "CU";

	public Customer(String name, String address, long phoneNumber) {
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

	public long getPhoneNumber() {
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
	


	public String toString() {
		return "Customer ID: " + customerID + ", Name: " + name + ", Address: " + address + ", Phone Number: "
				+ phoneNumber + ", Has Repair Plan: " + hasRepairPlan;
	}

	}

