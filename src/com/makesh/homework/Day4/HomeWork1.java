package com.makesh.homework.Day4;
import java.util.Scanner;
public class HomeWork1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] arr=new int[n][n];
        int sum=0;
        int sum1=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sum+=arr[i][j];
            }
            System.out.println("Sum of row"+(i+1)+"="+sum);
            sum=0;
        }
        for (int j = 0; j < n; j++){
            for (int i = 0; i < n; i++) {
                sum1+=arr[i][j];
            }
            System.out.println("Sum of column"+(j+1)+"="+sum1);
            sum1=0;

        }
    }
}
