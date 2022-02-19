package com.google;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.printf("Enter String ");
        String s=sc.next();
        String p="";
        for(int i=s.length()-1;i>=0;i--){
            p=p+s.charAt(i);
        }

        if(p.equals(s))
            System.out.printf("Given string is palindrome");
        else
            System.out.printf("Given string is not palindrome");
    }
}
