package com.makesh.conditionalStatements;
import java.util.Scanner;
public class checkalphdigchar {
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    char n=sc.next().charAt(0);
    if((n>='a' && n<='z') || (n>='A' && n<='Z')){
        System.out.println("It is a Alphabet");
    } else if ((n>='0' && n<='9')) {
        System.out.println("It is a Digit");
    }
    else{
        System.out.println("It is a special character");
    }
}
}
