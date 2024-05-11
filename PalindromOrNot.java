package com.practice;
import java.util.Scanner;

public class PalindromOrNot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		
    	int temp = num;
	    int rev = 0;
	
	while(num > 0) {
		int last = num % 10;
		num = num / 10;
		rev = (rev * 10)+ last;
	}
	if(rev == temp) {
		System.out.println("It is Palindrome");
	}
	else {
		System.out.println("It is not a Palindrome");
	}
  }
}