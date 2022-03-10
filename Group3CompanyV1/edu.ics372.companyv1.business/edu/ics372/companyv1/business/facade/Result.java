package edu.ics372.companyv1.business.facade;

public class Result extends DataTransfer {
	public static final int APPLIANCE_NOT_FOUND =1;
	public static final int CUSTOMER_NOT_FOUND =2;
	public static final int OPERATION_COMPLETED =3;
	public static final int OPERATION_FAILED= 4;
	
	private int resultInt;
	
	public int getResutInt() {
		return resultInt;
	}
	
	public void setResultInt(int resultInt) {
		this.resultInt = resultInt;
	}
}
