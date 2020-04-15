package hust.soict.hedspi.aims;

//import java.util.ArrayList;
import java.util.Scanner;

import hust.soict.hedspi.aims.media.Book;
import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.order.Order;

public class Aims {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int selection;
		int case1 = 0;
		Order anOrder = null;
		do {
			showMenu();
			selection = sc.nextInt();
			switch (selection) {
			case 1:
				anOrder = Order.createdOrder();
				System.out.println("***Creat new order successfully!");
				case1 = 1;
				break;
			case 2:
				if(case1 == 0) {
					System.err.println("Hay nhap case 1!");
					break;
				}
				int temp = 0;
				String id, title, category, director;
				int length;
				float cost;
				do {
					showMenuMedia();
					temp = sc.nextInt();
					switch (temp) {
					case 1:
						sc.nextLine();
						System.out.printf("\tNhap id: ");
						id = sc.nextLine();
						System.out.printf("\tNhap title: ");
						title = sc.nextLine();
						System.out.printf("\tNhap category: ");
						category = sc.nextLine();
						System.out.printf("\tNhap cost: ");
						cost = sc.nextFloat();
						System.out.printf("\tNhap author: ");
						// Add author
//						String author = sc.nextLine();
//						ArrayList<String> authorsList = new ArrayList<String>();
//						authorsList.add(author);
						Book anBook = new Book(id, title, category, cost);
						anOrder.addMedia(anBook);
						break;
					case 2:
						sc.nextLine();
						System.out.printf("\tNhap id: ");
						id = sc.nextLine();
						System.out.printf("\tNhap title: ");
						title = sc.nextLine();
						System.out.printf("\tNhap category: ");
						category = sc.nextLine();
						System.out.printf("\tNhap director: ");
						director = sc.nextLine();
						System.out.printf("\tNhap cost: ");
						cost = sc.nextFloat();
						System.out.printf("\tNhap length: ");
						length = sc.nextInt();
						DigitalVideoDisc dvd = new DigitalVideoDisc(id, title, category, length, cost);
						dvd.setDirector(director);
						anOrder.addMedia(dvd);
						break;
					case 0:
						System.out.println("Exit submenu!");
						break;
					default:
						System.err.println("Error input enter, again!");
					}
				} while (temp != 0);
				break;
			case 3:
				if(case1 == 0) {
					System.err.println("Hay nhap case 1!");
					break;
				}
				sc.nextLine();
				System.out.printf("Nhap id: ");
				id = sc.nextLine();
				anOrder.removeMedia(id);
				break;
			case 4:
				if(case1 == 0) {
					System.err.println("Hay nhap case 1!");
					break;
				}
				if(anOrder.itemsOrdered.isEmpty()) {
					System.err.println("List of Order is empty!");
				}else {
					anOrder.printListOfOrdered();
				}
				break;
			case 0:
				sc.close();
				System.out.println("Bye!!!");
				break;
			default:
				sc.close();
				System.err.println("Error input enter, again!");
			}
		} while (selection != 0);
		
	}
	
	// Maintain menu
	public static void showMenu() {
		System.out.println("Order Management Application: "); 
		System.out.println("--------------------------------"); 
		System.out.println("1. Create new order"); 
		System.out.println("2. Add item to the order"); 
		System.out.println("3. Delete item by id"); 
		System.out.println("4. Display the items list of order"); 
		System.out.println("0. Exit"); 
		System.out.println("--------------------------------"); 
		System.out.println("Please choose a number: 0-1-2-3-4");
	}
	
	// Menu select Book or DVD
	public static void showMenuMedia() {
		System.out.println("Select add Book or DVD "); 
		System.out.println("--------------------------------"); 
		System.out.println("1. Book"); 
		System.out.println("2. DVD"); 
		System.out.println("0. Exit"); 
		System.out.println("--------------------------------"); 
		System.out.println("Please choose a number: 0-1-2");
	}

}
