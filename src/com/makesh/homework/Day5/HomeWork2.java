package com.makesh.homework.Day5;

import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String n=sc.next();
        int flag=0;
        if (n.indexOf("+91")!=0){
            flag=1;

        }
        if(n.length()!=13){
            flag=1;
        }

        System.out.println(flag==1?"Number Invalid":"Number Valid");


    }
}
