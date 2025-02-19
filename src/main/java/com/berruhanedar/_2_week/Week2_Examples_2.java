package com.berruhanedar._2_week;

import java.util.Scanner;

public class Week2_Examples_2 {
    public static void main(String[] args) {
        long number, result = 1;
        byte doubleRemainingRight = 3;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nPlease enter a positive number:");


            // Check if the user has entered a decimal number
            if (scanner.hasNextInt()) {
                number = scanner.nextLong();
                // ITERATIVE
                if (number < 0) {
                    System.out.println(_15_4_SpecialColor.RED + "You have entered a number less than zero. The system is shutting down.");
                    // number = Math.abs(number);
                    break; // only exits the current loop or switch block
                    // System.exit(0);    -> Another solution: Terminates the entire program by shutting down the JVM
                } else if (number == 0) {
                    System.out.println(_15_4_SpecialColor.BLUE + "Factorail of " + number + " is 1 .");
                    result = 1;
                } else {
                    for (int i = 1; i <= number; i++) {
                        result *= i;
                    }
                    System.out.println(_15_4_SpecialColor.YELLOW + "Factorial of " + number + " is " + result + _15_4_SpecialColor.RESET);
                }
            } else if (scanner.hasNextDouble()) {
                System.out.println("You have entered a decimal number.");
                break;
            } else {
                System.out.println("You have entered a letter.");
                break;
            }
        }
    }


    public static long factorial(long number) {
        if (number == 1 || number == 0) {
            return number;
        } else {
            return number * factorial(number - 1);
        }
    }

}
