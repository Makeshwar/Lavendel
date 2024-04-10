package com.makesh.Strings;
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        String str1 = new String();
        for (int i = str.length()-1;i >=0;i--){
            str1= str1+str.charAt(i);
        }
        if(str.equals(str1)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}