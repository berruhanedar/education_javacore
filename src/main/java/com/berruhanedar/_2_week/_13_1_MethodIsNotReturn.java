package com.berruhanedar._2_week;

public class _13_1_MethodIsNotReturn {

    // 1 - Methods - without return and parameters
    public void methodWithoutReturnAndParameters() {
        System.out.println("Method without return and parameters");
    }

    // 2 - Methods - without return but with parameters
    public static void methodWithoutReturnWithParameters(String name) {
        System.out.println("Method without return with parameters " + name);
    }

    // Overloading
    public static void methodWithoutReturnWithParameters(String name , Integer number) {
        System.out.println("Method without return with parameters " + name + number);
    }

    //new
    //static
    public static void main(String[] args) {
    _13_1_MethodIsNotReturn method = new _13_1_MethodIsNotReturn();
    method.methodWithoutReturnAndParameters();

    _13_1_MethodIsNotReturn.methodWithoutReturnWithParameters("true");
    _13_1_MethodIsNotReturn.methodWithoutReturnWithParameters("tried" , 25);

    }
}
