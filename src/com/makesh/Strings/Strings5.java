package com.makesh.Strings;

import java.util.Scanner;

public class Strings5 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String str1=sc.nextLine();
            String str2=sc.nextLine();
            int result=str1.compareTo(str2);
            System.out.println(result);
            if(result==0) {
                System.out.println("Equal");
            }
            else{
                System.out.println("Not Equal");
            }

        }
    }


