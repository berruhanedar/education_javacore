package com.berruhanedar;

import com.berruhanedar.controller.StudentController;
import com.berruhanedar.dao.StudentDao;

public class MainTest {
    public static void main(String[] args) {
        try {
            StudentController studentController = new StudentController();
            studentController.chooise();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

