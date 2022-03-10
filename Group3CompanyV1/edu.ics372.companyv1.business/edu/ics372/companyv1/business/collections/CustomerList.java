package edu.ics372.companyv1.business.collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import edu.ics372.companyv1.business.entities.Customer;
import edu.ics372.companyv1.business.facade.Result;

public class CustomerList implements Iterable<Customer> {
	private List<Customer> customers = new LinkedList<Customer>();
	private static CustomerList customerList;
	
	private CustomerList() {
	}
	public static CustomerList getInstance() {
		if(customerList == null) {
			return (customerList = new CustomerList());
		}
		return customerList;
	}
	
	public boolean insertCustomer(Customer newCustomer) {
		if(!checkDuplicates(newCustomer)) {
			customers.add(newCustomer);
			newCustomer.setCustomerID();
			return true;
		}
		return false;
	}
	
	public Customer searchCustomer(String customerID) {
		for(Customer cu : customers) {
			if(cu.getCustomerID().equalsIgnoreCase(customerID)) {
				return cu;
			}
		}
		return null;
	}
	

	public Iterator<Customer> displayCustomer() {
		return customers.iterator();
	}
	
	
	private boolean checkDuplicates(Customer newCustomer) {
		for(Customer cu: customers) {
			if(cu.getName().equalsIgnoreCase(newCustomer.getName()) && 
					cu.getAddress().equalsIgnoreCase(newCustomer.getAddress())) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}

}
