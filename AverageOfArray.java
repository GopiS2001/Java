package com.practice;

public class AverageOfArray {
	
	public static double avg(int a[]) {
		if (a.length == 0) {
			throw new IllegalArgumentException("Input array is empty");
		}
		
		double sum = 0;
		for(int i : a) {
			sum += i;
		}
		double average = sum / a.length;
		return average;
	}

	public static void main(String[] args) {
		int a[] = {4, 7, 9, 3, 5, 8, 2};
		double answer = avg(a);
		System.out.println("Average: " + answer);
	}
}
