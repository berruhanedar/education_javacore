package com.berruhanedar.tutorials._3_week;

import java.util.Date;
import java.util.Objects;

public class _04_Class_BEAN {
    private Long id;
    private String name;
    private String surname;
    private Date createdDate;

    // Constructor (with patameter)
    public _04_Class_BEAN(Long id, String name, String surname, Date createdDate) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.createdDate = createdDate;
    }

    // Overloading
    public _04_Class_BEAN(String name, String surname) {
        id = 0L;
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

    // NAME
    // 2. When setting the name, can the first letter be capitalized and the rest lowercase?
    // 4. Can we add validation to check for punctuation marks in the name?
    //    If punctuation exists, remove everything after (and including) the punctuation mark.

    public String getName() {
        return name;
    }

    // 2. When setting the name, ensure the first letter is uppercase and the rest are lowercase.
    // 4. Add validation to check if the name contains punctuation marks.
    //    If punctuation is found, remove all characters from (and including) the punctuation mark.

    public void setName(String name){
        if (name != null && !name.isEmpty() && name.matches(".*[.,!?;:]+.*")) {
            // throw new IllegalAccessException("The name contains punctuation marks.");
            // System.err.println("The name contains punctuation marks.");
            System.out.println("The name contains punctuation marks; all characters after the punctuation mark have been removed.");
            name = name.replaceAll("[.,!?;:].*", "");
            System.out.println(name);
        }
        if (name != null && !name.isEmpty()) {
            this.name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
        } else {
            this.name = name;
        }
    }


    // Surname: Convert the first three letters of the user's surname to uppercase and if the surname has more than three characters, replace the remaining letters with stars ****.
    // Example: Berru HANEDAR = Berru HAN****.
    // Type: LOOP, CONDITIONAL

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        if (surname != null && surname.length() > 3) {
            this.surname = surname.substring(0,3).toUpperCase()+"*".repeat(surname.length()-3);


        } else if (surname != null) {
            this.surname = surname.toLowerCase();
        } else {
            this.surname = "";
        }
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
        bean1.setSurname("Doeney");

        System.out.println(bean1.fullName());
        System.out.println(bean1.toString());

        System.out.println("#################");
        _04_Class_BEAN bean2 = new _04_Class_BEAN("Berru", "Hanedar");
        System.out.println(bean2);

        System.out.println("#################");


    }
}
