package com.practice;
import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int sum = sumOfDigits(number);
        System.out.println("Sum of digits: " + sum);
    }

    public static int sumOfDigits(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10; // Adding the last digit to sum
            number /= 10; // Removing the last digit from number
        }
        return sum;
    }
}
