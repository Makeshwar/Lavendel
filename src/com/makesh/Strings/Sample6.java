package com.makesh.Strings;

import java.util.Scanner;

public class Sample6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        System.out.println(str1.length()+" " +str2.length());
        System.out.println(str1.concat(" "+str2));
        System.out.println(str1.toUpperCase());

    }
    }

