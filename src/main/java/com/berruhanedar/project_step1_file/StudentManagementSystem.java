package com.berruhanedar.project_step1_file;

import com.berruhanedar.dto.StudentDto;
import com.berruhanedar.enums.EStudentType;
import com.berruhanedar.exceptions.StudentNotFoundException;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
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
    private void createFileIfNotExists(){
        File file = new File(FILE_NAME);
        if(!file.exists()){
            try{
                file.createNewFile();
                System.out.println("File "+FILE_NAME+ " created");
            }catch(IOException ioException){
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
    public void add(StudentDto dto) {
        studentDtoList.add(new StudentDto(++studentCounter, dto.getName(), dto.getSurname(), dto.getMidTerm(),
                dto.getFinalTerm(), dto.getBirthDate(),dto.geteStudentType())
        );
        System.out.println("Added student");
        // Add to File
        saveToFile();
    }

    // Student List
    public void list() {
        if (studentDtoList.isEmpty()) {
            System.out.println("No Students Available");
            return;
        } else {
            System.out.println("Student List:");
            studentDtoList.forEach(System.out::println);
        }
    }

    // Search Student
    public void search(String name) {
        /*studentDtoList.stream()
            .filter(temp -> temp.getName().equalsIgnoreCase(name))
            .forEach(System.out::println);*/

        boolean found = studentDtoList
                .stream()
                .filter(temp -> temp.getName().equalsIgnoreCase(name))
                .peek(System.out::println) // Print if the matching data exists
                .findAny() // Check if there is any matching student
                .isPresent();

        // Öğrenci yoksa
        // If No Student Found
        if (!found) {
            throw new StudentNotFoundException(name + " named student not found");
        }
    }

    // Update Student
    public void update(int id, StudentDto dto) {
        for (StudentDto temp : studentDtoList) {
            if (temp.getId() == id) {
                temp.setName(dto.getName());
                temp.setSurname(dto.getSurname());
                temp.setBirthDate(dto.getBirthDate());
                temp.setMidTerm(dto.getMidTerm());
                temp.setFinalTerm(dto.getFinalTerm());
                temp.seteStudentType(dto.geteStudentType());
                System.out.println("Student information updated");
                saveToFile();
                return;
            }
        }
        System.out.println("Student not found");
    }

    // Delete Student
    public void delete(int id) {
        /*studentDtoList.removeIf(temp -> temp.getId() == id);
        System.out.println("Student deleted");*/

        boolean removed = studentDtoList.removeIf(temp -> temp.getId() == id);
        if (removed) {
            System.out.println("Student deleted successfully");
            saveToFile();
        } else {
            throw new StudentNotFoundException("Student not found");
        }
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

    ///////////////////////////////////////////////
    // Console Chose (Add Student)
    public void chooise() {
        Scanner scanner = new Scanner(System.in);
        StudentManagementSystem studentManagementSystem = new StudentManagementSystem();

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
                case 1:
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

                    studentManagementSystem.add(new StudentDto(++studentCounter, name, surname, midtermGrade, finalTermGrade, birthDate,eStudentTypeMethod()));
                    break;

                case 2:
                    studentManagementSystem.list();
                    break;

                case 3:
                    System.out.println("Enter the name of the student to search ");
                    String searchName = scanner.nextLine();
                    studentManagementSystem.search(searchName);
                    break;

                case 4:
                    studentManagementSystem.list();
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
                        studentManagementSystem.update(id, studentDtoUpdate);
                    } catch (StudentNotFoundException e) {
                        System.out.println(e.getMessage());
                        e.printStackTrace();
                    }
                    break;

                case 5:
                    studentManagementSystem.list();
                    System.out.println("Enter the ID of the student to be deleted:");
                    int idDeleted = scanner.nextInt();
                    studentManagementSystem.delete(idDeleted);
                    break;

                case 6:
                    studentManagementSystem.list();
                    break;

                case 10:
                    System.out.println("Exiting the system");
                    System.exit(0);
                    break;

                default:
                    System.out.println("You entered the wrong choice");
                    break;
            }
        }
    }
}
