package hust.soict.hedspi.aims;

import java.util.Scanner;

import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.media.Media;
import hust.soict.hedspi.aims.order.Order;

public class DiskTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// dvd1
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King");
		dvd1.setCategory("Animation");
		dvd1.setCost(19.95f); 
		dvd1.setLength(87);
		dvd1.setDirector("Roger Allers");
		
		// dvd2
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars");
		dvd2.setCategory("Science Fiction");
		dvd2.setCost(24.95f);
		dvd2.setDirector("George Lucas");
		dvd2.setLength(124);
		
		// dvd3
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin");
		dvd3.setCategory("Animation");
		dvd3.setCost(18.99f);
		dvd3.setDirector("John Musker");
		dvd3.setLength(90);
		
		// dvd4
		DigitalVideoDisc dvd4 = new DigitalVideoDisc("test1", "test1", "author 1", 123, 15.5f);
		
		// dvd5
		DigitalVideoDisc dvd5 = new DigitalVideoDisc("test2", "test2", "author 2", 80, 19.5f);
		
		// Create order
		Order anOrder = Order.createdOrder();
		anOrder.addMedia(dvd1, dvd2, dvd3, dvd4, dvd5);
		
		// test search title
//		int mark = 0;
//		Scanner sc = new Scanner(System.in);
//		System.out.println("======Nhap title muon tim kiem: ========");
//		String title = sc.nextLine();
//		System.out.println("======Ket qua tim kiem: =======");
//		for(DigitalVideoDisc disc: anOrder.itemsOrdered) {
//			if(disc != null && disc.search(title)) {
//				mark = 1;
//				System.out.println(disc.getTitle());
//			}
//		}
//		if(mark == 0) {
//			System.out.println("Khong co ket qua tim kiem");
//		}
		
		System.out.println("=========================================");
		// total cost before get lucky
		System.out.printf("Tong tien truoc khi giam gia: %f %n", anOrder.totalCost());
		Media luckyItem = anOrder.getALuckyItem();
		System.out.printf("San pham may man la: %s %n", luckyItem.getTitle());
		// total cost after get lucky
		System.out.printf("Tong tien sau khi giam gia: %f %n", anOrder.totalCost());
//		sc.close();
	}

}
