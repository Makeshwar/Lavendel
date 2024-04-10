package com.makesh.loopingStatements;

import java.util.Scanner;

 public class PrintPattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =1;i<=2*n-1;i++)
            System.out.print('*');
        System.out.println();
        int left = 1,right = 2*n-1;
        for(int i = 1;i<=n-1;i++){
            for(int j = 1;j<=2*n-1;j++){
                if(j <= left){
                System.out.print('b'); }
            else if(j >= right){
                System.out.print('b');
            }
            else if(j == left+1){
                System.out.print('*'); }
            else if(j == right-1){
                System.out.print('*'); }
            else{
                System.out.print('i'); }
            }
            left++;
            right--;
            System.out.println();
        } }
}
