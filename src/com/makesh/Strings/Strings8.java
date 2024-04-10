package com.makesh.Strings;

import java.util.Scanner;

public class Strings8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        int len=str.length();
        if(len%2==0){
            System.out.println(str.charAt((len/2)-1)+""+str.charAt(len/2));
        }
        else{
            System.out.println(str.charAt((len)/2));

        }
    }
}
