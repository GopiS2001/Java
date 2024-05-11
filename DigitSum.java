package com.practice;

import java.util.Scanner;

public class DigitSum {

	public static void SumOfDigits(int n) {
		int sum = 0;
		int rem = 0;
		while(n > 0) {
			rem = n % 10;
			sum = sum + rem;
			n = n / 10;
		}
		System.out.println(sum);
	}
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = scanner.nextInt();
		
		DigitSum.SumOfDigits(num);
		scanner.close();
	}

}
