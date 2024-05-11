package com.practice;

import java.util.HashMap;
import java.util.Map;

public class Unique {

	public static void main(String[] args) {
		int arr[] = {5, 0, 1, 1, 2, 0, 3, 5, 3, 2, 2, 4, 4, 6};
		Map<Integer, Integer> countMap = new HashMap<>();
		
		
		for (int num : arr) {
			countMap.put(num, countMap.getOrDefault(num, 0) + 1);
		}
		
		
		for (int num : arr) {
			if (countMap.get(num) == 1) {
				System.out.println(num + " is the Unique Element");
				return;
			}
		}
		
		System.out.println("No unique element found");
	}
}
