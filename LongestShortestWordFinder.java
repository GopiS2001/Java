package com.practice;

public class LongestShortestWordFinder {

    public static void find(String[] s) {
        String min = s[0];
        String max = s[0];
        for (int i = 1; i < s.length; i++) {
            if (min.length() > s[i].length()) {
                min = s[i];
            }
            if (max.length() < s[i].length()) {
                max = s[i];
            }
        }
        System.out.println("Longest Word: " + max);
        System.out.println("Shortest Word: " + min);

    }

    public static void main(String[] args) {
        String s = "hello welcome to the world of java";
        String[] str = s.split(" ");
        find(str);
    }

}
