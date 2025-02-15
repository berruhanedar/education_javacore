package com.berruhanedar._2_week;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class _15_2_LocalDateTime {
    public static void LocalDateFormatMethod() {
        LocalDateTime now = LocalDateTime.now();
        Locale locale = new Locale("tr", "TR");
        System.out.println("Current Time: " + now);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy HH:mm:ss", locale);
        System.out.println("Current Time: " + now.format(formatter));

    }


    public static void main(String[] args) {
        LocalDateFormatMethod();
    }
}
