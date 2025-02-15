package com.berruhanedar._2_week;

import java.util.Formatter;

public class _12_2_StringFormat {

     /*
        Garbage Collectors:
        Garbage collectors only clean up objects that are not associated with open resources
        like files, scanners, formatters, etc. If these resources are not manually closed,
        the garbage collector can clean up the unused object, but it won't close the open file.
        If the file remains open, the cache memory will continue to be used.
        */

    // Formatter
    // s
    // d
    // f

    public static void formatter1() {
        // When using a new Formatter, it's good practice to call close() to release system resources
        Formatter formatter = new Formatter();
        formatter.format("Hello , Your Name : %s , Your Number : %d , Price : %f", " John Doe", 123, 58.54);
        System.out.println(formatter);
        formatter.close(); // free up memory
    }


    public static void formatter2() {

    }

    // Best practice
    // We don't have to use close(), as the garbage collector runs automatically.
    public static void formatter3() {
        String formatterString = String.format("Hello , Your Name : %s , Your Number : %d , Price : %f", " John Doe", 123, 58.54);
        System.out.println(formatterString);
    }

    // Best Practice
    public static void formatter4() {
        String name = "Berru";
        int idNumber = 56445;
        double price = 123.45;
        System.out.printf("Hello,  Your Name : %s , Your Number : %d , Price : %f", name, idNumber, price);
        System.out.println();
        System.out.printf("Hello,  Your Name : %10s , Your Number : %d , Price : %f", name, idNumber, price);
        System.out.println();
        System.out.printf("Hello,  Your Name : %-10s , Your Number : %-15d , Price : %.3f", name, idNumber, price);
    }


    public static void main(String[] args) {
        formatter1();
        formatter2();
        formatter3();
        formatter4();
    }

}
