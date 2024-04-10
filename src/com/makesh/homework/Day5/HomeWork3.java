package com.makesh.homework.Day5;

import java.util.Scanner;

public class HomeWork3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String separatedStr = "";

        for (int i = 0; i < str.length(); i++) {
            if (i > 0 && str.charAt(i) == str.charAt(i - 1)) {
                separatedStr += "*" + str.charAt(i);
            } else {
                separatedStr += str.charAt(i);
            }
            }

        System.out.println(separatedStr);
    }
}


