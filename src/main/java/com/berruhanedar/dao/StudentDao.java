package com.berruhanedar.dao;

import com.berruhanedar.dto.StudentDto;
import com.berruhanedar.enums.EStudentType;
import com.berruhanedar.exceptions.StudentNotFoundException;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentDao implements IDaoGenerics<StudentDto> {

    // Field
    private ArrayList<StudentDto> studentDtoList = new ArrayList<>();
    private int studentCounter = 0;
    private static final String FILE_NAME = "student.txt";

    // static
    static {
    }

    // Constructor without parameter
    public StudentDao() {
        createFileIfNotExists();
        // Load the student list immediately when the program executes
        loadStudentsListFromFile();
    }

    //////////////////////////////////////////////////
    // Login
    // Register
    //////////////////////////////////////////////////
    // FileIO

    // File If Not Exists (students.txt)
    private void createFileIfNotExists() {
        File file = new File(FILE_NAME);
        if (!file.exists()) {
            try {
                file.createNewFile();
                System.out.println("File " + FILE_NAME + " created");
            } catch (IOException ioException) {
                System.out.println("Error creating file");
                ioException.printStackTrace();
            }
        }
    }

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
        studentDtoList.clear();
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            studentDtoList = (ArrayList<StudentDto>) objectInputStream.readObject();
            studentCounter = studentDtoList.size();
            System.out.println("Dosyadan yüklenen öğrenci sayısı:");
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("Dosyadan yüklenene öğrenci kaydı bulunamadı");
            fileNotFoundException.printStackTrace();
        } catch (IOException io) {
            System.out.println("File reading error");
            io.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    /////////////////////////////////////////////////////////////////
    // CRUD OPERATIONS
    // Add Students
    @Override
    public StudentDto create(StudentDto studentDto) {
        studentDtoList.add(new StudentDto(++studentCounter, studentDto.getName(), studentDto.getSurname(), studentDto.getMidTerm(),
                studentDto.getFinalTerm(), studentDto.getBirthDate(), studentDto.geteStudentType())
        );
        System.out.println("Added student");
        // Add to File
        saveToFile();
        return studentDto;
    }

    @Override
    public ArrayList<StudentDto> list() {
        if (studentDtoList.isEmpty()) {
            System.out.println("No Students Available");
            throw new StudentNotFoundException("No Students Available");
        } else {
            System.out.println("Student List:");
            studentDtoList.forEach(System.out::println);
        }
        return studentDtoList;
    }

    // Search Student
    @Override
    public StudentDto findByName(String name) {
        /*studentDtoList.stream()
            .filter(temp -> temp.getName().equalsIgnoreCase(name))
            .forEach(System.out::println);*/

        boolean found = studentDtoList
                .stream()
                .filter(temp -> temp.getName().equalsIgnoreCase(name))
                .peek(System.out::println) // Print if the matching data exists
                .findAny() // Check if there is any matching student
                .isPresent();

        // If No Student Found
        if (!found) {
            throw new StudentNotFoundException(name + " named student not found");
        }
        return null;
    }


    // Update Student
    @Override
    public StudentDto update(int id, StudentDto studentDto) {
        for (StudentDto temp : studentDtoList) {
            if (temp.getId() == id) {
                temp.setName(studentDto.getName());
                temp.setSurname(studentDto.getSurname());
                temp.setBirthDate(studentDto.getBirthDate());
                temp.setMidTerm(studentDto.getMidTerm());
                temp.setFinalTerm(studentDto.getFinalTerm());
                temp.seteStudentType(studentDto.geteStudentType());
                System.out.println("Student information updated");
                saveToFile();
            }
        }
        System.out.println("Student not found");
        return studentDto;
    }

    // Delete Student
    @Override
    public StudentDto delete(int id) {
        /*studentDtoList.removeIf(temp -> temp.getId() == id);
        System.out.println("Student deleted");*/

        boolean removed = studentDtoList.removeIf(temp -> temp.getId() == id);
        if (removed) {
            System.out.println("Student deleted successfully");
            saveToFile();
        } else {
            throw new StudentNotFoundException("Student not found");
        }
        return null;
    }

    //////////////////////////////////////////////////

    // Total Number of Students
    // Calculate Student's Grade Average
    // Student with the Highest or Lowest Grade
    // Student Ranking (Birthdate)

    ///////////////////////////////////////////////

    private EStudentType eStudentTypeMethod() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select type of student:\n1-) Undergrad\n2-) Graduate\n3-) PhD");
        int typeChoosie = scanner.nextInt();

        EStudentType switchCaseStudent = switch (typeChoosie) {
            case 1 -> EStudentType.UNDERGRADUATE;
            case 2 -> EStudentType.GRADUATE;
            case 3 -> EStudentType.PHD;
            default -> EStudentType.OTHER;
        };
        return switchCaseStudent;
    }

    public void chooiseStudentAdd() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Student's name:");
        String name = scanner.nextLine();

        System.out.println("Student's surname:");
        String surname = scanner.nextLine();

        System.out.println("Student's birthdate (YYYY-MM-DD):");
        LocalDate birthDate = LocalDate.parse(scanner.nextLine());

        System.out.println("Student's midterm grade:");
        double midtermGrade = scanner.nextDouble();

        System.out.println("Student's finalterm grade:");
        double finalTermGrade = scanner.nextDouble();

        EStudentType studentType = eStudentTypeMethod();
        StudentDto newStudent = new StudentDto(++studentCounter, name, surname, midtermGrade, finalTermGrade, birthDate, studentType);
        create(newStudent);
        System.out.println("Added student");
    }

    public void chooiseStudentList() {
        try {
            list().forEach(System.out::println);
            list();
        } catch (StudentNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    public void chooiseStudentSearch() {
        Scanner scanner = new Scanner(System.in);
        list();
        System.out.print("Enter the student name to search: ");
        String searchName = scanner.nextLine();
        try {
            System.out.println(findByName(searchName));
        } catch (StudentNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    public void chooiseStudenUpdate() {
        Scanner scanner = new Scanner(System.in);
        list();
        System.out.println("Enter the ID of the student to be updated:");
        int id = scanner.nextInt();
        scanner.nextLine(); // We need this if a String follows an int

        System.out.println("Enter the new student name:");
        String nameUpdate = scanner.nextLine();

        System.out.println("Enter the new student surname:");
        String surnameUpdate = scanner.nextLine();

        System.out.println("Student's birthdate (YYYY-MM-DD):");
        LocalDate birthDateUpdate = LocalDate.parse(scanner.nextLine());

        System.out.println("Student's midterm grade:");
        double midtermUpdate = scanner.nextDouble();

        System.out.println("Student's final term grade:");
        double finalTermUpdate = scanner.nextDouble();

        StudentDto studentDtoUpdate = StudentDto.builder()
                .name(nameUpdate)
                .surname(surnameUpdate)
                .midTerm(midtermUpdate)
                .finalTerm(finalTermUpdate)
                .birthDate(birthDateUpdate)
                .eStudentType(eStudentTypeMethod())
                .build();

        try {
            update(id, studentDtoUpdate);
        } catch (StudentNotFoundException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    public void chooiseStudenDelete() {
        Scanner scanner = new Scanner(System.in);
        list();
        System.out.print("Enter student ID to delete: ");
        int deleteID = scanner.nextInt();
        try {
            delete(deleteID);
            System.out.println("Student successfully deleted.");
        } catch (StudentNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    /// Student Sum Counter
    public void chooiseSumCounter() {
        System.out.println("Total Number of Students: " + studentDtoList.size());
    }

    // Random Student
    public void chooiseRandomStudent() {
        if (!studentDtoList.isEmpty()) {
            StudentDto randomStudent = studentDtoList.get((int) (Math.random() * studentDtoList.size()));
            System.out.println("Randomly Selected Student: " + randomStudent);
        } else {
            System.out.println("No students in the system.");
        }
    }

    // Calculate Student's Grade Average
    public void chooiseStudentNoteAverage() {
        if (!studentDtoList.isEmpty()) {
            double avg = studentDtoList.stream()
                    .mapToDouble(StudentDto::getResultTerm)
                    .average()
                    .orElse(0.0);
            System.out.println("Student's Grade Average: " + avg);
        } else {
            System.out.println("No students in the system.");
        }
    }

    // List Students with Highest and Lowest Grade
    public void chooiseStudentNoteMinAndMax() {
        if (!studentDtoList.isEmpty()) {
            StudentDto maxStudent = studentDtoList.stream()
                    .max((s1, s2) -> Double.compare(s1.getResultTerm(), s2.getResultTerm()))
                    .orElse(null);

            StudentDto minStudent = studentDtoList.stream()
                    .min((s1, s2) -> Double.compare(s1.getResultTerm(), s2.getResultTerm()))
                    .orElse(null);

            System.out.println("Student with the Highest Grade: " + maxStudent);
            System.out.println("Student with the Lowest Grade: " + minStudent);
        } else {
            System.out.println("Student list is empty.");
        }
    }

    // Sort Students by Birth Date
    public void chooiseStudentBirthdaySortedDate() {
        studentDtoList.stream()
                .sorted((s1, s2) -> s1.getBirthDate().compareTo(s2.getBirthDate()))
                .forEach(System.out::println);
    }

    public void chooiseExit() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Exiting the system...");
        scanner.close();
        return;
    }


    ///////////////////////////////////////////////
    // Console Chose (Add Student)
    @Override
    public void chooise() {
        Scanner scanner = new Scanner(System.in);
        StudentDao studentDao = new StudentDao();

        // Infinite loop
        while (true) {
            System.out.println("\n1. Add Student");
            System.out.println("2. List Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Total Number of Students");
            System.out.println("7. Select a Random Student");
            System.out.println("8. Calculate Student's Grade Average");
            System.out.println("9. Show Student with the Highest or Lowest Grade");
            System.out.println("10. Sort Students by Birthdate");
            System.out.println("11.Exit");
            System.out.println("Please enter your select");

            int chooise = scanner.nextInt();
            scanner.nextLine(); //Stop

            switch (chooise) {
                case 1 -> chooiseStudentAdd();

                case 2 -> chooiseStudentList();

                case 3 -> chooiseStudentSearch();

                case 4 -> chooiseStudenUpdate();

                case 5 -> chooiseStudenDelete();

                case 6 -> chooiseSumCounter();

                case 7 -> chooiseRandomStudent();

                case 8 -> chooiseStudentNoteAverage();

                case 9 -> chooiseStudentNoteMinAndMax();

                case 10 -> chooiseStudentBirthdaySortedDate();

                case 11 -> chooiseExit();

                default -> System.out.println("You entered the wrong choice");
            }
        }
    }
}
