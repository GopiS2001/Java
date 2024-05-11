package com.practice;
import java.util.Scanner;

public class ArrayOperations {

    public static void size(int[] a) {
        System.out.println("The length of the array is " + a.length);
    }

    public static void display(int[] a) {
        System.out.println("The array values are:");
        for (int i = 0; i < a.length; i++) {
            System.out.println("Index " + i + ": " + a[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        
        System.out.println("Enter the numbers: ");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        
        size(array);
        display(array);
    }
}
