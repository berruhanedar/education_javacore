package com.berruhanedar._3_week;

public class _01_PublicAccessModifier {
    public String publicData="public data";
    private String privateData="private data";
    protected String protectedData="protected data";
    String defaultData="public finalData";


    public static void main(String[] args) {
        _01_PublicAccessModifier accessModifier = new _01_PublicAccessModifier();
        System.out.println(accessModifier.publicData);
        System.out.println(accessModifier.privateData);
        System.out.println(accessModifier.protectedData);
        System.out.println(accessModifier.defaultData);
    }


}
