package com.berruhanedar.dao;

import com.berruhanedar.dto.StudentDto;
import com.berruhanedar.enums.EStudentType;
import com.berruhanedar.exceptions.StudentNotFoundException;
import com.berruhanedar.tutorials._2_week._15_4_SpecialColor;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;


public class StudentDao implements IDaoGenerics<StudentDto> {

    // Field
    private ArrayList<StudentDto> studentDtoList = new ArrayList<>();

    // ID will now be accessible by all classes
    int maxId = 0;

    private static final String FILE_NAME = "students.txt";

    // **📌 Defined the Scanner object at the top**
    private final Scanner scanner = new Scanner(System.in);

    // static
    static {

    }

    // Parameterless Constructor
    public StudentDao() {
        // Automatically create students.txt if it does not exist
        createFileIfNotExists();

        // Load the student list immediately when the program starts
        loadStudentsListFromFile();
    }


    // FileIO => Create students.txt if it has not been created
    // 📌 Creates the file if it does not exist
    private void createFileIfNotExists() {
        File file = new File(FILE_NAME);
        if (!file.exists()) {
            try {
                if (file.createNewFile()) {
                    System.out.println(_15_4_SpecialColor.YELLOW + FILE_NAME + " has been created." + _15_4_SpecialColor.RESET);
                }
            } catch (IOException e) {
                System.out.println(_15_4_SpecialColor.RED + "An error occurred while creating the file!" + _15_4_SpecialColor.RESET);
                e.printStackTrace();
            }
        }
    }

    // 📌 Save students to file (BufferedWriter)
    private void saveToFile() {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (StudentDto student : studentDtoList) {
                bufferedWriter.write(studentToCsv(student) + "\n");
            }
            System.out.println(_15_4_SpecialColor.GREEN + "Students have been saved to the file." + _15_4_SpecialColor.RESET);
        } catch (IOException e) {
            System.out.println(_15_4_SpecialColor.RED + "File saving error!" + _15_4_SpecialColor.RESET);
            e.printStackTrace();
        }
    }

    // 📌 Load students from file (BufferedReader)
    private void loadStudentsListFromFile() {
        // Clear the existing data in the list
        studentDtoList.clear();
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                StudentDto student = csvToStudent(line);
                if (student != null) {
                    studentDtoList.add(student);
                }
            }
            //studentCounter = studentDtoList.size();
            // ✅ Find the highest ID among students
        /*
        studentCounter = studentDtoList.stream()
                .mapToInt(StudentDto::getId)
                .max()
                .orElse(0); // Initialize as zero if no students exist
        */

        } catch (IOException e) {
            System.out.println(_15_4_SpecialColor.RED + "File reading error!" + _15_4_SpecialColor.RESET);
            e.printStackTrace();
        }
    }

    /////////////////////////////////////////////////////////////
    // 📌 Convert Student object to CSV format
    // This method converts a StudentDto object into a comma-separated text (CSV) format.
    // This allows student data to be stored in a file as line-based records.
    private String studentToCsv(StudentDto student) {
        return
                student.getId() + "," +          // Adds student ID
                        student.getName() + "," +        // Adds student name
                        student.getSurname() + "," +     // Adds student surname
                        student.getMidTerm() + "," +     // Adds student midterm grade
                        student.getFinalTerm() + "," +   // Adds student final grade
                        student.getResultTerm() + "," +  // Adds student result grade
                        student.getStatus() + "," +      // Adds student pass/fail status
                        student.getBirthDate() + "," +   // Adds student birth date
                        student.geteStudentType();       // Adds student education type (Undergraduate, Graduate, etc.)
    }

    // 📌 Convert CSV format line to StudentDto object
    // This method splits a CSV formatted line and converts it into a StudentDto object.
    // It is called for each line read from the file and transfers the data to the appropriate object.

    // 📌 Convert CSV format line to StudentDto object (while reading from file)
    private StudentDto csvToStudent(String csvLine) {
        try {
            String[] parts = csvLine.split(",");  // Splits the line into an array using commas
            if (parts.length < 9) return null;    // **If data is missing, stops the process and returns null**

            // PersonDto =>  Integer id, String name, String surname, LocalDate birthDate
            // StudentDto =>  Integer id, String name, String surname, LocalDate birthDate, Double midTerm, Double finalTerm, EStudentType eStudentType
            StudentDto student = new StudentDto(
                    Integer.parseInt(parts[0]),  // Converts ID value to integer
                    parts[1],                    // Gets the name
                    parts[2],                    // Gets the surname
                    LocalDate.parse(parts[3]),   // Converts birth date to LocalDate format
                    Double.parseDouble(parts[4]),// Converts midterm grade to double
                    Double.parseDouble(parts[5]),// Converts final grade to double
                    EStudentType.valueOf(parts[8]) // Converts education type (Enum)
            );

            // **Pass/Fail status is added to the student object as read from CSV**
            student.setResultTerm(Double.parseDouble(parts[6])); // **Sets result grade**
            student.setStatus(parts[7]); // **Sets pass/fail status from CSV**

            return student;
        } catch (Exception e) {
            System.out.println(_15_4_SpecialColor.RED + "Error loading student from CSV!" + _15_4_SpecialColor.RESET);
            return null; // Returns null to prevent the program from crashing in case of an error
        }
    }

    /// /////////////////////////////////////////////////////////////
    // C-R-U-D
    // Add Student
    // 📌 Add Student (Create)
    @Override
    public StudentDto create(StudentDto studentDto) {
        try {
            // 📌 Ensuring data validation
            validateStudent(studentDto);

            // Get the highest ID from the student list
            maxId = studentDtoList
                    .stream()
                    .mapToInt(StudentDto::getId)
                    .max()
                    .orElse(0); // If no student exists, start from zero

            // Set the new student's ID as the highest ID + 1
            studentDto.setId(maxId + 1);

            // Assign the ID and add the new student object to the list
            // 📌 **Since the ID is now public static, it is accessible from all classes!**
            studentDtoList.add(studentDto);
            saveToFile();

            System.out.println(studentDto + _15_4_SpecialColor.GREEN + "✅ Student added successfully!" + _15_4_SpecialColor.RESET);
            return studentDto;

        } catch (IllegalArgumentException e) {
            System.out.println(_15_4_SpecialColor.RED + "⛔ Error: " + e.getMessage() + _15_4_SpecialColor.RESET);
            return null; // In case of an error, the object will not be created
        }
    }

    // 📌 Student Validation (Valid Data Check)
    private void validateStudent(StudentDto studentDto) {
    /*if (studentDto.getId() != null && studentDto.getId() < 1) {
        throw new IllegalArgumentException("ID must be 1 or greater.");
    }*/

        // Check if the name is valid (only letters and not empty)
        if (studentDto.getName() == null || !studentDto.getName().matches("^[a-zA-ZığüşöçİĞÜŞÖÇ]+$")) {
            throw new IllegalArgumentException("Name must only contain letters and cannot be empty.");
        }

        // Check if the surname is valid (only letters and not empty)
        if (studentDto.getSurname() == null || !studentDto.getSurname().matches("^[a-zA-ZığüşöçİĞÜŞÖÇ]+$")) {
            throw new IllegalArgumentException("Surname must only contain letters and cannot be empty.");
        }

        // Check if midterm score is between 0 and 100
        if (studentDto.getMidTerm() == null || studentDto.getMidTerm() < 0 || studentDto.getMidTerm() > 100) {
            throw new IllegalArgumentException("Midterm score must be between 0 and 100.");
        }

        // Check if final score is between 0 and 100
        if (studentDto.getFinalTerm() == null || studentDto.getFinalTerm() < 0 || studentDto.getFinalTerm() > 100) {
            throw new IllegalArgumentException("Final score must be between 0 and 100.");
        }

        // Birth date cannot be in the future
        if (studentDto.getBirthDate() == null || studentDto.getBirthDate().isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("Birth date cannot be in the future.");
        }

        // Student type cannot be null
        if (studentDto.geteStudentType() == null) {
            throw new IllegalArgumentException("Student type cannot be empty.");
        }
    }

    // Student List
    @Override
    public ArrayList<StudentDto> list() {
        // If there are no students
        if (studentDtoList.isEmpty()) {
            throw new StudentNotFoundException("No students found.");
        } else {
            System.out.println(_15_4_SpecialColor.BLUE + " Student List" + _15_4_SpecialColor.RESET);

            // Display list (Method 1)
            studentDtoList.forEach(System.out::println);

            // Display list (Method 2)
        /*
        for (StudentDto student : studentDtoList) {
            Double result = student.getResultTerm() != null ? student.getResultTerm() : 0.0;
            System.out.println("ID: " + student.getId() +
                               " | Name: " + student.getName() +
                               " | Result: " + student.getResultTerm() +
                               " | Status: " + student.getStatus());
        }
        */
        }
        return studentDtoList;
    }

    // Search Student by Name
    @Override
    public StudentDto findByName(String name) {
        // Method 1 (Uncommented)
    /*
    studentDtoList.stream()
            .filter(temp -> temp.getName().equalsIgnoreCase(name))
            .forEach(System.out::println); // Print matching students
    */

        // Method 2 (Uncommented)
    /*
    boolean found = studentDtoList
            .stream()
            .filter(temp -> temp.getName().equalsIgnoreCase(name))
            .peek(System.out::println) // Print if matching student found
            .findAny() // Check if there is any matching student
            .isPresent();

    // If student not found
    if (!found) {
        throw new StudentNotFoundException(name + " could not be found.");
    }
    */

        // Method 3 (Used in this implementation)
        Optional<StudentDto> student = studentDtoList.stream()
                .filter(s -> s.getName().equalsIgnoreCase(name))
                .findFirst();

        // Return the student if found, else throw exception
        return student.orElseThrow(() -> new StudentNotFoundException(name + " could not be found."));
    }

    // FIND BY ID
    @Override
    public StudentDto findById(int id) {
        return null;
    }

    // Update Student
    @Override
    public StudentDto update(int id, StudentDto studentDto) {
        try {
            for (StudentDto temp : studentDtoList) {
                if (temp.getId() == id) {
                    temp.setName(studentDto.getName());
                    temp.setSurname(studentDto.getSurname());
                    temp.setBirthDate(studentDto.getBirthDate());
                    temp.setMidTerm(studentDto.getMidTerm());
                    temp.setFinalTerm(studentDto.getFinalTerm());
                    temp.setResultTerm(temp.getMidTerm() * 0.4 + temp.getFinalTerm() * 0.6);
                    temp.seteStudentType(studentDto.geteStudentType());
                    // Updated Student Information
                    System.out.println(_15_4_SpecialColor.BLUE + temp + " Student Information Updated" + _15_4_SpecialColor.RESET);
                    // Save to file
                    saveToFile();
                    return temp;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        throw new StudentNotFoundException("Student not found.");
    }

    // Delete Student
    @Override
    public StudentDto delete(int id) {
        // studentDtoList.removeIf(temp -> temp.getId() == id);
        boolean removed = studentDtoList.removeIf(temp -> temp.getId() == id);
        if (removed) {
            System.out.println(_15_4_SpecialColor.BLUE + "Student Deleted" + _15_4_SpecialColor.RESET);
            // Save the deleted student to the file
            saveToFile();
            return null;
        } else {
            System.out.println(_15_4_SpecialColor.RED + "Student Not Deleted" + _15_4_SpecialColor.RESET);
            throw new StudentNotFoundException("Student could not be deleted, ID not found.");
        }
    }

    /// //////////////////////////////////////////////////////////////////////
// Enum Student Type Method
    public EStudentType studentTypeMethod() {
        System.out.println("\n" + _15_4_SpecialColor.GREEN + "Please choose a student type.\n1-)Undergraduate\n2-)Graduate\n3-)PhD" + _15_4_SpecialColor.RESET);
        int typeChoice = scanner.nextInt();
        EStudentType switchCaseStudent = switch (typeChoice) {
            case 1 -> EStudentType.UNDERGRADUATE;
            case 2 -> EStudentType.GRADUATE;
            case 3 -> EStudentType.PHD;
            default -> EStudentType.OTHER;
        };
        return switchCaseStudent;
    }

    /// ///////////////////////////////////////////////////////////////////////
// Console Selection (Student)
    @Override
    public void chooise() {
        while (true) {
            try {
                System.out.println("\n" + _15_4_SpecialColor.BLUE + "===== STUDENT MANAGEMENT SYSTEM =====" + _15_4_SpecialColor.RESET);
                System.out.println(_15_4_SpecialColor.YELLOW + "1. Add Student");
                System.out.println("2. List Students");
                System.out.println("3. Search Student");
                System.out.println("4. Update Student");
                System.out.println("5. Delete Student");
                System.out.println("6. Total Number of Students");
                System.out.println("7. Select Random Student");
                System.out.println("8. Calculate Student GPA");
                System.out.println("9. Highest & Lowest Scoring Student");
                System.out.println("10. Sort Students by Birthdate");
                System.out.println("11. Show Student Passed/Failed Status");
                System.out.println("12. Exit" + _15_4_SpecialColor.RESET);
                System.out.print("\n" + _15_4_SpecialColor.PURPLE + "Please make your selection: " + _15_4_SpecialColor.RESET);

                int choice = scanner.nextInt();
                scanner.nextLine(); // Clear the buffer

                switch (choice) {
                    case 1 -> chooiseStudentAdd();

                    case 2 -> chooiseStudentList();

                    case 3 -> chooiseStudenSearch();

                    case 4 -> chooiseStudenUpdate();

                    case 5 -> chooiseStudenDelete();

                    case 6 -> chooiseSumCounter();

                    case 7 -> chooiseRandomStudent();

                    case 8 -> chooiseStudentNoteAverage();

                    case 9 -> chooiseStudentNoteMinAndMax();

                    case 10 -> chooiseStudentBirthdaySortedDate();

                    case 11 -> listStudentsWithStatus();

                    case 12 -> chooiseExit();

                    default -> System.out.println("Invalid choice! Please try again.");
                }
            } catch (Exception e) {
                System.out.println(_15_4_SpecialColor.RED + "⛔ An unexpected error occurred: " + e.getMessage() + _15_4_SpecialColor.RESET);
                scanner.nextLine(); // Clear the scanner for new input in case of an error
            }
        }
    }

    /// ///////////////////////////////////////////////////////////////////////
// Student Add
    public void chooiseStudentAdd() {
        while (true) { // Loop until the user enters a valid input
            try {
                // 📌 Keep looping until a valid name is entered
                String name;
                while (true) {
                    System.out.print("Student Name: ");
                    name = scanner.nextLine().trim();
                    if (name.matches("^[a-zA-ZığüşöçİĞÜŞÖÇ]+$")) break;
                    System.out.println(_15_4_SpecialColor.RED + "⛔ Invalid name! Only letters are allowed." + _15_4_SpecialColor.RESET);
                }

                // 📌 Keep looping until a valid surname is entered
                String surname;
                while (true) {
                    System.out.print("Student Surname: ");
                    surname = scanner.nextLine().trim();
                    if (surname.matches("^[a-zA-ZığüşöçİĞÜŞÖÇ]+$")) break;
                    System.out.println(_15_4_SpecialColor.RED + "⛔ Invalid surname! Only letters are allowed." + _15_4_SpecialColor.RESET);
                }

                // 📌 Keep looping until a valid birthdate is entered
                LocalDate birthDate;
                while (true) {
                    System.out.print("Birthdate (YYYY-MM-DD): ");
                    String input = scanner.nextLine().trim();
                    try {
                        birthDate = LocalDate.parse(input);
                        if (!birthDate.isAfter(LocalDate.now())) break;
                        System.out.println(_15_4_SpecialColor.RED + "⛔ Invalid birthdate! It cannot be in the future." + _15_4_SpecialColor.RESET);
                    } catch (Exception e) {
                        System.out.println(_15_4_SpecialColor.RED + "⛔ Invalid format! Please enter in YYYY-MM-DD format." + _15_4_SpecialColor.RESET);
                    }
                }

                // 📌 Keep looping until a valid midterm grade is entered
                double midTerm;
                while (true) {
                    System.out.print("Midterm Grade (0-100): ");
                    String input = scanner.nextLine().trim();
                    try {
                        midTerm = Double.parseDouble(input);
                        if (midTerm >= 0 && midTerm <= 100) break;
                        System.out.println(_15_4_SpecialColor.RED + "⛔ Invalid midterm grade! Enter a value between 0-100." + _15_4_SpecialColor.RESET);
                    } catch (NumberFormatException e) {
                        System.out.println(_15_4_SpecialColor.RED + "⛔ Invalid input! Please enter a number." + _15_4_SpecialColor.RESET);
                    }
                }

                // 📌 Keep looping until a valid final grade is entered
                double finalTerm;
                while (true) {
                    System.out.print("Final Grade (0-100): ");
                    String input = scanner.nextLine().trim();
                    try {
                        finalTerm = Double.parseDouble(input);
                        if (finalTerm >= 0 && finalTerm <= 100) break;
                        System.out.println(_15_4_SpecialColor.RED + "⛔ Invalid final grade! Enter a value between 0-100." + _15_4_SpecialColor.RESET);
                    } catch (NumberFormatException e) {
                        System.out.println(_15_4_SpecialColor.RED + "⛔ Invalid input! Please enter a number." + _15_4_SpecialColor.RESET);
                    }
                }

                // 📌 Choose the student type
                EStudentType studentType = studentTypeMethod();

                // 📌 Create the student object
                // Integer id, String name, String surname, LocalDate birthDate, Double midTerm, Double finalTerm, EStudentType studentType
                StudentDto newStudent = new StudentDto(maxId, name, surname, birthDate, midTerm, finalTerm, studentType);
                StudentDto createdStudent = create(newStudent);

                if (createdStudent != null) {
                    break; // 🔹 Exit the loop if successfully added
                } else {
                    System.out.println(_15_4_SpecialColor.RED + "⛔ Error occurred while adding student. Please try again." + _15_4_SpecialColor.RESET);
                }
            } catch (Exception e) {
                System.out.println(_15_4_SpecialColor.RED + "⛔ An unexpected error occurred: " + e.getMessage() + _15_4_SpecialColor.RESET);
                scanner.nextLine(); // 🔹 Clear the buffer after an error
            }
        }
    }

    // Student List
    public void chooiseStudentList() {
        try {
            //list().forEach(System.out::println);
            list();
        } catch (StudentNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    // Student Search
    public void chooiseStudenSearch() {
        list(); // 📌 Display the list of students
        System.out.print("Student Name to Search: "); // 📌 Prompt the user for the student's name to search
        String searchName = scanner.nextLine();
        try {
            System.out.println(findByName(searchName)); // 📌 Attempt to find the student by name and print the result
        } catch (StudentNotFoundException e) {
            System.out.println(e.getMessage()); // 📌 Handle the exception if the student is not found
        }
    }

    /// Student Update
    public void chooiseStudenUpdate() {
        list(); // 📌 Display the list of students
        System.out.print("Enter the Student ID to Update: "); // 📌 Prompt the user for the student ID to update
        int id = scanner.nextInt();
        scanner.nextLine(); // 📌 Clean the buffer

        System.out.print("New Name: "); // 📌 Prompt the user for the new name
        String nameUpdate = scanner.nextLine();

        System.out.print("New Surname: "); // 📌 Prompt the user for the new surname
        String surnameUpdate = scanner.nextLine();

        System.out.print("Birth Date (YYYY-MM-DD): "); // 📌 Prompt the user for the new birth date
        LocalDate birthDateUpdate = LocalDate.parse(scanner.nextLine());

        System.out.print("New Midterm Grade: "); // 📌 Prompt the user for the new midterm grade
        double midTermUpdate = scanner.nextDouble();

        System.out.print("New Final Grade: "); // 📌 Prompt the user for the new final grade
        double finalTermUpdate = scanner.nextDouble();

        // 📌 Create a new StudentDto object with the updated values
        StudentDto studentUpdate = new StudentDto(id, nameUpdate, surnameUpdate, birthDateUpdate, midTermUpdate, finalTermUpdate, studentTypeMethod());

        try {
            update(id, studentUpdate); // 📌 Attempt to update the student with the given ID
            System.out.println("Student successfully updated."); // 📌 Notify the user of the successful update
        } catch (StudentNotFoundException e) {
            System.out.println(e.getMessage()); // 📌 Handle the exception if the student with the given ID is not found
        }
    }

    /// Student Delete
    public void chooiseStudenDelete() {
        list(); // 📌 Display the list of students
        System.out.print("Enter the Student ID to Delete: "); // 📌 Prompt the user for the student ID to delete
        int deleteID = scanner.nextInt();

        try {
            delete(deleteID); // 📌 Attempt to delete the student with the given ID
            System.out.println("Student successfully deleted."); // 📌 Notify the user of the successful deletion
        } catch (StudentNotFoundException e) {
            System.out.println(e.getMessage()); // 📌 Handle the exception if the student with the given ID is not found
        }
    }

    ///////////////////////////////////////////////////////////////
// Total Student Count

    /// Student Sum Counter
    public void chooiseSumCounter() {
        System.out.println("Total Student Count: " + studentDtoList.size()); // 📌 Display the total number of students in the list
    }

    // Random Student
/// Student Random
    public void chooiseRandomStudent() {
        if (!studentDtoList.isEmpty()) { // 📌 Check if the list is not empty
            StudentDto randomStudent = studentDtoList.get((int) (Math.random() * studentDtoList.size())); // 📌 Select a random student from the list
            System.out.println("Randomly Selected Student: " + randomStudent); // 📌 Display the randomly selected student
        } else {
            System.out.println("No students in the system."); // 📌 Display a message if the list is empty
        }
    }

    /// Calculate Student's GPA
    public void chooiseStudentNoteAverage() {
        if (!studentDtoList.isEmpty()) {
            double avg = studentDtoList.stream()
                    .mapToDouble(StudentDto::getResultTerm)
                    .average()
                    .orElse(0.0);
            System.out.println("Student's GPA: " + avg);
        } else {
            System.out.println("Student list is empty.");
        }
    }

    /// Student with the Highest & Lowest Grade
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
    // Student Ranking (Birthday)

    /// Sort Students by Birth Date
    public void chooiseStudentBirthdaySortedDate() {
        studentDtoList.stream()
                .sorted((s1, s2) -> s1.getBirthDate().compareTo(s2.getBirthDate()))
                .forEach(System.out::println);
    }

    // Passed Students
    private List<StudentDto> listStudentsWithStatus() {
        List<StudentDto> studentDtostatus = list();
        return studentDtostatus;
    }

    // Exit
    public void chooiseExit() {
        System.out.println("Exiting the system...");
        scanner.close();
        return;
    }

} // end class


