package com.makesh.loopingStatements;

public class ForEachLoop {
    public static void main(String[] args) {
        int arr[] = {12,23,44,56,78};
        int Sum=0;
        for(int i:arr){
            Sum+=i;
        }
        System.out.print(Sum+" ");
    }
}
