package GroupProject1;

public class IDserver {
	private int applianceID;
	private int customerID;
	private int orderID;
	private static IDserver idServer;
	
	private IDserver() {
		this.applianceID = 1;
		this.customerID = 1;
		this.orderID = 1;
	}
	
	public static IDserver instance() {

		if (idServer == null) {
			return (idServer = new IDserver());
		} else {
			return idServer;
		}
	}
	
	public String getApplianceID() {
        String digit = "";
        if(applianceID < 10) {
            digit = "000";
        } else if(applianceID > 10 && applianceID < 100) {
            digit = "00";
        }
        return digit + applianceID++;
    }

    public String getCustomerID() {
        String digit = "";
        if(customerID < 10) {
            digit = "000";
        } else if(customerID > 10 && customerID < 100) {
            digit = "00";
        }
        return digit + customerID++;
    }

    public String getOrderID() {
        String digit = "";
        if(orderID < 10) {
            digit = "000";
        } else if(orderID > 10 && orderID < 100) {
            digit = "00";
        }
        return digit + orderID++;
    }
}
