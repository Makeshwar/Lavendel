package com.makesh.loopingStatements;
import java.util.Scanner;
public class PatternPrinting1 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int rows = scanner.nextInt();

            for (int i = rows; i >= 1; i--) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*" + " ");
                }
                System.out.println();
            }
        }
    }

