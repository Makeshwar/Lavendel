package com.makesh.conditionalStatements;

import java.util.Scanner;

public class ebbill {


    public static void main(String[] args) {
        double bill = 0.0;
        System.out.println("Enter the number of units:");
        Scanner sc = new Scanner(System.in);
        int units = sc.nextInt();
        if(units <= 50) {
            bill = units * 0.50;
        } else if(units <= 150) {
            bill = 50 * 0.50 + (units - 50) * 0.75;
        } else if(units <= 250) {
            bill = 50 * 0.50 + 100 * 0.75 + (units - 150) * 1.20;
        } else {
            bill = 50 * 0.50 + 100 * 0.75 + 100 * 1.20 + (units - 250) * 1.50;
        }
        bill *= 1.20;
        System.out.println("The bill amount is: "+bill);

    }
}
