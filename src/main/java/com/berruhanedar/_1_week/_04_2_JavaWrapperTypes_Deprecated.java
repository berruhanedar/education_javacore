package com.berruhanedar._1_week;

public class _04_2_JavaWrapperTypes_Deprecated {
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

        //Byte wrapperTypeByte = new Byte((byte)127);  //  Deprecated since Java 9
        Short wrapperTypeShort = new Short((short) 5699);
        Integer wrapperTypeInt = new Integer(49846846);
        Long wrapperTypeLong = new Long(4294967295L);

        Float wrapperTypeFloat = new Float(429496725795.0f);
        Double wrapperTypeDouble = new Double(65868566816186295d);

        Boolean wrapperTypeBoolean = new Boolean(true);
        Character wrapperTypeChar = new Character('a');

    }
}
