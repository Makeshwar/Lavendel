package com.makesh.conditionalStatements;

import java.util.*;

public class Library {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] times = new int[n];
        for (int i = 0; i < n; i++) {
            times[i] = scanner.nextInt();
        }

        int[] readingTimes = new int[n];
        for (int i = 0; i < n; i++) {
            readingTimes[i] = scanner.nextInt();
        }

        int availableStudents = 0;
        int currentTime = 0;
        for (int i = 0; i < n; i++) {
            currentTime = Math.max(currentTime, times[i]); // Ensure no student starts before the previous one finishes
            if (i + 1 < n && currentTime + readingTimes[i] <= times[i + 1]) {
                availableStudents++;
            } else if (i + 1 >= n) { // Handle the last student
                availableStudents++;
            }
            currentTime += readingTimes[i]; // Move the current time to when the student finishes reading
        }

        System.out.println(availableStudents);
    }
}
