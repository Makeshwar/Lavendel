package com.makesh.OnlineClassDay6;

import java.util.Arrays;
import java.util.Scanner;

public class ClassWork3 {
    private static boolean isAnagram(String original, String target) {
        int[] targetCnt = new int[256];
        int[] windowCnt = new int[256];
        for (int i = 0; i < target.length(); i++) {
            targetCnt[target.charAt(i)]++;
            windowCnt[original.charAt(i)]++;
        }
        for (int i = target.length(); i < original.length(); i++) {
            if (Arrays.equals(targetCnt, windowCnt)) {
                return true;
            }
            windowCnt[original.charAt(i - target.length())]--;
            windowCnt[original.charAt(i)]++;
        }
        return Arrays.equals(targetCnt, windowCnt);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s = sc.nextLine();
        int k = sc.nextInt();
        sc.nextLine();
        String res = "";
        for (int i = 0; i < k; i++) {
            char c = sc.next().charAt(0);
            int r = sc.nextInt();
            if(i < k - 1) sc.nextLine();
            String sub;
            if (c == 'L') {
                sub = s.substring(r) + s.substring(0, r);
            } else {
                int len = s.length();
                sub = s.substring(len - r) + s.substring(0, len - r);
            }
            res += sub.charAt(0);
        }
        boolean f = isAnagram(s, res);
        if (f) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
