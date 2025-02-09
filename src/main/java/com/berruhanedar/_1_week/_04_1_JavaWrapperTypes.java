package com.berruhanedar._1_week;

public class _04_1_JavaWrapperTypes {
    public static void main(String[] args) {
        //PRIMITIVE TYPE
        byte primitiveTypeByte = 127;
        // primitive typelar can not be null ==  primitiveTypeByte=null;
        System.out.println(primitiveTypeByte);
        short primitiveTypeShort = 5699;
        int primitiveTypeInt = 49846846;
        long primitiveTypeLong = 4294967295L;

        float primitiveTypeFloat = 429496725795.0f;
        double primitiveTypeDouble = 65868566816186295d;

        boolean primitiveTypeBoolean = true;
        char primitiveTypeChar = 'a';

        ///////////////////////////////////////////////////////////////////////////////////////

        //WRAPPER TYPE
        Byte wrapperTypeByte = 127;
        // wrapper types can be null
        wrapperTypeByte = null;
        System.out.println(wrapperTypeByte);
        Short wrapperTypeShort = 5699;
        Integer wrapperTypeInt = 49846846;
        Long wrapperTypeLong = 4294967295L;

        Float wrapperTypeFloat = 429496725795.0f;
        Double wrapperTypeDouble = 65868566816186295d;

        Boolean wrapperTypeBoolean = true;
        Character wrapperTypeChar = 'a';
    }
}
