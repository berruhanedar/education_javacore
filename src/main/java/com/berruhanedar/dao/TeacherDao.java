package com.berruhanedar.dao;

import com.berruhanedar.dto.TeacherDto;
import com.berruhanedar.exceptions.TeacherNotFoundException;
import com.berruhanedar.tutorials._2_week._15_4_SpecialColor;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.*;

/**
 * TeacherDao , Generics
 * Lambda Expression
 */

public class TeacherDao implements IDaoGenerics<TeacherDto> {

    // Field
    private ArrayList<TeacherDto> teacherDtoList;
    private final Scanner scanner = new Scanner(System.in);
    private static final Random random = new Random();
    private static final String FILE_NAME = "teacher.txt";

    public TeacherDao() {
        // Default
        teacherDtoList = new ArrayList<>();
        createFileIfNotExists();
        loadTeachersFromFile();
    }

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


    private void saveToFile() {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (TeacherDto teacher : teacherDtoList) {
                bufferedWriter.write(teacherToCsv(teacher) + "\n");
            }
            System.out.println("Teachers have been saved to the file.");
        } catch (IOException e) {
            System.out.println("File saving error!");
            e.printStackTrace();
        }
    }

    private void loadTeachersFromFile() {
        teacherDtoList.clear();
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                TeacherDto teacher = csvToTeacher(line);
                if (teacher != null) {
                    teacherDtoList.add(teacher);
                }
            }
        } catch (IOException e) {
            System.out.println("File reading error!");
            e.printStackTrace();
        }
    }

    private String teacherToCsv(TeacherDto teacher) {
        return
                teacher.id() + "," +
                        teacher.name() + "," +
                        teacher.surname() + "," +
                        teacher.birthDate() + "," +
                        teacher.subject() + "," +
                        teacher.yearsOfExperience() + "," +
                        teacher.isTenured() + "," +
                        teacher.salary();
    }


    private TeacherDto csvToTeacher(String csvLine) {
        try {
            String[] parts = csvLine.split(",");
            if (parts.length != 8) {
                System.err.println("Wrong format" + csvLine);
                return null;
            }
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate birthDate = null;
            try {
                if (!parts[3].isBlank()) {
                    birthDate = LocalDate.parse(parts[3], formatter);
                }
            } catch (DateTimeParseException e) {
                System.err.println("Geçersiz tarih formatı: " + parts[3] + " (Beklenen format: yyyy-MM-dd)");
                return null;
            }
            return new TeacherDto(
                    Integer.parseInt(parts[0]),
                    parts[1],
                    parts[2],
                    birthDate,
                    // parts[4],
                    ETeacherSubject.valueOf(parts[4]),
                    Integer.parseInt(parts[5]),
                    Boolean.parseBoolean(parts[6]),
                    Double.parseDouble(parts[7])
            );
        } catch (Exception e) {
            System.err.println("Erroe: " + e.getMessage());
            return null;
        }
    }

    @Override
    public TeacherDto create(TeacherDto teacher) {
        teacherDtoList.add(teacher);
        saveToFile();
        return teacher;
    }

    @Override
    public List<TeacherDto> list() {
        return new ArrayList<>(teacherDtoList);
    }

    @Override
    public TeacherDto findByName(String name) {
        return teacherDtoList.stream()
                .filter(temp -> temp.name().equalsIgnoreCase(name))
                .findFirst()
                .orElseThrow(() -> new TeacherNotFoundException(name + " not found"));
    }

    @Override
    public TeacherDto findById(int id) {
        return teacherDtoList.stream().filter(temp -> temp.id().equals(id))
                .findFirst()
                .orElseThrow(() -> new TeacherNotFoundException(id + " not found"));
    }

    @Override
    public TeacherDto update(int id, TeacherDto updatedTeacher) {
        for (int i = 0; i < teacherDtoList.size(); i++) {
            if (teacherDtoList.get(i).id() == id) {
                teacherDtoList.set(i, updatedTeacher);
                saveToFile();
                return updatedTeacher;
            }
        }
        throw new TeacherNotFoundException(id + " not found");
    }

    @Override
    public TeacherDto delete(int id) {
        Optional<TeacherDto> teacher = teacherDtoList.stream()
                .filter(t -> t.id() == id)
                .findFirst();
        teacher.ifPresent(teacherDtoList::remove);
        saveToFile();
        return teacher.orElseThrow(() -> new TeacherNotFoundException(id + " not found"));
    }

    public ETeacherSubject teacherTypeMethod() {
        System.out.println("\n" + _15_4_SpecialColor.GREEN + "Öğretmen türünü seçiniz.\n1-)History\n2-)Biology\n3-)Chemistry\n4-)Computer Science\n5-)Other" + _15_4_SpecialColor.RESET);
        int typeChooise = scanner.nextInt();
        ETeacherSubject swichcaseTeacher = switch (typeChooise) {
            case 1 -> ETeacherSubject.HISTORY;
            case 2 -> ETeacherSubject.BIOLOGY;
            case 3 -> ETeacherSubject.CHEMISTRY;
            case 4 -> ETeacherSubject.COMPUTER_SCIENCE;
            case 5 -> ETeacherSubject.MATHEMATICS;
            default -> ETeacherSubject.OTHER;
        };
        return swichcaseTeacher;
    }

    @Override
    public void choose() {
        while (true) {
            try {
                System.out.println("\n===== TEACHER MANAGEMENT SYSTEM =====");
                System.out.println("1. Add Teacher");
                System.out.println("2. List Teachers");
                System.out.println("3. Search Teacher");
                System.out.println("4. Update Teacher");
                System.out.println("5. Delete Teacher");
                System.out.println("6. Choose Random Teacher");
                System.out.println("7. Sort Teachers by Age");
                System.out.println("8. Exit");
                System.out.print("\nPlease make your selection: ");

                int choice = scanner.nextInt();
                scanner.nextLine(); // Clear the buffer

                switch (choice) {
                    case 1 -> addTeacher();
                    case 2 -> listTeachers();
                    case 3 -> searchTeacher();
                    case 4 -> updateTeacher();
                    case 5 -> deleteTeacher();
                    case 6 -> chooseRandomTeacher();
                    case 7 -> sortTeachersByAge();
                    case 8 -> {
                        System.out.println("Exiting...");
                        return;
                    }
                    default -> System.out.println("Invalid selection! Please try again.");
                }
            } catch (Exception e) {
                System.out.println("⛔ An unexpected error occurred: " + e.getMessage());
                scanner.nextLine();
            }
        }
    }


    private void addTeacher() {
        System.out.print("Teacher ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("First Name: ");
        String name = scanner.nextLine();

        System.out.print("Last Name: ");
        String surname = scanner.nextLine();

        System.out.print("Birth Date (yyyy-MM-dd): ");
        LocalDate birthDate = LocalDate.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("yyyy-MM-dd"));

        System.out.print("Subject Area (HISTORY, BIOLOGY, CHEMISTRY, COMPUTER_SCIENCE, MATHEMATICS, OTHER): ");
        ETeacherSubject subject = teacherTypeMethod();

        System.out.print("Years of Experience: ");
        int yearsOfExperience = scanner.nextInt();

        System.out.print("Is Tenured? (true/false): ");
        boolean isTenured = scanner.nextBoolean();

        System.out.print("Salary: ");
        double salary = scanner.nextDouble();

        TeacherDto teacher = new TeacherDto(id, name, surname, birthDate, subject, yearsOfExperience, isTenured, salary);
        teacherDtoList.add(teacher);
        saveToFile();
        System.out.println("Teacher successfully added.");
    }

    private void listTeachers() {
        if (teacherDtoList.isEmpty()) {
            System.out.println("No teachers found.");
            return;
        }
        System.out.println("\n=== Teacher List ===");
        teacherDtoList.forEach(t -> System.out.println(t.fullName() + " - " + t.subject()));
    }

    private void searchTeacher() {
        System.out.print("Enter the name of the teacher to search for: ");
        String name = scanner.nextLine();
        try {
            TeacherDto teacher = findByName(name);
            System.out.println("Found Teacher: " + teacher.fullName() + " - " + teacher.subject());
        } catch (TeacherNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    private void updateTeacher() {
        System.out.print("Enter the ID of the teacher to update: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        try {
            TeacherDto existingTeacher = findById(id);

            System.out.print("New First Name (Current: " + existingTeacher.name() + "): ");
            String name = scanner.nextLine();
            System.out.print("New Last Name (Current: " + existingTeacher.surname() + "): ");
            String surname = scanner.nextLine();
            System.out.print("New Salary (Current: " + existingTeacher.salary() + "): ");
            double salary = scanner.nextDouble();

            TeacherDto updatedTeacher = new TeacherDto(
                    existingTeacher.id(),
                    name.isBlank() ? existingTeacher.name() : name,
                    surname.isBlank() ? existingTeacher.surname() : surname,
                    existingTeacher.birthDate(),
                    existingTeacher.subject(),
                    existingTeacher.yearsOfExperience(),
                    existingTeacher.isTenured(),
                    salary > 0 ? salary : existingTeacher.salary()
            );

            update(id, updatedTeacher);
            System.out.println("Teacher successfully updated.");
        } catch (TeacherNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    private void deleteTeacher() {
        System.out.print("Enter the ID of the teacher to delete: ");
        int id = scanner.nextInt();
        try {
            delete(id);
            System.out.println("Teacher successfully deleted.");
        } catch (TeacherNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    private void chooseRandomTeacher() {
        if (teacherDtoList.isEmpty()) {
            System.out.println("No teachers registered.");
            return;
        }
        TeacherDto teacher = teacherDtoList.get(random.nextInt(teacherDtoList.size()));
        System.out.println("Randomly Chosen Teacher: " + teacher.fullName());
    }

    private void sortTeachersByAge() {
        teacherDtoList.sort(Comparator.comparing(TeacherDto::birthDate));
        System.out.println("Teachers sorted by age.");
        listTeachers();
    }
}