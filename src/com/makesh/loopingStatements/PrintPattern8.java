package com.makesh.loopingStatements;

import java.util.Scanner;

public class PrintPattern8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        if (sum == number) {
            System.out.println(number + " Perfect number");
        } else {
            System.out.println(number + " Not perfect number");
        }
    }
    }
