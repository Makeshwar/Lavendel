package com.makesh.loopingStatements;
import java.util.Scanner;
public class PrintPattern1
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int row, col;
        for (row = 0; row < n; row++) {
            for (col = 0; col <= row; col++) {
                if (((row + col) % 2) == 0)
                    System.out.print("1");
                else
                    System.out.print("0");

                System.out.print("\t");
            }
            System.out.print("\n");

        }
    }
    }



