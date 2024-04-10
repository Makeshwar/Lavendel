package com.makesh.homework.Day4;
import java.util.Scanner;
public class HomeWork2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[][] arr1=new int[n][n];
        int[][] arr2=new int[n][n];
        int[][] sum=new int[n][n];
        int[][] diff=new int[n][n];
        int[][] prod=new int[n][n];
        System.out.println("Enter Matrix 1");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr1[i][j]= sc.nextInt();
            }
        }
        System.out.println("Enter Matrix 2");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr2[i][j]= sc.nextInt();
            }
        }
        System.out.println("Sum");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sum[i][j]=arr1[i][j]+arr2[i][j] ;
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Difference");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                diff[i][j]=arr1[i][j]-arr2[i][j] ;
                System.out.print(diff[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Product");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                prod[i][j]=0;
                for (int k = 0; k < n; k++) {
                    prod[i][j]+=arr1[i][k]*arr2[k][j];
                }
                System.out.print(prod[i][j]+" ");
            }
            System.out.println();
        }

    }
}