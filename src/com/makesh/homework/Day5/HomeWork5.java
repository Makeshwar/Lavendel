package com.makesh.homework.Day5;

import java.util.Scanner;

public class HomeWork5 {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            String str=sc.nextLine();
            String str1="";
            for (int i = 0; i < str.length()-1; i++) {
                String happyPrefix=str.substring(0,i+1);
                String prefix=str.substring(str.length()-1-i);
                if(happyPrefix.equals(prefix)){
                    str1=happyPrefix;
                }
            }
            System.out.println(str1);
        }
    }

