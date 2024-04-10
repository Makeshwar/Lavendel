package com.makesh.Arrays;



import java.util.Scanner;

public class Arrays11 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String[] s=sc.nextLine().split(" ");
        String first=sc.nextLine();
        String second=sc.nextLine();
        int count1=0;
        int count2=0;

        for(int i=0;i<s.length;i++)
        {
            if(s[i].equals(first))
                count1++;
            if(s[i].equals(second))
                count2++;
        }
        System.out.println(count1>count2?first:second);


    }

}
