package com.makesh.Arrays;

import java.util.Scanner;

public class Arrays8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        int arr[][]= new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j]=sc.nextInt();
                if(j>=i){
                    sum = sum+arr[i][j];
                }

            }

        }
        System.out.println(sum);
    }
}
