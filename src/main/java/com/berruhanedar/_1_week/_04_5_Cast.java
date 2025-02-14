package com.berruhanedar._1_week;

public class _04_5_Cast {
    public static void main(String[] args) {
        // 1- Widening Cast - Implicit Cast
        byte cast1Byte = 100; // Small data type
        int cast1Int = cast1Byte; // Storing small data into a larger data type. NO DATA LOSS
        System.out.println(cast1Int);

        // 2- Narrowing Cast - Explicit Cast
        int cast2Int = 12363126;
        byte cast2Byte = (byte) cast2Int;
        System.out.println(cast2Byte);

        // 3- char => Int
        char cast3Char = 'a';
        int ascii = cast3Char;
        System.out.println(ascii);

        int ascii2 = 235;
        char ascii3Char = (char) ascii2;
        System.out.println(ascii3Char);


        // 4- String => int
        String cast4String = "10";
        System.out.println(cast4String + 20);
        int cast4Int = Integer.parseInt(cast4String);
        System.out.println(cast4Int);
        int cast5Int = Integer.valueOf(cast4String);
        System.out.println(cast5Int);


        // 5 - int => String
        int cast6Int = 55;
        String cast5String1 = String.valueOf(cast5Int);
        System.out.println(cast5String1);
    }
}
