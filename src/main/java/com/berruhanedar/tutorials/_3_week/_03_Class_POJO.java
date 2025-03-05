package com.berruhanedar.tutorials._3_week;
//PLAIN OLD JAVA OBJECT
//Only the parts where there are fields + getters and setters.

public class _03_Class_POJO {
   // Field
   private String name;
   private String surname;


   // getter and setter
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
      this.surname = surname.toUpperCase();
   }

   public static void main(String[] args) {
      _03_Class_POJO pojo = new _03_Class_POJO();
      pojo.setName("Bob");
      pojo.setSurname("Smith");
      System.out.println(pojo.getName());
      System.out.println(pojo.getSurname());
      String nameAndSurname = pojo.getName().toString()+pojo.getSurname().toString();
   }
}
