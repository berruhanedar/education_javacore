package com.berruhanedar._2_week;

import java.io.IOException;
import java.util.Scanner;

    /*
    Exception in thread "main" java.lang.ArithmeticException: / by zero
	at com.berruhanedar._2_week._14_1_Exception.main(_14_1_Exception.java:7)
    */

public class _14_1_Exception {

    public static void calculate() throws ArithmeticException, IOException, NullPointerException {
        Scanner scanner = new Scanner(System.in);
        int number1, number2;

        System.out.println("Enter Number 1:");
        number1 = scanner.nextInt();

        System.out.println("Enter Number 2:");
        number2 = scanner.nextInt();

        try {
            int result = number1 / number2;
            System.out.println(result);
        } catch (ArithmeticException ae) {
            ae.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("This will be executed regardless of whether an exception occurs.");
            scanner.close();
        }

        System.out.println("Last 10,000 lines");
    }

    public static void main(String[] args) throws IOException {
        calculate();
        System.out.println("################################");

        // Intentionally throwing an exception
        throw new NullPointerException("Why did you leave it empty?");
    }
}
