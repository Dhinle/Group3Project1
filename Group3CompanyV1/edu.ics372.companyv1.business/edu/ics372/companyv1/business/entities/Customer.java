package edu.ics372.companyv1.business.entities;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.LinkedList;
import java.util.List;

public class Customer {
	private String name;
	private String address;
	private String phone;
	private String id;
	private static final String CUSTOMER_STRING = "C";
	private List<Appliance> orderList = new LinkedList<Appliance>();
	private static int idCounter;
	
	public Customer(String name, String address, String phone) {
		this.name = name;
		this.address = address;
		this.phone = phone; 
		id = CUSTOMER_STRING + ++idCounter;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getId() {
		return id;
	}

	public static void retrieve(ObjectInputStream input) throws ClassNotFoundException, IOException {
		idCounter = (int) input.readObject();
		
	}
}
