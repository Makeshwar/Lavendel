package com.makesh.loopingStatements;

import java.util.Scanner;

public class PrintPattern2 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            String str=sc.nextLine();
            int size= str.length();
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    if (i == j ) {
                        System.out.print(str.charAt(i));
                    } else if(i + j == size - 1) {
                        System.out.print(str.charAt(j));
                    }else System.out.print(" ");
                }
                System.out.println();
            }
        }
    }


