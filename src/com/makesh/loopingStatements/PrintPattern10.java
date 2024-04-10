package com.makesh.loopingStatements;

import java.util.Scanner;

public class PrintPattern10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rows = sc.nextInt();

        // Upper half of the pattern
        for (int i = 1; i <= rows; i++) {
            // Print spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            // Print characters
            char ch = 'A';
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(ch);
                ch++;
            }

            System.out.println();
        }

        // Lower half of the pattern
        for (int i = rows - 1; i >= 1; i--) {
            // Print spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }


            char ch = 'A';
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(ch);
                ch++;
            }

            System.out.println();
        }
    }

}
