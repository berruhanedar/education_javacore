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
        Formatter formatter = new Formatter();
        formatter.format("Hello , Your Name : %s , Your Number : %d , Price : %f", " John Doe", 123, 58.54);
        System.out.println(formatter);
        formatter.close(); // free up memory
    }

    // Best practice
    public static void formatter2() {
        String formatterString = String.format("Hello , Your Name : %s , Your Number : %d , Price : %f", " John Doe", 123, 58.54);
        System.out.println(formatterString);
    }


    public static void main(String[] args) {
        formatter1();
        formatter2();
    }

}
