package GroupProject1;

public class BackOrder extends Order {
	private static final String BACKORDER_STRING = "BO";
	
	public BackOrder(Customer cust) {
		super(cust);
	}

	@Override
	public void setOrderID() {
		super.orderID = BACKORDER_STRING + IDserver.instance().getOrderID();
	}

	@Override
	public String toString() {
		return "BackOrder >> " + super.toString();
	}
}
