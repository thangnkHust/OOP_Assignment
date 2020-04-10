package hust.soict.hedspi.lab02;

import java.util.Scanner;

public class DayOfAMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String month[] = {
				"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"
		};
		String abbreviation[] = {
				"Jan.", "Feb.", "Mar.", "Apr.", "May", "June", "July", "Aug.", "Sept.", "Oct.", "Nov.", "Dec."
		};
		String in3Letter[] = {
				"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"
		};
		String inNumber[] = {
				"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"
		};
		int commonYear[] = {
				31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
		};
		
		int leapYear[] = {
				31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
		};
		
		Scanner keyboard = new Scanner(System.in);
		
		/*
		 * Input from keyboard */
		System.out.printf("Enter year: ");
		int year = keyboard.nextInt();
		System.out.printf("Enter month: ");
		keyboard.nextLine();
		String monthOfYear = keyboard.nextLine();
		
		/*
		 * Check invalid input of month*/
		int f1 = find(month, monthOfYear);
		int f2 = find(abbreviation, monthOfYear);
		int f3 = find(in3Letter, monthOfYear);
		int f4 = find(inNumber, monthOfYear);
		while(f1 == -1 && f2 == -1 && f3 == -1 && f4 == -1) {
			System.out.println("Invalid enterd month");
			System.out.printf("Enter month: ");
			monthOfYear = keyboard.nextLine();
			f1 = find(month, monthOfYear);
			f2 = find(abbreviation, monthOfYear);
			f3 = find(in3Letter, monthOfYear);
			f4 = find(inNumber, monthOfYear);
		}
		
		/*
		 * Check leap year?
		 * Search number day of month*/
		int temp;
		if(f1 != -1)
			temp = f1;
		else if(f2 != -1)
			temp = f2;
		else if(f3 != -1)
			temp = f3;
		else
			temp = f4;
		if(checkLeapYear(year)) {
			System.out.printf("Number day of %s is %d %n", monthOfYear, leapYear[temp-1]);
		}else {
			System.out.printf("Number day of %s is %d %n", monthOfYear, commonYear[temp-1]);
		}
//		System.out.println(checkLeapYear(year));
		
		
	}
	
	public static int find(String month[], String select) {
		for (int i = 0; i < month.length; i++) {
			if (month[i].equalsIgnoreCase(select)) {
				return i+1;
			}
		}
		return -1;
	}
	
	public static boolean checkLeapYear(int year) {
		if(year%4 == 0) {
			if(year%100 == 0 && year%400 != 0) {
				return false;
			}
			return true;
		}
		return false;
	}

}
