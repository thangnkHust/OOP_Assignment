
public class Order {
	private int qtyOrdered = 0;
	public static final int MAX_NUMBER_ORDERS = 10;
	
	public static final int MAX_LIMITTED_ORDERS = 5;
	private static int nbOrders = 0;
	
	private MyDate dateOrdered = new MyDate();
	
	// Array storage ordered
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBER_ORDERS];
	
	public MyDate getDateOrdered() {
		return dateOrdered;
	}

	private Order() {
		nbOrders++;
	}
	
	// call constructor 
	public static Order createdOrder() {
		if(nbOrders < MAX_LIMITTED_ORDERS) {
			Order objOrder = new Order();
			return objOrder;
		}else {
			System.err.println("The limitted orders is almost full!");
			return null;
		}
	}

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
			System.err.println("The order is almost full");
		}
	}
	
	// method add with array parameter
//	public void addDigitalVideoDisc(DigitalVideoDisc [] dvdList){
//		for(int i = 0; i < dvdList.length ; i++) {
//			addDigitalVideoDisc(dvdList[i]);
//		}
//	}
	
	// method add with arbitrary number of argument
	public void addDigitalVideoDisc(DigitalVideoDisc... dvdList){
		for(int i = 0; i < dvdList.length ; i++) {
			addDigitalVideoDisc(dvdList[i]);
		}
	}
	
	public void addDigitalVideoDisc(DigitalVideoDisc dvd1,DigitalVideoDisc dvd2) {
		addDigitalVideoDisc(dvd1);
		addDigitalVideoDisc(dvd2);
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
	
	public void printListOfOrdered() {
		System.out.println("********************************ORDER " + nbOrders + "******************************");
		dateOrdered.print();
		for(int i = 0; i < qtyOrdered; i++) {
			System.out.println(i+1 + ". DVD - " + itemsOrdered[i].getTitle() + " - " + itemsOrdered[i].getCategory() + " - " + itemsOrdered[i].getDirector() + " - " + itemsOrdered[i].getLength() + ": " + itemsOrdered[i].getCost() + "$");
		}
		System.out.println("Total cost: " + totalCost());
		System.out.println("*******************************************************************");
	}
	
}
