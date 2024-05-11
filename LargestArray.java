package com.practice;
import java.util.Scanner;

public class LargestArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		
		System.out.println("Enter the Numbers: ");
		for(int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		
		int max = arr[0];
		for(int i = 1; i < arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println("The largest number in the array is: " + max);

	}

}
