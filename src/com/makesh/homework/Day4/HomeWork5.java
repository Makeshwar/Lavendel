package com.makesh.homework.Day4;
import java.util.Scanner;
public class HomeWork5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int c1=0;
        int c2 =0;
        int c3=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if(arr[i]==1){
                c1++;
            }
            else if(arr[i]==2){
                c2++;
            }
            else if(arr[i]==3){
                c3++;
            }

        }
        System.out.println(n-Math.max(c1,Math.max(c2,c3)));
    }
}
