package com.google;

import java.util.Scanner;

public class DiamondPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.printf("Enter n: ");
        int n= sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=i;j<n;j++){
                System.out.printf(" ");
            }
            for(int k=1;k<=(2*i-1);k++){
                System.out.printf("*");
            }
            System.out.printf("\n");
        }
        for(int i=n-1;i>=1;i--){
            for(int j=i;j<n;j++){
                System.out.printf(" ");
            }
            for(int k=1;k<=(2*i-1);k++){
                System.out.printf("*");
            }
            System.out.printf("\n");
        }
    }
}
