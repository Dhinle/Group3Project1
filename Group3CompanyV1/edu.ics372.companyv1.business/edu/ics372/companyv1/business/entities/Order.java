package edu.ics372.companyv1.business.entities;

import java.util.LinkedList;
import java.util.List;

public abstract class Order {
	protected String orderID;
	private Customer cust;
	private List<ItemList> itemLists = new LinkedList<ItemList>();

	public Order(Customer cust) {
		this.cust = cust;
	}

	public Order(Customer cust, List<ItemList> itemList) {
		this.cust = cust;
		itemLists.addAll(itemList);
	}

	public void add(ItemList item) {
		itemLists.add(item);
	}

	public String getOrderID() {
		return orderID;
	}

	public abstract void setOrderID();

	public Customer getCustomer() {
		return cust;
	}

	public List<ItemList> getItemList() {
		return itemLists;
	}

	public String toString() {
		String result = "Order ID: " + orderID + ", Customer ID: " + cust.getCustomerID();
		for (int i = 0; i < itemLists.size(); i++) {
			result += itemLists.get(i).toString();
		}
		return result;
	}

}
