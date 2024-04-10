package com.makesh.Strings;

public class Sample2 {
    public static void main(String[] args) {
        String str1= new String("Dhoni");
        String str2= new String("Dhoni");
        System.out.println(str1==str2?"Matches":"Not Matches");
        System.out.println(str1.equals(str2)?"Matches":"Not Matches");

    }
}
