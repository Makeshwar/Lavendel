package com.makesh.homework.Day3;
import java.util.*;
public class HomeWork4
{
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    int n=sc.nextInt();
    int num=0;
    for(int i=1;i<n;i++){
    num=num+(n-i);
}
    System.out.print(num);
}
}