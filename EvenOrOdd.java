package com.practice;
import java.util.Scanner;


public class EvenOrOdd {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num1 = scanner.nextInt();		
		if(num1 % 2 == 0) {
			System.out.println("It is Even");
		}
		else {
			System.out.println("It is Odd");
		}
		
		}

}
