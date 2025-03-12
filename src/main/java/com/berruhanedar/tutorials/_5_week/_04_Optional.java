package com.berruhanedar.tutorials._5_week;

/*
Java 8 introduces some built-in functional interfaces:

Predicate → boolean test(T t)  → For condition checks.
Function<T, R> → R apply(T t)  → To transform a value.
Consumer → void accept(T t)    → Takes a parameter, performs an operation but doesn't return a value.
Supplier → T get()             → Does not take a parameter, generates a value.
 */

import java.util.Optional;

public class _04_Optional {

    // 1. Problem Solution
    public String isNotValidation(String data) {
        return data;
    }

    // 2. Problem Solution
    // data.isEmpty() || data == null || data.isBlank()
    public String validation(String data) {
        if (data.isEmpty() || data == null || data.isBlank()) {
            return "Unknown";
        } else {
            return data;
        }
    }

    // 3. Problem Solution
    public Optional<String> optionalResult(String data) {
        Optional<String> name = Optional.ofNullable(null);
        return name;
    }

    public static void main(String[] args) {
        // Instance
        _04_Optional week505Optional = new _04_Optional();

        // 1st METHOD
        String result1 = week505Optional.isNotValidation("");
        System.out.println(result1);

        // 2nd METHOD
        String result2 = week505Optional.validation("");
        System.out.println(result2);

        Optional<String> result3 = week505Optional.optionalResult("");
        System.out.println(result3);
    }
}
