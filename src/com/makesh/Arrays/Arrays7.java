package com.makesh.Arrays;

import java.util.Scanner;

public class Arrays7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m =sc.nextInt();
        int n=sc.nextInt();
        int sum[][] = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                sum[i][j]=i+j;
                System.out.print(sum[i][j]);
                System.out.print("\t");

            }
            System.out.println();
        }

    }
}
