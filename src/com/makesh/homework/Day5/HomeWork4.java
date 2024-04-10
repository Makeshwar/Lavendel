package com.makesh.homework.Day5;
import java.util.Scanner;
public class HomeWork4 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String str = sc.next();
            for (int i = 0; i < str.length() - 2; i++) {
                for (int j = i + 1; j < str.length() - 1; j++) {
                    int num1 = Integer.valueOf(str.substring(0, i + 1));
                    int num2 = Integer.valueOf(str.substring(i + 1, j + 1));
                    int pointer = j + 1;
                    int flag = 1;
                    while (pointer < str.length()) {
                        String c = num1 + num2 + "";
                        if (pointer+c.length()<=str.length()&&str.substring(pointer, pointer +
                                c.length()).equals(c)) {
                            pointer += c.length();
                            int t = num1 + num2;
                            num1 = num2;
                            num2 = t;
                        } else {
                            flag = 0;
                            break;
                        }
                    }
                    if (flag==1) {
                        System.out.println(true);
                        return;
                    }
                }
            }
            System.out.println(false);

        }
    }


