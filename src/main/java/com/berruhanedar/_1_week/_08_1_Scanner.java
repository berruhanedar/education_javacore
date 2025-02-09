package com.berruhanedar._1_week;

import java.util.Scanner;

public class _08_1_Scanner {
    public static void main(String[] args) {
        //Field
        String name , surname ;
        int age;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        name = sc.nextLine();
        System.out.println("Enter your surname: ");
        surname = sc.nextLine();
        System.out.println("Enter your age: ");
        age = sc.nextInt();

        System.out.println("Name : " + name+ " Surname: " + surname+ "\nAge: " + age);

        //An unused Scanner instance should be closed
        sc.close();
    }

}
