package com.berruhanedar.tutorials._1_week;

public class _06_Math {
    public static void main(String[] args) {

        //NaN: Not a Number
        System.out.println("The smallest:" + Math.min(3,10));
        System.out.println("The largest :" + Math.max(3,10));
        System.out.println("The absolute:" + Math.abs(-2));

        System.out.println("The Square Root:" + Math.sqrt(16));
        System.out.println("The Square Root:" + Math.sqrt(Math.abs(-16)));

        System.out.println("Exponential: " + Math.pow(2, 3));

        System.out.println("Floor value: " + Math.floor(4.7));
        System.out.println("Ceiling value: " + Math.ceil(4.2));
        System.out.println("Rounded value: " + Math.round(4.4));  // Output will be 4
        System.out.println("Rounded value: " + Math.round(4.5));  // Output will be 5
        System.out.println("Rounded value: " + Math.round(4.7));  // Output will be 5

        System.out.println("PI: " + Math.PI);
        System.out.println("E" + Math.E);

        System.out.println("Sine of 0 radians: " + Math.sin(0));
        System.out.println("Tan of 0 radians: " + Math.tan(0));
        System.out.println("Cos of 0 radians: " + Math.cos(0));

        // Inverse trigonometric functions
        System.out.println("Arc sine of 1: " + Math.asin(1));


    }
}
