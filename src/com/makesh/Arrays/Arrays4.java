package com.makesh.Arrays;

import java.util.Scanner;

public class Arrays4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int flag=0;
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int sum=sc.nextInt();
        for (int i = 0; i < n; i++) {
            for(int j =i;j<n;j++){
                if(arr[i]+arr[j]==sum){
                    flag++;
                }
            }
        }

        if(flag!=0){
            System.out.println("Array has two elements with given sum "+sum);
        }
        else{
            System.out.println("Array doesn't have two elements with given sum "+sum);
        }

    }

}
