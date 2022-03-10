package edu.ics372.companyv1.business.iterators;

import java.util.Iterator;

import edu.ics372.companyv1.business.entities.Customer;
import edu.ics372.companyv1.business.facade.Result;

//All the Customers from input of UI 
public class SafeCustomerIterator implements Iterator<Result> {
	private Iterator<Customer> iterator;
	private Result result = new Result();
	
	public SafeCustomerIterator(Iterator<Customer> iterator) {
		this.iterator = iterator;
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return iterator.hasNext();
	}

	@Override
	public Result next() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
