package com.makesh.homework.Day2;

import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m=sc.nextInt();
        if (m>0){
            System.out.println("Value of n is 1");
        }
        else if (m==0){
            System.out.println("Value of n is 0");
        }
        else if (m<0){
            System.out.println("Value of n is -1");
        }

    }
}
