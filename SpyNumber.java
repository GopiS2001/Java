package com.practice;
import java.util.Scanner;

public class SpyNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = scanner.nextInt();
		
		int sum = 0;
		int product = 0;
		int temp = n;
		while(n>0) {
			int rem = n / 10;
			sum = sum + rem;
			product = product * rem;
			n = n / 10;
		}
		if(sum == product) {
			System.out.println(temp + " is a spy number");
		}
		else {
			System.out.println(temp + " is a not spy number");
		}

	}

}
