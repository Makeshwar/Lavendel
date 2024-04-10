package com.makesh.loopingStatements;
import java.util.Scanner;
public class PrintPattern9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int N = sc.nextInt();
        int ans=0;
        for(int i=1;i<=N;i++){
            int count=0;
            int k=i;
            for(int j=1;j<=s+1;j++){
                if(k%j==0) {
                    count++;
                    k++;
                }
                else break;
            }
            if(count==s)
                ans++;
        }
        System.out.println(ans);
    }
}