package com.berruhanedar._3_week;

import java.sql.SQLOutput;
import java.util.Date;
import java.util.Objects;

public class _04_Class_BEAN {
    private Long id;
    private String name;
    private String surname;
    private Date createdDate;

    // Constructor (with patameter)
    public _04_Class_BEAN(Long id, String name, String surname, Date createdDate) {
        this.name = name;
        this.surname = surname;
        this.createdDate = createdDate;
    }

    // Overloading
    public _04_Class_BEAN(String name, String surname) {
        id=0L;
        this.name = name;
        this.surname = surname;
        this.createdDate = new Date(System.currentTimeMillis());
    }

    // Constructor (without parameter)
    public _04_Class_BEAN() {
        id = 0L;
        this.name = "you didn't enter name";
        this.surname = "you didn't enter surname";
        this.createdDate = new Date(System.currentTimeMillis());
    }

    // Method
    public String fullName() {
        return id + " " + name.toString() + " " + this.surname + " " + createdDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    //toString


    @Override
    public String toString() {
        return "_04_Class_BEAN{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", createdDate=" + createdDate +
                '}';
    }

    // Equals and HashCode

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        _04_Class_BEAN classBean = (_04_Class_BEAN) o;
        return Objects.equals(id, classBean.id) && Objects.equals(name, classBean.name) && Objects.equals(surname, classBean.surname) && Objects.equals(createdDate, classBean.createdDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname, createdDate);
    }


    public static void main(String[] args) {
        _04_Class_BEAN bean1 = new _04_Class_BEAN();
        bean1.setId(1L);
        bean1.setName("John");
        bean1.setSurname("Doe");

        System.out.println(bean1.fullName());
        System.out.println(bean1.toString());

        System.out.println("#################");
        _04_Class_BEAN bean2 = new _04_Class_BEAN("Berru","Hanedar");
        System.out.println(bean2);

    }
}
