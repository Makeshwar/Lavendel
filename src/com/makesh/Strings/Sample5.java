package com.makesh.Strings;
public class Sample5 {
    public static void main(String[] args) {
        String s="Great",t="";
        String u=s.concat(t);
        System.out.println(u);
        if(u==s){
            System.out.println("Same");
        }
        else{
            System.out.println("Not Same");
        }
        String e=s+t;
        System.out.println(e);
        if(e==s){
            System.out.println("Same");
        }
        else{
            System.out.println("Not Same");
        }
    }
}