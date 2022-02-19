package com.google;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter String ");
        String s = sc.next();
        String p = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            p = p + s.charAt(i);
        }
        System.out.println(p);
    }
}
