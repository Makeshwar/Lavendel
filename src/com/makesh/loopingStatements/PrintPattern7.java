package com.makesh.loopingStatements;

import java.util.Scanner;

public class PrintPattern7 {
    static int fact(int x){
        if (x == 0)
            return 1;
        else
            return(x * fact(x-1));
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        float sum=0;
        for (int i = 1; i <=n ; i++) {
            sum=(sum+(float) (i/fact(i)));
        }
        System.out.println(sum);
    }

}

