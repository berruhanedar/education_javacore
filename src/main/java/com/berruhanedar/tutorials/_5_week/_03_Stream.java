package com.berruhanedar.tutorials._5_week;

import com.berruhanedar.tutorials._2_week._15_4_SpecialColor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class _03_Stream {
    public static ArrayList<String> streamExam1() {
        ArrayList<String> names = new ArrayList<>();
        names.add("Ali");
        names.add("Ahmet");
        names.add("Asım");
        names.add("Veli");
        names.add("Ayşe");
        names.add("Ayfer");
        names.add("aslı");
        names.add("Fatma");
        for (String name : names) {
            if (name.startsWith("A")) {
                System.out.println(name);
            }
        }
        System.out.println();
        return names;
    }

    // Arrays.asList() => Diziyi Listeye çevirerek
    public static void streamExam2() {
        List<String> names = Arrays.asList("Ali", "Ahmet", "Asım", "Veli", "Ayşe", "Ayfer", "aslı", "Fatma");
        for (String name : names) {
            if (name.startsWith("A")) {
                System.out.println(name);
            }
        }
        System.out.println();
    }

    // Java 8 gelen Stream Özelliği
    public static void streamExam3() {
        List<String> names = streamExam1()
                .stream()
                .filter(xyz -> xyz.startsWith("A"))
                .collect(Collectors.toList());
        names.forEach(System.out::print);
    }

    public static void main(String[] args) {
        System.out.println(_15_4_SpecialColor.YELLOW + "1.Method" + _15_4_SpecialColor.RESET);
        streamExam1();

        System.out.println(_15_4_SpecialColor.BLUE + "2.Method" + _15_4_SpecialColor.RESET);
        streamExam2();

        System.out.println(_15_4_SpecialColor.CYAN + "3.Method" + _15_4_SpecialColor.RESET);
        streamExam3();
    }
}