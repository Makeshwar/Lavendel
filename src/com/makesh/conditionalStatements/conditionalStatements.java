package com.makesh.conditionalStatements;
import java.util.Scanner;
public class conditionalStatements {

    public static void main(String[] args) {


    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();

    if(a>b &&a>c)

    {
        System.out.println(a+" is largest");


    }
    else if(b>a &&b>c)

    {
        System.out.println(b+" is greatest");
    }

    else

    {
        System.out.println(c+" is greatest");
    }
}

}
