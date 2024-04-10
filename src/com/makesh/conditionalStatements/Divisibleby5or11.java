package com.makesh.conditionalStatements;
import java.util.Scanner;
public class Divisibleby5or11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n%5==0 && n%11 == 0){
            System.out.println("The number is divisible by 5 and 11");

        }
        else{
            System.out.println("The number is not divisible by 5 and 11");
        }
    }

}
