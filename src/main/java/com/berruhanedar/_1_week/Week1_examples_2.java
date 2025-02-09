package com.berruhanedar._1_week;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Week1_examples_2 {
    public static void main(String[] args) {
        /*
2. Celsius to Fahrenheit Converter (Using Scanner)
   Question:
   Write a program that takes the temperature in Celsius from the user and converts it to Fahrenheit.
   Formula: F = (C * 9/5) + 32
   Solution:
 */
        double celsiusDegree;
        double fahrenheitDegree;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter celsius degree :");
        celsiusDegree = scanner.nextDouble();

        fahrenheitDegree = (celsiusDegree * 9 / 5) + 32;
        System.out.println("Celsius degree is " + celsiusDegree);
        System.out.println("Fahrenheit degree is " + fahrenheitDegree);

        scanner.close();
    }
}
