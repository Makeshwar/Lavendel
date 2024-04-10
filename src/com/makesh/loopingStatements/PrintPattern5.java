package com.makesh.loopingStatements;
import java.util.Scanner;
public class PrintPattern5 {
    public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);
                int n = sc.nextInt();
                for (int i=1;i<=(2*n-1);i++){
                    for (int j=1;j<=(2*n-1);j++){
                        if (j == n) {
                            System.out.print("*");
                        }else if(i==n){
                            System.out.print("*");
                        }
                        else{
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
    }
}