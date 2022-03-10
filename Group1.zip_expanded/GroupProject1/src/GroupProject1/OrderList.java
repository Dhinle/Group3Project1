package GroupProject1;

import java.util.LinkedList;
import java.util.List;

public class OrderList {
	// create the needed list
	private static OrderList orderList;
	private List<Order> orders;
	private List<RepairPlan> repairPlans;

	private OrderList() {
		orders = new LinkedList<Order>();
		repairPlans = new LinkedList<RepairPlan>();
	}

	public static OrderList instance() {
		if (orderList == null) {
			return (orderList = new OrderList());
		} else {
			return orderList;
		}
	}

	public boolean insertOrder(Customer cust, List<ItemList> itemList) {
		Order regularOrder = new RegularOrder(cust);
		Order backOrder = new BackOrder(cust);
		for (int i = 0; i < itemList.size(); i++) {
			if (checkInStockAppliance(itemList.get(i))) {
				regularOrder.add(itemList.get(i));
			} else {
				if (itemList.get(i).getAppliance().getClass() != Furnace.class) {
					backOrder.add(itemList.get(i));
				}
			}
		}
		if (!regularOrder.getItemList().isEmpty() && !backOrder.getItemList().isEmpty()) {
			orders.add(regularOrder);
			orders.add(backOrder);
			return true;
		} else if (!regularOrder.getItemList().isEmpty()) {
			orders.add(regularOrder);
			return true;
		} else if (!backOrder.getItemList().isEmpty()) {
			orders.add(backOrder);
			return true;
		}
		return false;
	}

	public void fulfillBackOrder(Order backOrder) {
		Order regularOrder = new RegularOrder(backOrder.getCustomer(), backOrder.getItemList());
		orders.remove(backOrder);
		orders.add(regularOrder);
		regularOrder.setOrderID();
	}

	public Order getOrder(String orderId) {
		for(Order ord : orders) {
			if(ord.getOrderID().equalsIgnoreCase(orderId)) {
				return ord;
			}
		}
		return null;
	}

	private boolean checkInStockAppliance(ItemList item) {
		if (item.getAppliance().getInStock() > item.getQuantity()) {
			return true;
		}
		return false;
	}

}
