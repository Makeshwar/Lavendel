package com.makesh.Strings;
public class EqualsIgnore {
    public static void main(String[] args) {
        String s1="javatpoint";
        String s2="javatpoint";
        String s3="JAVATPOINT";
        String s4="python";
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.equalsIgnoreCase(s3));
        System.out.println(s2.equalsIgnoreCase(s3));
    }
}