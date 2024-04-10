package com.makesh.conditionalStatements;

import java.util.Scanner;


public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float mark1 = sc.nextFloat();
        float mark2 = sc.nextFloat();
        float mark3 = sc.nextFloat();
        float mark4 = sc.nextFloat();
        float mark5 = sc.nextFloat();

        float avg=(mark1+mark2+mark3+mark4+mark5)/5;
        System.out.println(avg);

        if(avg>=90 &&avg<=100){
            System.out.println("Grade A");
        } else if (avg>=80 && avg<90) {
            System.out.println("Grade B");
        }
        else if (avg>=70 && avg<80) {
            System.out.println("Grade C");
        }
        else if (avg>=60 && avg<70) {
            System.out.println("Grade D");
        }
        else if (avg>=40 && avg<60) {
            System.out.println("Grade E");
        }
        else if (avg<40){
            System.out.println("Grade F");
        }
        else{
            System.out.println("Enter valid mark");
        }
    }
}
