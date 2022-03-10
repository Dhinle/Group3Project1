package edu.ics372.companyv1.business.entities;

import java.util.List;

public class RegularOrder extends Order {
	private static final String REGULARORDER_STRING = "RO";

	public RegularOrder(Customer cust) {
		super(cust);
	}

	public RegularOrder(Customer cust, List<ItemList> lineItem) {
		super(cust, lineItem);
	}

	@Override
	public void setOrderID() {
		super.orderID = REGULARORDER_STRING + IDserver.instance().getOrderID();
	}

	@Override
	public String toString() {
		return "Regular Order >> " + super.toString();
	}
}
