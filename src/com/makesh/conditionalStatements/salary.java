package com.makesh.conditionalStatements;

import java.util.Scanner;

public class salary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Gender:");
        String gender = sc.nextLine();
        System.out.println("Enter Year of Exp:");
        int year = sc.nextInt();
        System.out.println("Enter qual:");
        sc.nextLine(); // consume the newline character
        String qual = sc.nextLine();

        if (gender.equals("Male") && year >= 10 && qual.equals("Post")) {
            System.out.println("Salary is: " + 15000);
        } else if (gender.equals("Male") && year >= 10 && qual.equals("Grad")) {
            System.out.println("Salary is: " + 10000);
        } else if (gender.equals("Male") && year < 10 && qual.equals("Post")) {
            System.out.println("Salary is: " + 10000);
        } else if (gender.equals("Male") && year < 10 && qual.equals("Grad")) {
            System.out.println("Salary is: " + 7000);
        }

        if (gender.equals("Female") && year >= 10 && qual.equals("Post")) {
            System.out.println("Salary is: " + 12000);
        } else if (gender.equals("Female") && year >= 10 && qual.equals("Grad")) {
            System.out.println("Salary is: " + 9000);
        } else if (gender.equals("Female") && year < 10 && qual.equals("Post")) {
            System.out.println("Salary is: " + 10000);
        } else if (gender.equals("Female") && year < 10 && qual.equals("Grad")) {
            System.out.println("Salary is: " + 6000);
        }
    }
}
