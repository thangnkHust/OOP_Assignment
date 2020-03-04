package triangle_asterick;

import java.util.Scanner;

public class TriangleAsterick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		
		System.out.printf("Enter n: ");
		int n = keyboard.nextInt();
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < 2*n + 1; j++) {
				if(j < n-i || j > n+i) {
					System.out.printf(" ");
				}else {
					System.out.printf("*");
				}
			}
			System.out.println("");
		}
	}

}
