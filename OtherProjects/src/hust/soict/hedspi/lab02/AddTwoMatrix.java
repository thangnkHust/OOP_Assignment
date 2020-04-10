package hust.soict.hedspi.lab02;


import java.util.Scanner;

public class AddTwoMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Enter from keyboard
		Scanner sc = new Scanner(System.in);
		int col, row;
		System.out.println("Nhap kich thuoc ma tran(rowxcol): ");
		row = sc.nextInt();
		col = sc.nextInt();
		
		// Construction 2 matrices
		int [][] matrix1 = new int[row][col];
		int [][] matrix2 = new int[row][col];
		int [][] sumMatrix = new int[row][col];
		// Matrix 1
		System.out.println("Nhap ma tran 1: ");
		for(int i = 0; i < row; i++) {
			System.out.printf("\tHang %s: ", i+1);
			for(int j = 0; j < col; j++) {
				matrix1[i][j] = sc.nextInt();
			}
		}
		//Matrix 2
		System.out.println("Nhap ma tran 2: ");
		for(int i = 0; i < row; i++) {
			System.out.printf("\tHang %s: ", i+1);
			for(int j = 0; j < col; j++) {
				matrix2[i][j] = sc.nextInt();
			}
		}
		
		// Matrix 1 + Matrix 2
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
			}
		}
		//Show result
		System.out.println("Ma tran 1: ");
		showMatrix(matrix1, row, col);
		
		System.out.println("Ma tran 2: ");
		showMatrix(matrix2, row, col);
		
		System.out.println("Tong cua ma tran 1 va ma tran 2: ");
		showMatrix(sumMatrix, row, col);
		
	}
	
	public static void showMatrix(int [][] matrix, int row, int col) {
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				System.out.printf("%d ", matrix[i][j]);
			}
			System.out.println();
		}
	}

}
