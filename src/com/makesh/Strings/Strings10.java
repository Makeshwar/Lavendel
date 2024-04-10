package com.makesh.Strings;

import java.util.*;
public class Strings10
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        int a = 0;
        int b = 0;
        for(int i = 0;i<str1.length();i++){
            if(str1.charAt(i) != '?' && str1.charAt(i) != str2.charAt(i) && str2.charAt(i) != '?') 
                a++;
            if(str1.charAt(i) == str2.charAt(i) && str2.charAt(i) != '?' && str1.charAt(i) != '?') 
                b++;
        }
        System.out.println(a + " " + (str2.length()-b));
    }
}