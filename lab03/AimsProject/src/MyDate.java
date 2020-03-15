import java.util.Calendar;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import javax.xml.crypto.Data;

public class MyDate {
	private int day;
	private int month;
	private int year;
	
	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		if(month == 2) {
			if(checkLeapYear(year)) {
				if(day > 0 && day <= 29) {
					this.day = day;
				}else {
					System.err.println("Error in input day");
				}
			}else {
				if(day > 0 && day <= 28) {
					this.day = day;
				}else {
					System.err.println("Error in input day");
				}
			}
		}else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			if(day > 0 && day <= 31) {
				this.day = day;
			}else {
				System.err.println("Error in input day");
			}
		}else {
			if(day > 0 && day <= 30) {
				this.day = day;
			}else {
				System.err.println("Error in input day");
			}
		}
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if(month > 0 && month <= 12) {
			this.month = month;
		}else {
			System.err.println("Error in input month");
			return;
		}
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	// Constructor with current time
	public MyDate() {
		super();
		// Create Calendar object return current date
		Calendar calObj = Calendar.getInstance();
		// set day, month, year of current date
		setYear(calObj.get(Calendar.YEAR));
		setMonth(calObj.get(Calendar.MONTH) + 1);
		setDay(calObj.get(Calendar.DAY_OF_MONTH));
	}
	
	// Constructor with 3 parameter
	public MyDate(int day, int month, int year) {
		super();
		setYear(year);
		setMonth(month);
		setDay(day);
	}
	
	// Constructor with date(string) -> convert to date
	// If dataInString is empty string then Enter from keyboard
	public MyDate(String dateInString) {
		super();
		if (dateInString == "") {
			dateInString = accept();
		}
		// Set a new format of date
		SimpleDateFormat formatter = new SimpleDateFormat("MMM dd yyyy");
		try {
			// Convert string to Date object
			Date date = formatter.parse(dateInString);
			Calendar calObj = Calendar.getInstance();
			calObj.setTime(date);
			setYear(calObj.get(Calendar.YEAR));
			setMonth(calObj.get(Calendar.MONTH) + 1);
			setDay(calObj.get(Calendar.DAY_OF_MONTH));
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
	public String accept() {
		Scanner sc = new Scanner(System.in);
		System.out.printf("Enter date(example:'July 15 1999'): ");
		String dateInString = sc.nextLine();
		return dateInString;
	}
	
	// Check Leap Year
	public static boolean checkLeapYear(int year) {
		if(year%4 == 0) {
			if(year%100 == 0 && year%400 != 0) {
				return false;
			}
			return true;
		}
		return false;
	}
	
	// Print current date to the screen
	public void print() {
		System.out.printf("Ngay/Thang/Nam: %d/%d/%d %n", getDay(), getMonth(), getYear());
	}
	
	
}
