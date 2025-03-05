package com.berruhanedar.tutorials._2_week;

public class _13_2_MethodIsReturn {

    // 3 - With return without parameters
    public String methodWithReturnWithoutParameters(){
        return "methodWithReturnWithoutParameters";
    }

    // 4 - With return and parameters
    public Integer methodWithReturAndParameters(int number){
        return number;
    }

    public static void main(String[] args) {
        _13_2_MethodIsReturn method = new _13_2_MethodIsReturn();
        String result = method.methodWithReturnWithoutParameters();
        System.out.println(result);

        Integer result2 = method.methodWithReturAndParameters(1);
        System.out.println(result2);

    }


}
