package edu.ics372.companyv1.business.facade;

import java.io.Serializable;

public class Company implements Serializable{
	private static Company company;
	private Company() {
		
	}
	
	public static Company instance() {
		if(company == null) {
			return company = new Company();
		}else {
			return company;
		}
	}
}
