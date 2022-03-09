package edu.ics372.companyv1interface;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import edu.ics372.companyv1.business.facade.Company;

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
	private static final int PRINT_REVENUE = 8;
	private static final int LIST_APPLIANCES = 9;
	private static final int LIST_USER_IN_REPAIR_PLAN = 10;
	private static final int LIST_CUSTOMER = 11;
	private static final int LIST_BACKORER = 12;
	private static final int SAVE = 13;
	
	
	
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
	

	private int getCommand() {
		// TODO Auto-generated method stub
		return 0;
	}

	private void help() {
		// TODO Auto-generated method stub
		
	}
	/**
	 * call appropriate method for the funstionalities
	 * @param args
	 */
	public void progress() {
		int command;
		help();
		while((command = getCommand()) != EXIT) {
			switch(command) {
			case ADD_MODEL:
				break;
			case ADD_CUSTOMER:
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
				break;
			case LIST_BACKORER:
				break;
			case SAVE:
				break;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
