package com.makesh.Arrays;

import java.util.Scanner;

public class Arrays5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int arr[]= new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        int smallest=arr[0];
        int largest=arr[0];
        for (int i = 1; i < n; i++) {
            if(arr[i]<smallest){
                smallest=arr[i];

                }
            if(arr[i]>largest){
                largest=arr[i];
            }
            }
        System.out.println("Smallest is: "+smallest);
        System.out.println("Largest is: "+largest);


        }
    }

