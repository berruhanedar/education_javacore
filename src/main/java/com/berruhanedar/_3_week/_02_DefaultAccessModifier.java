package com.berruhanedar._3_week;

public class _02_DefaultAccessModifier {
    public static void main(String[] args) {
        _01_PublicAccessModifier accessModifier = new _01_PublicAccessModifier();
        System.out.println(accessModifier.publicData);
        //System.out.println(accessModifier.privateData);
        System.out.println(accessModifier.protectedData);
        System.out.println(accessModifier.defaultData);
    }
}
