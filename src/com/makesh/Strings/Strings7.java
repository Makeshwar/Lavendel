package com.makesh.Strings;

import java.util.Scanner;

public class Strings7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1=sc.nextLine();
        String str2= str1.replaceAll("\\s","");
        System.out.println(str2);
    }
}
