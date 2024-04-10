package com.makesh.Strings;
public class IndexOfExample {
    public static void main(String[] args){
        String s1="this is index of example";
        int index1=s1.indexOf("is");
        int index2 = s1.indexOf("index");
        System.out.println(index1+"__"+index2);
        int index3=s1.indexOf("is",4);
        System.out.println(index2+"__"+index3);
    }
}