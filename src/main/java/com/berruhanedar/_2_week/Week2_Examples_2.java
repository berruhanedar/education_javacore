package com.berruhanedar._2_week;

import java.util.Scanner;

public class Week2_Examples_2 {
    // Algorithm that calculates the sum up to a positive number given by the user
    // Condition - 1: If the user enters a number greater than 100, it should only sum up to 100. (break)
    // Condition - 2: If the number 47 is given by the user, it should not be included in the sum. (continue)

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = scanner.nextInt();
        int result = 0;

        for (int i = 0; i < number && i < 100; i++) {
            if (i == 47) {
                continue;
            }
            result += i;
        }
        System.out.println("The total sum is: " + result);
    }
}
