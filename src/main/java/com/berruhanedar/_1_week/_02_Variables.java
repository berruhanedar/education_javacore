package com.berruhanedar._1_week;

public class _02_Variables {
    public static void main(String[] args) {
        // When writing data variable names:
        // Variable naming conventions:
        // 1-) Use a noun, adjective, or pronoun.Choose meaningful and descriptive names.
        int schoolNumber = 25;
        System.out.println(schoolNumber);
        schoolNumber = 53;
        System.out.println(schoolNumber);

        // 2-) You can start with _ or $.
        int _schoolNumber = 25;
        System.out.println(_schoolNumber);

        int $schoolNumber = 25;
        System.out.println($schoolNumber);

        // 3-) It can end with a number.
        int schoolNumber123 = 105;
        System.out.println(schoolNumber123);

        // 4-) Cannot start with a number.
        // 5-) Cannot start with special symbols other than _ or $.
        // 6-) Variable names should follow the camelCase rule.

        // You cannot write:
        // int schoolNumber=11; // Cannot use the same name.
        // int 44schoolNumber=11; // Cannot start with a number.
        // int ~schoolNumber=11;   // Cannot start with a special symbol.
        // int ``schoolNumber=11;   // Cannot start with a special symbol.
        // int school-number=99;    // Cannot use kebab-case.
        // System.out.println(school-number);
        // int school number=66;  // Cannot use spaces in variable names.

        // CONSTANTS
        final int MAX_STUDENTS = 100;
        System.out.println(MAX_STUDENTS);
    }
}
