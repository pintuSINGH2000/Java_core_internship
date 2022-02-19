package com.google;

import java.util.Scanner;

public class MirrorArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.printf("Enter total integer in array ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        int length=arr.length;
        System.out.printf("Enter integer in array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        if(ismirrorInverse(arr,length))
            System.out.printf("Yes");
        else
            System.out.printf("No");

    }


    private static boolean ismirrorInverse(int[] arr, int length) {
        for (int i = 0; i < length; i++) {
            if (arr[arr[i]] != i)
                return false;
        }
        return true;
    }
}
