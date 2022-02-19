package com.google;

import java.util.Scanner;

public class TransposeMatrix {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.printf("Enter the total row: ");
        int row=sc.nextInt();
        System.out.printf("Enter the total column: ");
        int column=sc.nextInt();
        System.out.printf("Enter the "+row*column+" number: ");
        int[][] matrix=new int[row][column];
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("Matrix");
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                System.out.print(matrix[i][j]+"  ");
            }
            System.out.printf("\n");
        }
        System.out.println("Transpose Matrix");
        for(int i=0;i<column;i++){
            for(int j=0;j<row;j++){
                System.out.print(matrix[j][i]+"  ");
            }
            System.out.printf("\n");
        }
    }
}

