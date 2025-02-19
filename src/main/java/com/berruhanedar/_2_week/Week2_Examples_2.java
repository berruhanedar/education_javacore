package com.berruhanedar._2_week;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Week2_Examples_2 {

    public static void iterativeFactorial() {
        long number, result = 1;
        byte doubleRemainingRight = 3;
        boolean isActive = true;

        Scanner scanner = new Scanner(System.in);

        while (true) {

            if (doubleRemainingRight > 0) {
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
//                  // doubleRemainingRight = (byte) (doubleRemainingRight - 1);
                    doubleRemainingRight--;
                    System.out.println("You have entered a decimal number. Your remaining right : " + doubleRemainingRight);

                    if (doubleRemainingRight == 0) {
                        System.out.println("Due to entering a decimal number, your input rights have been exhausted. The program is being terminated by the JVM.");
                        isActive = false;
                        System.exit(0);
                    }
                    scanner.next(); // Clears invalid inputs
                } else {
                    System.out.println("You have entered a letter.");
                    //break;
                    scanner.next();
                }
            } else {
                System.out.println("Due to entering a decimal number, your input rights have been exhausted. The program is being terminated by the JVM.");
                System.exit(0);
            }
        }
        scanner.close();
    }

    public static void recursiveFactorial() {

    }


    public static void main(String[] args) {
        System.out.println("Please make a selection\n1-) Iterative Factorial\n2-) Recursive Factorial\n3-)Exit");
        Scanner scanner = new Scanner(System.in);
        int choose = scanner.nextInt();
        switch (choose) {
            case 1:
                iterativeFactorial();
                break;
            case 2:
                recursiveFactorial();
                break;
            case 3:
                System.exit(0);
            default:
                System.out.println("Please enter a correct number:");
        }
    }


}
