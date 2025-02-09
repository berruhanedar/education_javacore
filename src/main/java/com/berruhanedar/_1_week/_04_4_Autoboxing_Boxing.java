package com.berruhanedar._1_week;

public class _04_4_Autoboxing_Boxing {
    public static void main(String[] args) {

        //Primitive => Wrapper AUTOBOXING
        int primitiveValue = 100;
        Integer wrapperValue = primitiveValue; // Autoboxing
        System.out.println("primitive value: " + primitiveValue+" wrapper value: " + wrapperValue);

        //Wrapper => Primitive UNBOXING
        Integer wrapperValue2 = 200;
        int primitiveValue2 = wrapperValue2; // Unboxing
        System.out.println("wrapper value: " + primitiveValue2+" primitive value: " + wrapperValue2);
    }
}
