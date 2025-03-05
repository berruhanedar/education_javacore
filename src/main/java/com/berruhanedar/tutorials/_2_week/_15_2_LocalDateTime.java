package com.berruhanedar.tutorials._2_week;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class _15_2_LocalDateTime {
    public static void LocalDateFormatGetMethod() {
        LocalDateTime now = LocalDateTime.now();
        Locale locale = new Locale("tr", "TR");
        System.out.println("Current Time: " + now);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy HH:mm:ss", locale);
        System.out.println("Current Time: " + now.format(formatter));
        System.out.println("#################");
    }

    public static void LocalDateFormatGetMethod2() {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Day: " + now.getDayOfMonth());
        System.out.println("Month: " + now.getMonthValue());
        System.out.println("Year: " + now.getYear());
        System.out.println("Hour: " + now.getHour());
        System.out.println("Minute: " + now.getMinute());
        System.out.println("Second: " + now.getSecond());
        System.out.println("#################");
    }

    public static void LocalDateFormatSetMethod3() {
        Locale locale = new Locale("tr", "TR");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-yyyy HH:mm:ss", locale);

        LocalDateTime now = LocalDateTime.now();
        LocalDateTime newDate = now
                .withDayOfMonth(11)
                .withMonth(12)
                .withYear(2022)
                .withHour(14)
                .withMinute(15)
                .withSecond(16);
        System.out.println("Normal Date:" + now.format(formatter));
        System.out.println("New Date:" + newDate.format(formatter));
        System.out.println("#################");
    }


    public static void main(String[] args) {
        LocalDateFormatGetMethod();
        LocalDateFormatGetMethod2();
        LocalDateFormatSetMethod3();
    }
}
