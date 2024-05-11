package com.practice;
import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the Strings: ");
		String s = sc.nextLine();
		
		String str = "";
		for(int i=s.length()-1;i>=0;i--) {
			str += s.charAt(i);
		}
		System.out.println(str);

	}

}
