package com.berruhanedar.tutorials._1_week;

import java.util.Scanner;

public class Week1_Examples_1 {
    public static void main(String[] args) {
        /*
       1. Solving a First-Degree Equation with One Unknown (Using Scanner)
       Problem:
       Write a program that takes the values of 'a' and 'b' from the user in the equation ax + b = 0
       and calculates the value of 'x'.
       Solution:
        */

        //Scanner
        Scanner sc = new Scanner(System.in);

        //Variable
        double aValue, bValue, result;

        System.out.println("Enter a:");
        aValue = sc.nextDouble();

        System.out.println("Enter b:");
        bValue = sc.nextDouble();

        //ax+b =0
        result = (-bValue) / aValue;
        System.out.println("a value:" + aValue + " b value:" +bValue+ " The result is:" + result);

        sc.close();
    }
}
