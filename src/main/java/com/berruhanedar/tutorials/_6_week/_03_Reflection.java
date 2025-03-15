package com.berruhanedar.tutorials._6_week;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

class Student {

    // Fields: name, age
    private String name;
    private int age;

    // No-argument Constructor
    public Student() {}

    // Parameterized Constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method
    public void study() {
        System.out.println(name + " is studying...");
    }
}

/////////////////////////////////////////
/// Reflection
public class _03_Reflection {

    public static void main(String[] args) throws ClassNotFoundException {
        // 1st Method: Using Class.forName()
        // Class<?> studentClass = Class.forName("Student");
        // Class<?> studentClass = Class.forName("com.hamitmizrak.tutorials._6_week.Student");
        // System.out.println("Class Name: " + studentClass.getName());

        // 2nd Method: Using .class
        Class<?> studentClass2 = Student.class;
        // System.out.println("Class Name: " + studentClass2.getName());

        // 3rd Method: Using getClass()
        Student student = new Student();
        Class<?> studentClass3 = student.getClass();
        // Print class name
        System.out.println("Class Name: " + studentClass3.getName());

        ///////////////////////////////////////////////////////////////

        // List fields (variables)
        Field[] fields = studentClass3.getDeclaredFields();
        System.out.println("\n### Field List:");
        for (Field field : fields) {
            System.out.println(field);
        }

        // Get constructor details
        Constructor<?>[] constructors = studentClass3.getConstructors();
        System.out.println("\n### Constructor List:");
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor);
        }

        // List methods
        Method[] methods = studentClass3.getDeclaredMethods();
        System.out.println("\n### Method List:");
        for (Method method : methods) {
            System.out.println(method);
        }
    }
}
