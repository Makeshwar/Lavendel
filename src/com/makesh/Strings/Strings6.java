package com.makesh.Strings;

import java.util.Scanner;

public class Strings6 {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            String str=sc.nextLine();
            System.out.print(str.charAt(0));
            for (int i = 1; i < str.length(); i++) {
                char prevChar = str.charAt(i - 1);
                char currentChar = str.charAt(i);
                if ((prevChar != 'a' && prevChar != 'e' && prevChar != 'i' && prevChar != 'o' && prevChar != 'u') ||
                        (currentChar != 'a' && currentChar != 'e' && currentChar != 'i' && currentChar != 'o' && currentChar != 'u')) {
                    System.out.print(currentChar);
                }
            }
        }
    }

