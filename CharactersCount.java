package com.practice;
import java.util.Scanner;

public class CharactersCount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Characters : ");
        String res = sc.nextLine();
        
        int count = 0;

        for (int i = 0; i < res.length(); i++) { 
            if (res.charAt(i) != ' ') {
                count++;
            }
        }

        System.out.println("The number of characters (excluding spaces) is: " + count);
    }
}
