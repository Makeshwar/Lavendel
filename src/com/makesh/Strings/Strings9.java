package com.makesh.Strings;

import java.util.Scanner;

public class Strings9 {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            String str= sc.nextLine();
            String camelCase="";
            boolean capitalizeNext=true;
            for (int i = 0; i < str.length(); i++) {
                char ch=str.charAt(i);
                if(ch==' '){
                    capitalizeNext=true;
                } else if (capitalizeNext) {
                    camelCase+=Character.toUpperCase(ch);
                    capitalizeNext=false;
                }else camelCase+=ch;
            }
            System.out.println(camelCase);
        }
    }




