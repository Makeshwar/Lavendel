package com.makesh.conditionalStatements;
import java.util.Scanner;
public class MonthToDays {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String mon = sc.nextLine();
        switch (mon) {
            case "Jan":
                System.out.println("31");
                break;
            case "Feb":
                System.out.println("28");
                break;
            case "Mar":
                System.out.println("31");
                break;
            case "Apr":
                System.out.println("30");
                break;
            case "May":
                System.out.println("31");
                break;
            case "Jun":
                System.out.println("30");
                break;
            case "Jul":
                System.out.println("31");
                break;
            case "Aug":
                System.out.println("31");
                break;
            case "Sep":
                System.out.println("30");
                break;
            case "Oct":
                System.out.println("31");
                break;
            case "Nov":
                System.out.println("30");
                break;
            case "Dec":
                System.out.println("31");
                break;
            default:
                System.out.println("Nothing to show");
        }
    }
}
