package com.google;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int a=0,b=1,c;
        Scanner sc=new Scanner(System.in);
        System.out.printf("Enter value of n ");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.printf( a+" ");
            c=a+b;
            a=b;
            b=c;
        }
    }
}
