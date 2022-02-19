package com.google;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        double n1,n2;
        Scanner sc=new Scanner(System.in);
        System.out.printf("Enter the number ");
        System.out.printf("\nEnter a: ");
        n1=sc.nextDouble();
        System.out.printf("Enter b: ");
        n2=sc.nextDouble();
        System.out.println("Enter the operator(+,-,*,/)");
        char op=sc.next().charAt(0);
        double ans=0;
        switch (op) {
            case '+':
                ans = n1 + n2;
                break;
            case '-':
                ans = n1 - n2;
                break;
            case '*':
                ans = n1 * n2;
                break;
            case '/':
                ans = n1 / n2;
                break;
            default:
                System.out.printf("You selected wrong operator");
                break;
        }
        System.out.printf("Solution: ");
        System.out.printf("\n"+n1+" "+op+" "+n2+" = "+ans);
    }
}
