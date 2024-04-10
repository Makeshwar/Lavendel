package com.makesh.OnlineClassDay6;
import java.util.Arrays;
import java.util.Scanner;

public class ClassWork2 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        char[] d = scanner.next().toCharArray();
        Arrays.sort(d);
        long N = Long.parseLong(new String(d)), n = N;
        int m = scanner.nextInt();
        while (n % m != 0 && nextPermutation(d))
            n = Long.parseLong(new String(d));
        System.out.println(n % m == 0 ? n : -1);
    }
    static boolean nextPermutation(char[] a)
    {
        int i = a.length - 2;
        while (i >= 0 && a[i] >= a[i + 1])
            i--;
        if (i < 0)
            return false;
        int j = a.length - 1;
        while (a[j] <= a[i])
            j--;
        char temp = a[i];
        a[i] = a[j];
        a[j] = temp;
        Arrays.sort(a, i + 1, a.length);
        return true;
    }
}
