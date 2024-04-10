package com.makesh.homework.Day4;
import java.util.Scanner;
public class HomeWork3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] arr=new int[n][n] ;
        boolean flag=true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j]= sc.nextInt();
                if(arr[i][j]!=20 && arr[i][j]>10){
                    flag=false;
                }
            }
        }
        if(!flag){
            System.out.println("No");
        }else System.out.println("Yes");
    }
}