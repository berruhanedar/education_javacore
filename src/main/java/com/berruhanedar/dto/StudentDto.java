package com.berruhanedar.dto;

import com.berruhanedar._2_week._15_4_SpecialColor;
import com.berruhanedar.enums.EStudentType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

@AllArgsConstructor
@Builder
@ToString
@EqualsAndHashCode

//Student
public class StudentDto implements Serializable {
    //Serializable
    public static final Long serialVersionUID = 1L;

    // Field
    private Integer id;
    private String name;
    private String surname;
    private EStudentType eStudentType; // Enum
    private Double midTerm;
    private Double finalTerm;
    private Double resultTerm;
    private LocalDate birthDate;
    private Date createdDate; // System-generated date

    //static (Created only once throughout the object's lifetime)
    static {
        System.out.println(_15_4_SpecialColor.BLUE + "loaded static StudentDto" + _15_4_SpecialColor.RESET);
    }

    // Constructor without parameter
    public StudentDto() {
    }

    // Constructor with parameter
    public StudentDto(Integer id, String name, String surname, Double midTerm, Double finalTerm, LocalDate birthDate, EStudentType eStudentType) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.midTerm = midTerm;
        this.finalTerm = finalTerm;
        this.birthDate = birthDate;
        this.createdDate = new Date(System.currentTimeMillis());
        this.resultTerm = calculateResult();
        this.eStudentType = eStudentType;
    }

    // Methods
    // Midterm and final calculate
    private Double calculateResult() {
        if (midTerm == null || finalTerm == null) {
            return 0.0;
        } else {
            return (midTerm * 0.4 + finalTerm * 0.6);
        }
    }

    // Getter ad Setter
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Double getMidTerm() {
        return midTerm;
    }

    public void setMidTerm(Double midTerm) {
        this.midTerm = midTerm;
        this.resultTerm = calculateResult();
    }

    public Double getFinalTerm() {
        return finalTerm;
    }

    public void setFinalTerm(Double finalTerm) {
        this.finalTerm = finalTerm;
        this.resultTerm = calculateResult();
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public EStudentType geteStudentType() {
        return eStudentType;
    }

    public void seteStudentType(EStudentType eStudentType) {
        this.eStudentType = eStudentType;
    }
}