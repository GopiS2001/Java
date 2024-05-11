package com.practice;
import java.util.Scanner;

public class SunnyNumberOrNot {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = scanner.nextInt();

        int count = 0;
        for(int i = 1; i * i <= n + 1; i++) {
            if(i * i == n + 1) {
                count++;
                break;
            }
        }
        if(count == 1) {
            System.out.println("It is a Sunny Number");
        }
        else {
            System.out.println("It is not a Sunny Number");
        }
    }
}
