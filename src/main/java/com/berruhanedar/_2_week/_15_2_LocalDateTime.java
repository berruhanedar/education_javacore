package com.berruhanedar._2_week;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class _15_2_LocalDateTime {
    public static void LocalDateFormatMethod(){
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Current Time: " + now);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        System.out.println("Current Time: " + now.format(formatter));

    }


    public static void main(String[] args) {
        _15_2_LocalDateTime.LocalDateFormatMethod();
    }
}
