package com.google;

import java.util.Scanner;

public class PermutationAndCombination {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.printf("Enter n: ");
        int n= sc.nextInt();
        System.out.printf("Enter r: ");
        int r=sc.nextInt();
        long a=0,b=0,c=0;
        a=factorial(n);
        b=factorial(r);
        c=factorial(n-r);
        long permutation=a/c;
        long combination=a/(b*c);
        System.out.println("Permutation of given number is "+permutation);
        System.out.println("combination of given number is "+combination);
    }
    public static long factorial(int n){
        long fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println(fact);
        return fact;
    }
}
