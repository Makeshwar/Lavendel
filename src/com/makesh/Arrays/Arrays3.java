package com.makesh.Arrays;

import java.util.Scanner;

public class Arrays3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=sc.nextInt();
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
             arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for(int j =i;j<n;j++){
                if(arr[i]+arr[j]==sum){
                    System.out.println(arr[i]+ "+"+arr[j]+"="+sum);
                }
            }
        }

    }

}
