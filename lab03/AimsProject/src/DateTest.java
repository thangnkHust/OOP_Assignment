
public class DateTest {

	public static void main(String[] args) {
		
//		Test Constructor no parameter 
		MyDate testDate = new MyDate();
		System.out.println("Test Case 1: ");
		testDate.print();
		
//		Test Constructor 3 parameter
		MyDate testDate2 = new MyDate(30, 4, 2019);
		System.out.println("Test Case 2: ");
		testDate2.print();
		
//		Test Constructor with 1 string parameter 
		MyDate testDate3 = new MyDate("June 08 2020");
		System.out.println("Test Case 3: ");
		testDate3.print();
		
//		Test accept method from MyDate Class
		System.out.println("Test Case 4: ");
		MyDate testDate4 = new MyDate(MyDate.accept());
		testDate4.print();
		
		System.exit(0);
	}

}
