package hust.soict.hedspi.aims.order;

import java.util.ArrayList;
import hust.soict.hedspi.aims.media.Media;
import hust.soict.hedspi.aims.utils.MyDate;

public class Order {
	public static final int MAX_NUMBER_ORDERS = 10;
	
	public static final int MAX_LIMITTED_ORDERS = 5;
	private static int nbOrders = 0;
	
	private MyDate dateOrdered = new MyDate();
	
	public ArrayList<Media> itemsOrdered = new ArrayList<Media>();
	
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
	
	public void addMedia(Media media) {
		if(itemsOrdered.contains(media)) {
			System.out.println("The media with title: " + media.getTitle() + " is existed!");
		}else {
			itemsOrdered.add(media);
			System.out.println("The media with title: " + media.getTitle() + " has been added");
		}
	}
	
	public void addMedia(Media... mediaList) {
		for(int i = 0; i < mediaList.length; i++) {
			addMedia(mediaList[i]);
		}
	}
	
	public void removeMedia(Media media) {
		if(itemsOrdered.contains(media)) {
			itemsOrdered.remove(media);
		}else {
			System.out.println("Can't not find!");
		}
	}
	
//	public void addDigitalVideoDisc(DigitalVideoDisc dvd1,DigitalVideoDisc dvd2) {
//		addDigitalVideoDisc(dvd1);
//		addDigitalVideoDisc(dvd2);
//	}
//	
	public float totalCost() {
		float total = 0.0f;
		for(int i = 0; i < itemsOrdered.size(); i++) {
			total += itemsOrdered.get(i).getCost();
		}
		return total;
	}

//	public void printListOfOrdered() {
//		System.out.println("********************************ORDER " + nbOrders + "******************************");
//		dateOrdered.print();
//		for(int i = 0; i < qtyOrdered; i++) {
//			System.out.println(i+1 + ". DVD - " + itemsOrdered[i].getTitle() + " - " + itemsOrdered[i].getCategory() + " - " + itemsOrdered[i].getDirector() + " - " + itemsOrdered[i].getLength() + ": " + itemsOrdered[i].getCost() + "$");
//		}
//		System.out.println("Total cost: " + totalCost());
//		System.out.println("*******************************************************************");
//	}
	
	public Media getALuckyItem() {
		double rand = Math.random();
		rand *= itemsOrdered.size();
		int item = (int)rand;
		itemsOrdered.get(item).setCost(0.0f);
		return itemsOrdered.get(item);
	}
	
}
