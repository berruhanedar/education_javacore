package com.berruhanedar;


import com.berruhanedar.controller.StudentController;
import com.berruhanedar.dao.TeacherDao;

import java.util.Scanner;

//
public class MainTest {
    // Scanner
    private static final Scanner scanner = new Scanner(System.in);

    // CHOICE
    private static void choose() {
        while (true) {
            try {
                System.out.println("\n===== TEACHER MANAGEMENT SYSTEM =====");
                System.out.println("1. Add Teacher");
                System.out.println("2. Add Student");
                System.out.println("3. Exit");
                System.out.print("\nPlease make your choice: ");

                int choice = scanner.nextInt();
                scanner.nextLine(); // Clear the newline

                switch (choice) {
                    case 1 -> teacher();
                    case 2 -> student();
                    case 3 -> {
                        System.out.println("Exiting...");
                        return;
                    }
                    default -> System.out.println("Invalid choice! Please try again.");
                }
            } catch (Exception e) {
                System.out.println("⛔ An unexpected error occurred: " + e.getMessage());
                scanner.nextLine(); // Clear the scanner
            }
        }
    }

    // STUDENT
    private static void student() {
        try {
            StudentController studentController = new StudentController();
            studentController.choose();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // TEACHER
    private static void teacher() {
        try {
            TeacherDao teacherDao = new TeacherDao();
            teacherDao.choose();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // PSVM
    public static void main(String[] args) {
        choose();
    } // end psvm
} // Main

