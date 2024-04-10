package com.makesh.homework.Day5;

import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int flag=0;
        String[] str1=new String[n];
        for (int i = 0; i < n; i++) {
            str1[i]=sc.next();
        }

        for (int i = 0; i < n; i++) {
            if (str1[i].equals("cookie")&&str1[i+1].equals("cookie")){
                flag=1;
                break;
            }
        }
        if (flag==1){
            System.out.println("No");
        }
        else {
            System.out.println("Yes");
        }

    }
}
