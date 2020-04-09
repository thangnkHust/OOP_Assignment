package hust.soict.hedspi.lab02;

import java.util.Scanner;
import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		/*
		 * Construction of array*/
		System.out.printf("Nhap so phan tu cua mang: ");
		int n = sc.nextInt();
		Double[] array = new Double[n];
		for(int i = 0; i < n; i++) {
			System.out.printf("Nhap phan tu thu %d: ", i+1);
			array[i] = sc.nextDouble();
		}
		/*
		 * Sort array*/
		Arrays.sort(array);
		
		/*
		 * Show result when sorted
		 * - Convert array to string
		 * - print string*/
		System.out.printf("Mang sap xep tang dan la: %s%n", Arrays.toString(array));
		
		/*
		 * Sum element of array
		 * Average element of array*/
		Double sum = 0.0;
		for(int i = 0; i < n; i++) {
			sum += array[i];
		}
		Double average = sum/n;
		System.out.printf("Tong cac phan tu trong mang: %.1f%n", sum);
		System.out.printf("Gia tri trung binh cac phan tu trong mang: %.1f%n", average);
	}

}
