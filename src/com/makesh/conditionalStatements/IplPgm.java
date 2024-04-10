package com.makesh.conditionalStatements;

import java.util.Scanner;

public class IplPgm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int date = scanner.nextInt();
        int month = scanner.nextInt();

        if (!isValidDate(date, month)) {
            System.out.println("Invalid Date/Month");
            return;
        }

        String zodiacSign = getZodiacSign(date, month);

        System.out.println(zodiacSign);
    }

    public static boolean isValidDate(int date, int month) {
        if (month < 1 || month > 12)
            return false;
        if (date < 1)
            return false;
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12:
                return date <= 31;
            case 4, 6, 9, 11:
                return date <= 30;
            case 2:
                if (isLeapYear(date))
                    return date <= 29;
                else
                    return date <= 28;
            default:
                return false;
        }
    }
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static String getZodiacSign(int date, int month) {
        switch (month) {
            case 1:
                return (date <= 19) ? "Capricorn" : "Aquarius";
            case 2:
                return (date <= 18) ? "Aquarius" : "Pisces";
            case 3:
                return (date <= 20) ? "Pisces" : "Aries";
            case 4:
                return (date <= 19) ? "Aries" : "Taurus";
            case 5:
                return (date <= 20) ? "Taurus" : "Gemini";
            case 6:
                return (date <= 20) ? "Gemini" : "Cancer";
            case 7:
                return (date <= 22) ? "Cancer" : "Leo";
            case 8:
                return (date <= 22) ? "Leo" : "Virgo";
            case 9:
                return (date <= 22) ? "Virgo" : "Libra";
            case 10:
                return (date <= 22) ? "Libra" : "Scorpio";
            case 11:
                return (date <= 21) ? "Scorpio" : "Sagittarius";
            case 12:
                return (date <= 21) ? "Sagittarius" : "Capricorn";
            default:
                return "Invalid Date/Month";
        }
    }
}
