package GroupProject1;

public class ItemList {
	Appliance ap;
    int quantity;
    
    public ItemList(Appliance ap, int quantity) {
        this.ap = ap;
        this.quantity = quantity;
    }
    

    public Appliance getAppliance() {
		return ap;
	}


	public int getQuantity() {
		return quantity;
	}


	public String toString() {
        return "\n\t" + ap.getApplianceID() + " " + quantity;
    }
}
