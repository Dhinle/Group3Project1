package GroupProject1;

import java.util.LinkedList;
import java.util.List;

public class CustomerList {
	private List<Customer> customers;
	private static CustomerList customerList;
	
	private CustomerList() {
		customers = new LinkedList<Customer>();
	}
	
	public static CustomerList instance() {
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
	

	public void displayCustomer() {
		for(int i = 0; i < customers.size(); i++) {
			System.out.println(customers.get(i).toString());
		}
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
	
}
