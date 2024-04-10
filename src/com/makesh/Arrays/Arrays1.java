package com.makesh.Arrays;

import java.util.Scanner;

public class Arrays1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        // Input sorted array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int num = sc.nextInt();
        int firstOccurrence = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == num) {
                firstOccurrence = i;
                break;
            }
        }
        int lastOccurrence = -1;
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] == num) {
                lastOccurrence = i;
                break;
            }
        }
        System.out.println(firstOccurrence + " " + lastOccurrence);
        sc.close();
    }
}




