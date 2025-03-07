package com.berruhanedar.tutorials._5_week;

import com.berruhanedar.enums.EStudentType;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

// Java Record Usage
public record _01_Record(
        Integer id,
        String name,
        String surname,
        EStudentType eStudentType, // Enum Student Type
        Double midTerm,      // Midterm grade
        Double finalTerm,    // Final grade
        Double resultTerm,   // Result Grade: (Midterm 40% + Final 60%)
        LocalDate birthDate, // Birthdate
        Date createdDate     // System automatic date
) implements Serializable {

    // Serialization
    private static final long serialVersionUID = 5563646556456565465L;

    // Constructor (Automatically calculates result based on Midterm and Final grades)
    public _01_Record(Integer id, String name, String surname, Double midTerm, Double finalTerm, LocalDate birthDate, EStudentType eStudentType) {
        this(id, name, surname, eStudentType, midTerm, finalTerm, calculateResult(midTerm, finalTerm), birthDate, new Date(System.currentTimeMillis()));
    }

    // Grade calculation method
    private static Double calculateResult(Double midTerm, Double finalTerm) {
        if (midTerm == null || finalTerm == null) return 0.0;
        return (midTerm * 0.4 + finalTerm * 0.6);
    }
}
