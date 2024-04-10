package com.makesh.conditionalStatements;
import java.util.Scanner;
public class IsLowerOrUpper {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char ch = sc.next().charAt(0);

        // Check if the character is lowercase
        if (Character.isLowerCase(ch)) {
            System.out.println("The character is lowercase");
        } else {
            System.out.println("The character is uppercase");
        }
    }
}
