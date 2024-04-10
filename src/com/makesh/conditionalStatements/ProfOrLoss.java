package com.makesh.conditionalStatements;
import java.util.Scanner;
public class ProfOrLoss {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float income=sc.nextFloat();
        float expense=sc.nextFloat();
        float diff = income - expense;
        if(diff>0){
            System.out.println("Profit of "+diff);
        }
        else{
            System.out.println("Loss of "+diff);
        }
    }
}
