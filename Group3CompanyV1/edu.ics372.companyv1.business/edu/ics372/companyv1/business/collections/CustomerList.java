package edu.ics372.companyv1.business.collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import edu.ics372.companyv1.business.entities.Customer;

public class CustomerList implements Iterable<Customer> {
	private List<Customer> customer = new LinkedList<Customer>();
	private static CustomerList customerList;
	
	private CustomerList() {
	}
	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}

}
