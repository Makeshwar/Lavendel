package com.makesh.Arrays;

import java.util.Scanner;

public class Arrays6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int arr[]= new int[n];
        int sum=0;
        int prod=1;
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
            sum=sum+arr[i];
            prod=prod*arr[i];
        }
        if(sum%2==0){
            System.out.println(sum);
        }
        else if(sum%2!=0){
            System.out.println(prod);

        }

    }
}
