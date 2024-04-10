package com.makesh.loopingStatements;
import java.util.Scanner;

public class PrintPattern6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                int value = i * j;
                System.out.print(value + " ");
            }

            System.out.println();
        }
    }
}
