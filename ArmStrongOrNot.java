package com.practice;
import java.util.Scanner;

public class ArmStrongOrNot {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int num = sc.nextInt();
        
        int temp = num;
        int numberOfDigits = String.valueOf(num).length();
        int result = 0;

        while (num > 0) {
            int digit = num % 10;
            result += Math.pow(digit, numberOfDigits);
            num /= 10;
        }

        if (temp == result) {
            System.out.println(temp + " is an Armstrong number.");
        } else {
            System.out.println(temp + " is not an Armstrong number.");
        }
    }
}
