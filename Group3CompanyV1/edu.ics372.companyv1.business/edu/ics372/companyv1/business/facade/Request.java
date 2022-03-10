package edu.ics372.companyv1.business.facade;
// use to request many of result
public class Request extends DataTransfer {
	private static Request request;
	private int applianceType;
	private Request() {
	
	}
	
	public static Request instance() {
		if(request == null) {
			request = new Request();
		}
		return request;
	}
	
	public int getType() {
		return applianceType;
	}
	public void setType(int applianceType) {
		this.applianceType = applianceType;
	}
}
