package com.berruhanedar._2_week;

import java.util.Scanner;

public class _11_1_Return_Continue_Break {
    // Algorithm that calculates the sum up to a positive number given by the user
    // Condition - 1: If the user enters a number greater than 100, it should only sum up to 100. (break)
    // Condition - 2: If the number 47 is given by the user, it should not be included in the sum. (continue)

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a positive number: ");
        int number = Math.abs(scanner.nextInt());
        int sum = 0;

        for (int i = 0; i < number; i++) {
            if (i == 47) {
                continue;
            }
            if (i > 100)
                break;

            sum += i;
        }
        System.out.println("The total sum is: " + sum);

        if (sum % 2 == 0)
            System.out.println("The total " + sum +" is even");
        else
            System.out.println("The total " + sum +" is odd");

        scanner.close();
    }
}
