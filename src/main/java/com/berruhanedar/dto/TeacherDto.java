package com.berruhanedar.dto;

import java.io.Serializable;

/**
 * @param personDto
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
        PersonDto personDto, // Composition
        String subject,
        int yearsOfExperience,
        boolean isTenured,
        double salary
) implements Serializable {

    // Data Validation with Default Constructors
    public TeacherDto {
        if (personDto == null) throw new IllegalArgumentException("Person information cannot be null inside Teacher.");
        if (subject == null || subject.isBlank() || subject.isEmpty())
            throw new IllegalArgumentException("Subject cannot be null inside Teacher.");
        if (yearsOfExperience < 0) throw new IllegalArgumentException("Years of experience cannot be negative");
        if (salary < 0) throw new IllegalArgumentException("Salary cannot be negative");
    }

    public String fullName() {
        return personDto.id + " " + personDto.name + " " + personDto.surname;
    }

    public String experienceLevel() {
        return (yearsOfExperience > 10) ? "Senior Teacher" : "New Teacher";
    }


}
