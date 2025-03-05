package com.berruhanedar.tutorials._2_week;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class _15_1_Date {

    // Date
    public static void dateMethod() {
        Date date = new Date();

        System.out.println("Current time: " + date);
        System.out.println("Milliseconds since January 1, 1970 until now: " + date.getTime());
        System.out.println("Date: " + date.getDate());

        System.out.println("Day: " + date.getDay());
        System.out.println("Month: " + date.getMonth()); // Starts counting from 0 = January, 1 = February
        System.out.println("Year: " + (1900 + date.getYear()));  // Add or subtract 1900
        System.out.println("Years passed since: " + (2025 - date.getYear()));
        System.out.println("Hours: " + date.getHours());
        System.out.println("Minutes: " + date.getMinutes());
        System.out.println("Seconds: " + date.getSeconds());
    }

    public static String nowFormat1() throws NullPointerException {
        Date now = new Date();
        String specialFormat = "Time: "
                .concat(String.valueOf(now.getHours()))
                .concat(":")
                .concat(String.valueOf(now.getMinutes()))
                .concat(":")
                .concat(String.valueOf(now.getSeconds()))
                .toString();
        return specialFormat;
    }

    public static String nowFormat2() throws NullPointerException {
        Date now = new Date();
        // %s : String
        // %d : Decimal
        // %f : Float
        return String.format("Current time: %02d:%02d:%02d", now.getHours(), now.getMinutes(), now.getSeconds());
    }

    public static String nowFormat3() throws NullPointerException {
        Date now = new Date();
        Locale locale = new Locale("tr", "TR");

        //SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss",locale);
        //SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MMM-dd HH:mm:ss",locale);
        //SimpleDateFormat sdf = new SimpleDateFormat("dd/MMMM/yyyy HH:mm:ss",locale);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MMMM/yyyy hh:mm:ss", locale);
        //SimpleDateFormat sdf = new SimpleDateFormat("dd/MMMM/yyyy HH:mm:ss zzzz",locale);

        String formatedDate = String.format("Current Time: %s", sdf.format(now));
        return new Date().toString() + " - " + formatedDate;
    }


    // PSVM
    public static void main(String[] args) {
        dateMethod();

        System.out.println("#####################");

        String nowFormat1 = nowFormat1();
        System.out.println(nowFormat1);

        System.out.println("#####################");

        String nowDate2 = nowFormat2();
        System.out.println(nowDate2);

        System.out.println("#####################");

        String nowDate3 = nowFormat3();
        System.out.println(nowDate3);
    }
}
