package hust.soict.hedspi.aims.order;

import java.util.ArrayList;

import hust.soict.hedspi.aims.media.Media;
import hust.soict.hedspi.aims.media.book.Book;
import hust.soict.hedspi.aims.media.disc.CompactDisc;
import hust.soict.hedspi.aims.media.disc.DigitalVideoDisc;
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
			System.err.println("The media with title: " + media.getTitle() + " is existed!");
		}else if(checkId(media.getId())) {
			System.err.println("The media with id: " + media.getId() + " is existed!");
		}else{
			itemsOrdered.add(media);
			System.out.println("***The media with title: " + media.getTitle() + " has been added");
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
			System.out.println("***Media with ID: " + media.getId() + " has been deleted!");
		}else {
			System.err.println("Can't not find!");
		}
	}
	
	public void removeMedia(String id) {
		int mark =0;
		for(Media media: itemsOrdered) {
			if(media.getId().equalsIgnoreCase(id)) {
				removeMedia(media);
				mark = 1;
				break;
			}
		}
		if(mark == 0) {
			System.err.println("Can't find id");
		}
	}
	
	public float totalCost() {
		float total = 0.0f;
		for(int i = 0; i < itemsOrdered.size(); i++) {
			total += itemsOrdered.get(i).getCost();
		}
		return total;
	}

	public void printListOfOrdered() {
		System.out.println("********************************ORDER******************************");
		dateOrdered.print();
		int i = 1;
		System.out.printf("%-3s | %-6s | %-5s | %-15s | %-10s : %-10s%n", "STT", "Type", "ID", "Title", "Category", "Total");
		for(Media media: itemsOrdered) {
			if(media instanceof Book) {
				System.out.printf("%-3s | %-6s | %-5s | %-15s | %-10s : %-10s$%n", i, "Book", media.getId(), media.getTitle(), media.getCategory(), media.getCost());
			}else if(media instanceof DigitalVideoDisc) {
				System.out.printf("%-3s | %-6s | %-5s | %-15s | %-10s : %-10s$%n", i, "DVD", media.getId(), media.getTitle(), media.getCategory(), media.getCost());
			}else if(media instanceof CompactDisc) {
				System.out.printf("%-3s | %-6s | %-5s | %-15s | %-10s : %-10s$%n", i, "CD", media.getId(), media.getTitle(), media.getCategory(), media.getCost());
			}
			i++;
		}
		System.out.println("Total cost: " + totalCost());
		System.out.println("*******************************************************************");
	}
	
	public boolean checkId(String id) {
		for(Media media: itemsOrdered) {
			if(media.getId().equalsIgnoreCase(id)) {
				return true;
			}
		}
		return false;
	}
	
//	public Media getALuckyItem() {
//		double rand = Math.random();
//		rand *= itemsOrdered.size();
//		int item = (int)rand;
//		itemsOrdered.get(item).setCost(0.0f);
//		return itemsOrdered.get(item);
//	}
	
}
