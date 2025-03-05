package com.berruhanedar.tutorials._2_week;

import java.util.Scanner;

public class Week2_Examples_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a positive number: ");
        int number = scanner.nextInt();

        //Validation
        // 1- If the user doesn't enter a positive number (Math.abs() , multiple a negative number)
        // 2- If the user enters a character
        // 3- If the user enters 0
        // 4- If the user enters a number that is too large, e.g., 555555555555555555555555555555555555

        if (number < 0) {
            System.out.println("You have entered a negative number");
            //number=Math.abs(number);
            number = number * (-1);
        }

        if (number % 2 == 0) {
            System.out.println(number + " is an even number");
        } else {
            System.out.println(number + " is an odd number");
        }
    }
}
