package com.makesh.Strings;

import java.util.Scanner;

public class Strings4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        int result=str1.compareTo(str2);
        System.out.println(result);
    }
}
