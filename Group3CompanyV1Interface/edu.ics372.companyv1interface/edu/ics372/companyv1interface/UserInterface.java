package edu.ics372.companyv1interface;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.StringTokenizer;

import edu.ics372.companyv1.business.facade.Company;
import edu.ics372.companyv1.business.facade.Request;
import edu.ics372.companyv1.business.facade.Result;

public class UserInterface {
	private static Company company;
	private static UserInterface userInterface;
	private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static final int EXIT = 0;
	private static final int ADD_MODEL = 1;
	private static final int ADD_CUSTOMER = 2;
	private static final int ADD_INVENTORY = 3;
	private static final int PURCHASE_FOR_A_CUSTOMER = 4;
	private static final int FULLFILL_BACKORDER = 5;
	private static final int ENROLL_REPAIR = 6;
	private static final int WITHDRAW_REPAIR = 7;
	private static final int CHARGE_REPAIR_PLANS = 8;
	private static final int PRINT_REVENUE = 9;
	private static final int LIST_APPLIANCES = 10;
	private static final int LIST_USER_IN_REPAIR_PLAN = 11;
	private static final int LIST_CUSTOMER = 12;
	private static final int LIST_BACKORER = 13;
	private static final int SAVE = 14;
	private static final int HELP =15;
	
	
	private UserInterface() {
		if (yesOrNo("Look for saved data and  use it?")) {
			retrieve();
		} else {
			company = Company.instance();
		}

	}

private void retrieve() {
	try {
		if (company == null) {
			company = company.retrieve();
			if (company != null) {
				System.out.println(" The Company has been successfully retrieved from the file LibraryData \n");
			} else {
				System.out.println("File doesnt exist; creating new library");
				company = company.instance();
			}
		}
	} catch (Exception cnfe) {
		cnfe.printStackTrace();
	}
		
	}

/**
 * Singleton pattern
 * @return the singleton object
 */
	public static UserInterface instance() {
		if(userInterface == null) {
			return userInterface = new UserInterface();
		}else {
			return userInterface;
		}
	}
	
	public String getToken(String prompt) {
		do {
			try {
				System.out.println(prompt);
				String line = reader.readLine();
				StringTokenizer tokenizer = new StringTokenizer(line, "\n\r\f");
				if (tokenizer.hasMoreTokens()) {
					return tokenizer.nextToken();
				}
			} catch (IOException ioe) {
				System.exit(0);
			}
		} while (true);
	}

	
	/**
	 * get a name from actor
	 * @return 
	 */
	public String getName(String prompt) {
		do {
			try {
				//ask user input
				System.out.println(prompt);
				String line = reader.readLine();
				return line;
			}
			catch(IOException ioe) {
				System.exit(0);
			}
		}while(true);
	}
	
	public int getNumber(String prompt) {
		do {
			try {
				String item = getToken(prompt);
				Integer number = Integer.valueOf(item);
				return number.intValue();
			} catch (NumberFormatException nfe) {
				System.out.println("Please input a number ");
			}
		} while (true);
	}
	
	
	private boolean yesOrNo(String prompt) {
		String more = getToken(prompt + " (Y|y)[es] or anything else for no");
		if (more.charAt(0) != 'y' && more.charAt(0) != 'Y') {
			return false;
		}
		return true;
	}
	private int getCommand() {
		do {
			try {
				int value = Integer.parseInt(getToken("Enter command:" + HELP + " for help"));
				if (value >= EXIT && value <= HELP) {
					return value;
				}
			} catch (NumberFormatException nfe) {
				System.out.println("Enter a number");
			}
		} while (true);
	}

	private void help() {
		System.out.println(ADD_MODEL +" to add a single model");
		System.out.println(ADD_CUSTOMER + " to add a customer");
		System.out.println(LIST_CUSTOMER+ " to list all customers");
		
	}
	/**
	 * use case 1 : add single model
	 */
	private void addModel() {
		// TODO Auto-generated method stub
		do {
			Request.instance().setType(getNumber("Choose type: 1: dryer 2: 3 4"));
			Request.instance().setBrandName(getName("Enter Brand Name: "));
			Request.instance().setModelName(getName("Enter Model Name"));
			//different attribute
		
		}
		while(yesOrNo("Add more appliance?"));
		
	}
	/**
	 * use case 2: add Customer
	 */
	private void addCustomer() {

		Request.instance().setName(getName("Enter the name of the customer"));
		Request.instance().setAddress(getName("Enter the address of the customer"));
		Request.instance().setPhone(getName("Enter the phone number of the customer"));
		Result result = company.addCustomer(Request.instance());
		if (result.getResutInt() == Result.OPERATION_COMPLETED) {
			System.out.println(result.getName() + "'s id is " + result.getId());

		} else {
			System.out.println("System is unable to add the customer");
		}

	}
	/**
	 * Use case 12: List customer
	 */
	private void getCustomerList() {
		Iterator<Result> iterator = company.listCustomer();
		System.out.println("List of customer(name, address, phone, id)");
		while(iterator.hasNext()) {
			Result result = iterator.next();
			System.out.println(result.getId()+" "+result.getName()+" "+ result.getAddress()
			+ " "+ result.getPhone());
		}
		System.out.println("End of the cutomer list");
	}
	/**
	 * Use case 15 : Save
	 */
	private void save() {
		if(company.save()) {
			System.out.println("Saved");
		}
		else {
			System.out.println("Save Error");
		}
		
	}
	/**
	 * call appropriate method for the functionalities
	 * @param args
	 */
	public void progress() {
		int command;
		help();
		while((command = getCommand()) != EXIT) {
			switch(command) {
			case ADD_MODEL:
				addModel();
				break;
			case ADD_CUSTOMER:
				addCustomer();
				break;
			case ADD_INVENTORY:
				break;
			case PURCHASE_FOR_A_CUSTOMER:
				break;
			case FULLFILL_BACKORDER:
				break;
			case ENROLL_REPAIR:
				break;
			case WITHDRAW_REPAIR:
				break;
			case PRINT_REVENUE:
				break;
			case LIST_APPLIANCES:
				break;
			case LIST_USER_IN_REPAIR_PLAN:
				break;
			case LIST_CUSTOMER:
				getCustomerList();
				break;
			case LIST_BACKORER:
				break;
			case SAVE:
				save();
				break;
			case HELP:
				break;
			}
		}
	}

	


	

	

	public static void main(String[] args) {
		UserInterface.instance().progress();
	}

}
