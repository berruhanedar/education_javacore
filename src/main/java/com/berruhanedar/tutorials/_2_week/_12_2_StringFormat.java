package com.berruhanedar.tutorials._2_week;

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

    public static final String RESET = "\033[0m";  // Reset color
    public static final String RED = "\033[31m";   // Red
    public static final String GREEN = "\033[32m"; // Green
    public static final String YELLOW = "\033[33m";// Yellow
    public static final String BLUE = "\033[34m";  // Blue
    public static final String PURPLE = "\033[35m";// Purple
    public static final String CYAN = "\033[36m";  // Light Blue

    /*
    ⚠️ Important Notes
    ❌ ANSI colors are not supported in IDEs like Eclipse.
    ✅ Works in Terminal, IntelliJ IDEA, and VS Code Terminal.
    ✅ Supported on Windows 10+ or Linux/macOS.
    ✅ On Windows, you should use PowerShell or Windows Terminal instead of CMD.
    */

    public static void formatter1() {
        // When using a new Formatter, it's good practice to call close() to release system resources
        Formatter formatter = new Formatter();
        formatter.format("Hello , Your Name : %s , Your Number : %d , Price : %f", " John Doe", 123, 58.54);
        System.out.println(formatter);
        formatter.close(); // free up memory
    }


    public static void formatter2() {
        String formatterString = String.format("Hello , Your Name : %s , Your Number : %d , Price : %f", " John Doe", 123, 58.54);
        System.out.println(formatterString);
        System.out.println();
    }

    // Best practice
    // We don't have to use close(), as the garbage collector runs automatically.
    public static void formatter3() {
        String formatterString = String.format("Hello , Your Name : %s , Your Number : %d , Price : %f", " John Doe", 123, 58.54);
        System.out.println(formatterString);
        System.out.println(YELLOW+formatterString+RESET);

        String formatterString2 = String.format("Hello: " + GREEN + "Your Name: %-10s" + RESET + ":" + RED + "T.C: %10d" + RESET + ":" + CYAN + "Price: %.4f " + RESET + ":", "Berru", 11223344, 44.23);
        System.out.println(formatterString2);
        System.out.println();
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
