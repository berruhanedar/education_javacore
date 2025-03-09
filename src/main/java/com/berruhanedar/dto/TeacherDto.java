package com.berruhanedar.dto;

import com.berruhanedar.dao.ETeacherSubject;

import java.io.Serializable;
import java.time.LocalDate;

/*
//Inner Class
//Enum ()
public enum ETeacherSubject {
    MATHEMATICS,
    CHEMISTRY,
    BIOLOGY,
    HISTORY,
    COMPUTER_SCIENCE
}
*/

/**
 * @param id
 * @param name
 * @param surname
 * @param birthDate
 * @param subject
 * @param yearsOfExperience
 * @param isTenured
 * @param salary            TeacherDto is a Record
 *                          Records in Java are immutable data objects.
 *                          They do not support inheritance, but we can use Composition with PersonDto.
 */

/*
Warning!
1- Record => public record Deneme(PARAMETERS) { }
2- Constructor public Deneme { }
*/

public record TeacherDto(
        Integer id,
        String name,
        String surname,
        LocalDate birthDate,
        // String subject,
        ETeacherSubject subject,
        int yearsOfExperience,
        boolean isTenured,
        double salary

) implements Serializable {

    // Data Validation with Default Constructors
    public TeacherDto {
        if (id == null || id < 0) throw new IllegalArgumentException("ID cannot be negative");
        if (name == null || name.isBlank()) throw new IllegalArgumentException("Name cannot be blank");
        if (surname == null || surname.isBlank()) throw new IllegalArgumentException("Surname cannot be blank");
        if (birthDate == null) throw new IllegalArgumentException("Birth date cannot be null");
        if (subject == null )
            throw new IllegalArgumentException("Subject cannot be null inside Teacher.");
        if (yearsOfExperience < 0) throw new IllegalArgumentException("Years of experience cannot be negative");
        if (salary < 0) throw new IllegalArgumentException("Salary cannot be negative");
    }

    public String fullName() {
        return name + " " + surname;
    }

    public String experienceLevel() {
        return (yearsOfExperience > 10) ? "Senior Teacher" : "New Teacher";
    }
}
