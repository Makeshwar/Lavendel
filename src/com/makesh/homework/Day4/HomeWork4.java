package com.makesh.homework.Day4;
import java.util.*;
public class HomeWork4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int a[][] = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        int count, sum = 0;
        for (int i = 0; i < m; i++) {
            count = 0;
            for (int j = 0; j < n; j++) {
                if (a[i][j] == 1) {
                    count++;
                }
            }
            if (count > 1) {
                sum += ((count * (count - 1)) / 2);
            }
        }
        System.out.println(sum);
    }
}
