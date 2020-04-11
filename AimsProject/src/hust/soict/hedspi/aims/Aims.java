package hust.soict.hedspi.aims;

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
//						System.out.printf("\tNhap author: ");
//						String author = sc.nextLine();
						Book anBook = new Book(title, category, cost);
						anBook.setId(id);
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
						DigitalVideoDisc dvd = new DigitalVideoDisc(title, category, director, length, cost);
						dvd.setId(id);
						anOrder.addMedia(dvd);
						break;
					case 0:
						System.out.println("Exit submenu!");
						break;
					default:
//						throw new IllegalArgumentException("Unexpected value: " + temp);
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
				anOrder.printListOfOrdered();
				break;
			case 0:
				sc.close();
				System.out.println("Bye!!!");
				break;
			default:
				sc.close();
//				throw new IllegalArgumentException("Unexpected value: " + selection);
				System.err.println("Error input enter, again!");
			}
		} while (selection != 0);
		
	}
	
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
