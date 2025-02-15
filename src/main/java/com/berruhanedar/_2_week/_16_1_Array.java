package com.berruhanedar._2_week;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class _16_1_Array {

    public static String[] arrayMethod1() throws ArrayIndexOutOfBoundsException {
        String[] city = new String[6];
        city[0] = "San Francisco";
        city[1] = "Melbourne";
        city[2] = "New York";
        city[3] = "Istanbul";
        city[5] = "Tokyo";
        System.out.println(city);
        System.out.println(city[0]);
        System.out.println(city[6 - 1]);
        System.out.println(city.length);
        System.out.println("Last elemenet: " + city[city.length - 1]);
        return city;
    }

    // Array
    public static String[] arrayMethod2() throws ArrayIndexOutOfBoundsException {
        String[] city = {"San Francisco", "Melbourne", "New York ", "Istanbul", "Tokyo", "Berlin", "Paris"};
        return city;
    }

    public static void arrayMethod3() {
        String[] city = arrayMethod2();
        // for each
        for (String temp : city) {
            System.out.println(_15_4_SpecialColor.YELLOW + temp + _15_4_SpecialColor.RESET);
        }
    }

    // iterative
    public static void arrayMethod4() {
        String[] city = arrayMethod2();

        for (int i = 0; i < city.length; i++) {
            System.out.println(_15_4_SpecialColor.BLUE + city[i] + _15_4_SpecialColor.RESET);
        }
    }

    // Foreach
    public static void arrayMethod5() {
        String[] city = arrayMethod2();
        Arrays.sort(city);

        for (String temp : city) {
            System.out.println(_15_4_SpecialColor.YELLOW + temp + _15_4_SpecialColor.RESET);
        }
    }

    // Foreach
    public static void arrayMethod6() {
        String[] city = arrayMethod2();
        Arrays.sort(city, Collections.reverseOrder());

        for (String temp : city) {
            System.out.println(_15_4_SpecialColor.YELLOW + temp + _15_4_SpecialColor.RESET);
        }
    }

    // Random Number
    public static int randomNumber() {
        Random random = new Random();
        int rndInt = random.nextInt(9) + 1; // 1<=NUMBER<=9
        return rndInt;
    }

    // fill:
    public static void arrayMethod7() {
        int[] number = new int[7];

        // fill: The method is designed to assign a single value to all elements of the array
        Arrays.fill(number, randomNumber());

        // Using an iterative for loop to get a different number each time
        for (int i = 0; i < number.length; i++) {
            // number[i] = randomNumber(); // (1st WAY)
            Arrays.setAll(number, data -> randomNumber()); // (2nd WAY)
        }

        for (int temp : number) {
            System.out.println(_15_4_SpecialColor.BLUE + temp + _15_4_SpecialColor.RESET);
        }
    }

    public static void arrayMethod8() {
        String[] originalCity = arrayMethod2();
        String[] cloneCity = Arrays.copyOf(originalCity, originalCity.length);

        Arrays.sort(cloneCity);

        for (String temp : originalCity) {
            System.out.println(_15_4_SpecialColor.BLUE + temp + _15_4_SpecialColor.RESET);
        }

        // Binary Search
        String searchCity = "Los Angeles";
        int index = Arrays.binarySearch(cloneCity, searchCity);

        if (index >= 0) {
            System.out.println(searchCity + _15_4_SpecialColor.PURPLE + " it contains " + _15_4_SpecialColor.RESET);
        } else {
            System.out.println(searchCity + _15_4_SpecialColor.GREEN + " does not contain " + _15_4_SpecialColor.BLUE);
        }
    }


    public static void main(String[] args) {
        arrayMethod1();
        arrayMethod2();
        arrayMethod3();
        arrayMethod4();
        arrayMethod5();
        arrayMethod6();
        arrayMethod7();
        arrayMethod8();
    }
}
