package com.practice;
import java.util.Scanner;

public class SumOfArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int n = sc.nextInt();
		System.out.println("Enter the array elements: ");
		
		int a[] = new int[n];
		for(int i=0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		int sum = 0;
		for(int i:a) {
			sum = sum + i;
		}
		System.out.println("Sum of array is: " + sum);
	}

}
