package com.berruhanedar.dto;

import com.berruhanedar.tutorials._2_week._15_4_SpecialColor;
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

// Student
public class StudentDto extends PersonDto implements Serializable {
    // Serializable
    public static final Long serialVersionUID = 1L;

    // Fields
    private EStudentType eStudentType; // Enum Student Type
    private Double midTerm;      // Midterm grade
    private Double finalTerm;    // Final grade
    private Double resultTerm;   // Result grade: (Midterm 40% + Final 60%)
    private String status;       // Passed or Failed?

    // static (Created only once throughout the object's lifetime)
    static {
        System.out.println(_15_4_SpecialColor.BLUE + "loaded static StudentDto" + _15_4_SpecialColor.RESET);
    }

    // Constructor with parameters
    public StudentDto() {
        super();
        this.midTerm = 0.0;
        this.finalTerm = 0.0;
        this.resultTerm = 0.0;
        this.resultTerm = 0.0; // default value
    }

    // toString
    @Override
    public String toString() {
        return super.toString() + "StudentDto{" +
                "eStudentType=" + eStudentType +
                ", midTerm=" + midTerm +
                ", finalTerm=" + finalTerm +
                ", resultTerm=" + resultTerm +
                ", status='" + status + '\'' +
                "} ";
    }

    @Override
    public void displayInfo() {
        System.out.println("Student " + name + " " + surname + " " + birthDate);
    }

    public StudentDto(Integer id, String name, String surname, LocalDate birthDate, Double midTerm, Double finalTerm, EStudentType eStudentType) {
        // Calling the constructor from the parent class (StudentDto)
        super(id, name, surname, birthDate);
        // this: Local
        this.midTerm = midTerm;
        this.finalTerm = finalTerm;
        this.resultTerm = calculateResult();
        this.status = determineStatus();
        this.eStudentType = eStudentType;
    }

    // Methods
    // Midterm and final calculation
    private Double calculateResult() {
        if (midTerm == null || finalTerm == null) {
            return 0.0;
        } else {
            return (midTerm * 0.4 + finalTerm * 0.6);
        }
    }

    // **📌 Status: Passed / Failed**
    private String determineStatus() {
        if (this.resultTerm == null) return "Unknown"; // **Null check added**
        return (this.resultTerm >= 50.0) ? "Passed" : "Failed";
    }

    // Getters and Setters
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
    public Double getResultTerm() {
        return resultTerm;
    }

    public void setResultTerm(Double resultTerm) {
        this.resultTerm = resultTerm;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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
