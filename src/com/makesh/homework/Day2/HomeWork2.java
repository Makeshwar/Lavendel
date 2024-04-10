package com.makesh.homework.Day2;

import java.util.Scanner;
public class HomeWork2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float temp = sc.nextFloat();
        if(temp<0){
            System.out.println("Freezing weather");
        }
        else if(temp<10 && temp>=0){
            System.out.println("Very Cold weather");
        }
        else if(temp<20 && temp>=10){
            System.out.println("Cold weather");
        }
        else if(temp<30 && temp>=20){
            System.out.println("Normal Temp");
        }
        else if(temp<40 && temp>=30){
            System.out.println("Hot");
        }
        else if(temp>=40){
            System.out.println("Very Hot");
        }
    }
}
