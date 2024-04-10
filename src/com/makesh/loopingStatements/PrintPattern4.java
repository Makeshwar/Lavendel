package com.makesh.loopingStatements;
import java.util.Scanner;
public class PrintPattern4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < 2 * size - 1; j++) {
                if (i == size - 1 || i + j == size - 1 || j - i == size - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}