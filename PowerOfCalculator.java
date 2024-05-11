package com.practice;

public class PowerOfCalculator {

    public static long pow(int x, int y) {
        if (y == 0) {
            return 1;
        }
        if (y % 2 == 0) {
            long res = pow(x, y / 2);
            return res * res;
        } else {
            return pow(x, y - 1) * x;
        }
    }

    public static void main(String[] args) {
        int x = 2; 
        int y = 3; 
        long result = pow(x, y);
        System.out.println(x + " raised to the power of " + y + " is: " + result);
    }
}
