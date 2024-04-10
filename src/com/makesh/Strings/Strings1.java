package com.makesh.Strings;

import java.util.Scanner;

public class Strings1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str1=sc.nextLine();
        String sub1 =sc.nextLine();
        int ind = str1.indexOf(sub1);
        if (ind==-1){
            System.out.println("Not Found");

        }
        else{
        System.out.println("Found at "+ind);}
    }
}
