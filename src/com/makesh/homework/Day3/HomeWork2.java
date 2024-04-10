package com.makesh.homework.Day3;
import java.util.*;
public class HomeWork2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0, b = 0, c = 1;
        System.out.print(n==1?a:(n==2)?(a+" "+b):"");
        if(n>=3){
            System.out.print(a+" "+b+" "+c+" ");
            for(int i=4; i<=n; i++){
                int d = a+b+c;
                System.out.print(d+" ");
                a=b;
                b=c;
                c=d;
            }
        }
    }
}