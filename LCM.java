package com.practice;
import java.util.Scanner;

public class LCM {
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Number: ");
		int num1 = sc.nextInt();
		System.out.println("Enter the Second Number: ");
		int num2 = sc.nextInt();
		
		int max = (num1 > num2) ? num1 : num2;
		int lcm = 0;
		
		for(int i = max; i <= num1 * num2; i++) {
			if(i % num1 == 0 && i % num2 == 0) {
				lcm = i;
				break;
			}
		}
		System.out.println("The LCM of " + num1 + " and " + num2 + " is: " + lcm);
	}
}
