package com.berruhanedar.project_step1_file;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class StudentManagementSystem {

    // Field
    private ArrayList<StudentDto> studentDtoList = new ArrayList<>();
    private int studentCounter = 0;
    private static final String FILE_NAME = "student.txt";

    // static
    static {
    }

    // Constructor without parameter
    public StudentManagementSystem() {
        // Load the student list immediately when the program executes
        loadStudentsListFromFiled();
    }

    // Upload Student List
    private void loadStudentsListFromFiled() {

    }

    //////////////////////////////////////////////////
    // Login
    // Register
    //////////////////////////////////////////////////
    // File Create - IO
    // File Create
    private void saveToFile() {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            objectOutputStream.writeObject(FILE_NAME);
        } catch (IOException io) {
            System.out.println("File write error");
            io.printStackTrace();
        }
    }

    // File Read
    // Upload Student List (File)
    private void loadStudentsListFromFile() {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            studentDtoList = (ArrayList<StudentDto>) objectInputStream.readObject();
            studentCounter = studentDtoList.size();
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("Student record not found");
            fileNotFoundException.printStackTrace();
        } catch (IOException io) {
            System.out.println("File reading error");
            io.printStackTrace();
        }
    }

    //////////////////////////////
    // Add Students
    public void add(StudentDto studentDto) {
        studentDtoList.add(new StudentDto(++studentCounter, studentDto.getName(), studentDto.getSurname(), studentDto.getBirthDate(), studentDto.getGrade()));
        System.out.println("Added student");
        // Add to File
        saveToFile();
    }

    // Student List
    public void list() {
        if (studentDtoList.isEmpty()) {
            System.out.println("List is empty");
            return;
        } else {
            studentDtoList.forEach(System.out::println);
        }
    }

    // Search Student
    public void search(String name) {
        studentDtoList.stream()
                .filter(temp -> temp.getName().equalsIgnoreCase(name))
                .forEach(System.out::println);
    }

    // Update Student
    public void update(int id, StudentDto dto) {
        for (StudentDto temp : studentDtoList) {
            if (temp.getId() == id) {
                temp.setName(dto.getName());
                temp.setSurname(dto.getSurname());
                temp.setBirthDate(dto.getBirthDate());
                temp.setGrade(dto.getGrade());
                System.out.println("Student updated");
                saveToFile();
                return;
            }
        }
        System.out.println("Student not found");
    }

    // Delete Student
    public void delete(int id) {
        studentDtoList.removeIf(temp -> temp.getId() == id);
        System.out.println("Student deleted");
    }

    //////////////////////////////////////////////////

    // Total Number of Students
    // Calculate Student's Grade Average
    // Student with the Highest or Lowest Grade
    // Student Ranking (Birthdate)
    ///////////////////////////////////////////////
    // Console Chose (Add Student)
    public void chooise() {
        Scanner scanner = new Scanner(System.in);
        StudentManagementSystem studentManagementSystem = new StudentManagementSystem();

        // Infinite loop
        while (true) {
            System.out.println("\n1. Add Student");
            System.out.println("\n2. List Students");
            System.out.println("\n3. Search Student");
            System.out.println("\n4. Update Student");
            System.out.println("\n5. Delete Student");
            System.out.println("\n6. Total Number of Students");
            System.out.println("\n7. Select a Random Student");
            System.out.println("\n8. Calculate Student's Grade Average");
            System.out.println("\n9. Show Student with the Highest or Lowest Grade");
            System.out.println("\n10. Sort Students by Birthdate");
            System.out.println("\n11.Exit");
            System.out.println("\n Please enter your select");

            int chooise = scanner.nextInt();
            scanner.nextLine(); //Stop
            StudentDto studentDto = new StudentDto();
            String name, surname;
            LocalDate birthDate;
            Double grade;


            switch (chooise) {
                case 1:
                    System.out.println("Student's name:");
                    name = scanner.nextLine();
                    System.out.println("Student's surname:");
                    surname = scanner.nextLine();
                    System.out.println("Student's birthdate:");
                    birthDate = LocalDate.parse(scanner.nextLine());
                    System.out.println("Student's grade:");
                    grade = Double.parseDouble(scanner.nextLine());
                    studentDto.setId(studentCounter);
                    studentDto.setName(name);
                    studentDto.setSurname(surname);
                    studentDto.setBirthDate(birthDate);
                    studentDto.setGrade(grade);
                    studentDto.setCreatedDate(new Date(System.currentTimeMillis()));
                    studentManagementSystem.add(studentDto);
                    break;

                case 2:
                    studentManagementSystem.list();
                    break;
            }
        }
    }
}
