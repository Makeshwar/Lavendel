package com.makesh.OnlineClassDay6;

import java.util.Scanner;

public class ClassWork1
{
    public static int f(int n, int k, int[] a) {
        int[] d = new int[n + 1];
        d[0] = 0;
        d[1] = a[0];
        for (int i = 2; i <= n; i++) {
            d[i] = Math.max(d[i - 1], d[i - k - 1 < 0 ? 0 : i - k - 1] + a[i - 1]);
        }
        return d[n];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int max = f(n, k, a);
        System.out.println(max);
    }

}