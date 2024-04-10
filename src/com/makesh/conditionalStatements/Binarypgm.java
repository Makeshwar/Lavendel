package com.makesh.conditionalStatements;

import java.util.Scanner;

public class Binarypgm {
    public static int performOperation(int a, int b, char op) {
        switch (op) {
            case 'A':
                return a & b;
            case 'B':
                return a | b;
            case 'C':
                return a ^ b;
            default:
                return -1; // Invalid operation
        }
    }

    public static int operationsbinarystring(String str) {
        if (str == null) {
            return -1;
        }

        int result = Character.getNumericValue(str.charAt(0)); // Initialize result with first binary digit
        for (int i = 1; i < str.length(); i += 2) {
            char op = str.charAt(i);
            int operand = Character.getNumericValue(str.charAt(i + 1));
            result = performOperation(result, operand, op);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        int result = operationsbinarystring(str);
        if (result != -1) {
            System.out.println("Result: " + result);
        } else {
            System.out.println("Invalid input");
        }
    }
}
