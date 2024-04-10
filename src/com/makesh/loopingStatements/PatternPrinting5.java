package com.makesh.loopingStatements;

import java.io.*;
import java.util.Scanner;

// Java code to demonstrate star pattern
public class PatternPrinting5
{
    public static void printTriangle(int n)
    {
        for (int i=0; i<n; i++)
        {


            for (int j=n-i; j>1; j--)
            {
                System.out.print(" ");
            }


            for (int j=0; j<=i; j++ )
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        printTriangle(n);
    }
}
