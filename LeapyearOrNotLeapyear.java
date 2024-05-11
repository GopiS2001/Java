package com.practice;
import java.util.Scanner;

public class LeapyearOrNotLeapyear {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Year: ");
		int year = scanner.nextInt();
		
		if(year % 400 == 0) {
			System.out.println(year + " : It is Leap Year");
		}
		else if(year % 4 ==0 && year % 100 != 0){
			System.out.println(year  + " : It is Leap Year");
		}
		else {
			System.out.println(year + " : It is not a Leap Year");
		}
		
	}

}
