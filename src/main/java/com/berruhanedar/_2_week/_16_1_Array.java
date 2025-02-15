package com.berruhanedar._2_week;

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
        String[] city = {"San Francisco", "Melbourne", "New York ",null,"Istanbul","Tokyo"};
        return city;
    }

    public static void arrayMethod3() {
        String[] city = arrayMethod2();
        // for each
        for (String temp : city) {
            System.out.println(_15_4_SpecialColor.YELLOW+temp+_15_4_SpecialColor.RESET);
        }
    }

    public static void main(String[] args) {
        arrayMethod1();
        arrayMethod2();
        arrayMethod3();
    }

}
