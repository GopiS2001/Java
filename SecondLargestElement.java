package com.practice;

public class SecondLargestElement {
    public static void main(String[] args) {
        
        int[] a = {2, 5, 8, 9, 20, 12, 22};
        int max = Integer.MIN_VALUE; 
        
       
        for (int i : a) {
            if (i > max) {
                max = i;
            }
        }
        
        int max2 = Integer.MIN_VALUE; 
        
        for (int i : a) {
            if (i > max2 && i != max) {
                max2 = i;
            }
        }
        
        System.out.println("Second Largest Element is " + max2);
    }
}

