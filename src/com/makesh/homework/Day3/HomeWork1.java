package com.makesh.homework.Day3;
import java.util.Scanner;
public class HomeWork1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numRows = sc.nextInt();
        for(int i = 0; i < numRows; i++) {
            for(int k = numRows - i; k > 0; k--) {
                System.out.print(" ");
            }
            for(int j = 0; j <= i; j++) {
                System.out.print(ncr(i, j) + " ");
            }
                System.out.println();
        }
    }
    public static int ncr(int n, int r) {
        int res = 1;
        if (r > n - r){
            r = n - r;
        }
        for(int i = 0; i < r; ++i) {
            res *= (n - i);
            res /= (i + 1);
        }
        return res;
    }
}