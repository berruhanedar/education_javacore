package com.berruhanedar.tutorials._3_AccessModifier;

import com.berruhanedar.tutorials._3_week._01_PublicAccessModifier;

public class _04_AllAccessModifier {
    public static void main(String[] args) {
        _01_PublicAccessModifier accessModifier = new _01_PublicAccessModifier();
        System.out.println(accessModifier.publicData);
//      System.out.println(accessModifier.privateData);
//      System.out.println(accessModifier.protectedData);
//      System.out.println(accessModifier.defaultData);
    }
}
