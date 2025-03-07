package com.berruhanedar.tutorials._2_week;

public class _12_1_String {
    public static void main(String[] args) {
        // 1st method
        // String vocabulary = new String("I am learning Java");

        // 2nd method
        // String vocabulary = new String();
        // vocabulary = "I am learning Java ";

        // 3rd method
        String vocabulary1 = "I am learning Java ";
        String vocabulary2 = "I am learning Java ";

        //length()
        System.out.println("Number of characters: " + vocabulary1.length());

        //Upper and Lower Case
        System.out.println("Upper Case: " + vocabulary1.toUpperCase());
        System.out.println("Lower Case: " + vocabulary1.toLowerCase());


        // trim(): Removes leading and trailing spaces in a string.
        System.out.println("Trim length: " + vocabulary1.trim().length());
        System.out.println("Trim result: " + vocabulary1.trim());

        //equals
        System.out.println(vocabulary1 == vocabulary2); //true
        System.out.println(vocabulary1.equals(vocabulary2)); //true

        //startsWith
        //endsWith
        System.out.println(vocabulary1.startsWith("I")); //true
        System.out.println(vocabulary1.endsWith("J")); //false
        System.out.println(vocabulary1.equalsIgnoreCase(vocabulary2));

        // charAt(): Returns the character at the specified index.
        // NOTE: Indexing starts from **0** in Java.
        System.out.println(vocabulary1.charAt(0)); // 'I'

        // substring(): Extracts a part of the string between two specified indices.
        System.out.println(vocabulary1.trim().substring(1)); // Extracts from index 1 to the end.
        System.out.println(vocabulary1.trim().substring(1, 5)); // Extracts from index 1 to 4 (5 is not included).
        // System.out.println(vocabulary1.trim().substring(1, 40)); // StringIndexOutOfBoundsException

        String vocabulary3 = "Java";
        // StringIndexOutOfBoundsException
        if (vocabulary3.length() >= 10)
            System.out.println(vocabulary3.substring(0, 10));
        else
            System.out.println("The word that you have given has " + vocabulary3.length() + " characters."); // Display the length if it's less than 10

        //Contains
        System.out.println(vocabulary1.contains("Java"));

        //Split


        //Replace
        System.out.println("Change:" + vocabulary1.replace('a', 'e'));
        System.out.println(vocabulary1.replace("Java", "English"));
        System.out.println(vocabulary1);
        vocabulary1 = vocabulary1.replace('a', 'e');
        System.out.println(vocabulary1);

        //Concat
        System.out.println(vocabulary1.concat("well").concat("do"));
        String concatenation = vocabulary1 + vocabulary2 + vocabulary3;

        //StringBuilder
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(vocabulary1).append("well").append("do");
        String dataToString1 = stringBuilder.toString();
        System.out.println(dataToString1);

        //StringBuffer
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(vocabulary1).append("well").append("do");
        String dataToString2 = stringBuffer.toString();
        System.out.println(dataToString2);

        vocabulary1.hashCode();
        System.out.println(vocabulary1.hashCode());
    }
}

