
public class Order {
	private int qtyOrdered = 0;
	public static final int MAX_NUMBER_ORDERS = 10;
	
	// Array storage ordered
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBER_ORDERS];

	// Get quantity ordered
	public int getQtyOrdered() {
		return qtyOrdered;
	}
	
//	Change qtyOrder --> Don't need setQtyOrder method
//	public void setQtyOrdered(int qtyOrdered) {
//		this.qtyOrdered = qtyOrdered;
//	}
	
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if(qtyOrdered < MAX_NUMBER_ORDERS) {
			itemsOrdered[qtyOrdered] = disc;
			qtyOrdered ++;
			System.out.println("The disc with title: " + disc.getTitle() + " has been added");
		}else {
			System.out.println("The order is almost full");
		}
	}
	
	public float totalCost() {
		float total = 0.0f;
		for(int i = 0; i < qtyOrdered; i++) {
			total += itemsOrdered[i].getCost();
		}
		return total;
	}
	
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		int i, c;
		// Delete an element of itemsOrdered
		for (c = i = 0; i < qtyOrdered; i++) {
			if(itemsOrdered[i] != disc) {
				itemsOrdered[c] = itemsOrdered[i];
				c++;
			}
		}
		// Update qtyOrder
		if(c == i) {
			System.out.println("Can't find disc with title: " + disc.getTitle() + " of itemsOrdered");
		}else {
			System.out.println("The disc with titile: " + disc.getTitle() + " has been removed");
			qtyOrdered--;
		}
	}
	
}
