package com.makesh.Arrays;
import java.util.Scanner;
public class Arrays12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int n= sc.nextInt();
        for (int i = 0; i < n; i++) {
            if(i%2==0){
                a*=2;
            }else b*=2;
        }
        System.out.println(a+b);
    }
}
