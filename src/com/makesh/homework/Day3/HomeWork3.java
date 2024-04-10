package com.makesh.homework.Day3;

import java.util.*;
public class HomeWork3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for(int i = a; i<=b; i++){
            int c = i%10;
            int d = i/10;
            if ((c + d) + (c*d) == i)
                System.out.println(i);
        }
    }
}
