package com.makesh.conditionalStatements;
import java.util.Scanner;
public class allowance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float bp = sc.nextFloat();
        float hra;
        float da;
        float gross;
        if (bp <= 10000) {
            hra = bp * 20 / 100;
            da = bp * 80 / 100;
            gross=bp+hra+da;
            System.out.println("Gross pay is "+gross);
        } else if (bp <= 20000 && bp > 10000) {
            hra = bp * 25 / 100;
            da = bp * 90 / 100;
            gross=bp+hra+da;
            System.out.println("Gross pay is "+gross);
        } else if (bp > 20000) {
            hra = bp * 35 / 100;
            da = bp * 95 / 100;
            gross=bp+hra+da;
            System.out.println("Gross pay is "+gross);
        }
    }
}
