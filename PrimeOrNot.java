package com.practice;
import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the Number:");
	int number = scanner.nextInt();
	int count = 0;
	
	for(int i=1; i<=number; i++) {
		if(number % i == 0) {
			count++;
		}
	}
	if(count == 2) {
		System.out.println(number + " : is a prime number");
	}
	else {
		System.out.println(number + " : is not a prime number");
	}
		

	}

}
