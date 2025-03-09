package com.berruhanedar.controller;

import com.berruhanedar.dao.IDaoGenerics;
import com.berruhanedar.dao.TeacherDao;
import com.berruhanedar.dto.TeacherDto;
import com.berruhanedar.tutorials._2_week._15_4_SpecialColor;

import java.util.List;

public class TeacherController implements IDaoGenerics<TeacherDto> {

    // INJECTION
    private final TeacherDao teacherDao;

    // Parametresiz Constructor
    public TeacherController() {
        this.teacherDao = new TeacherDao();
    }

    // CREATE
    @Override
    public TeacherDto create(TeacherDto teacherDto) {
        TeacherDto createdTeacher = teacherDao.create(teacherDto);
        if (createdTeacher == null) {
            System.out.println(_15_4_SpecialColor.RED + "❌ Teacher could not be created. Please enter valid information." + _15_4_SpecialColor.RESET);
        }
        return createdTeacher;
    }

    // LIST
    @Override
    public List<TeacherDto> list() {
        return teacherDao.list();
    }

    // FIND BY NAME
    @Override
    public TeacherDto findByName(String name) {
        return teacherDao.findByName(name);
    }

    @Override
    public TeacherDto findById(int id) {
        return null;
    }

    // UPDATE
    @Override
    public TeacherDto update(int id, TeacherDto teacherDto) {
        return teacherDao.update(id, teacherDto);
    }

    // DELETE
    @Override
    public TeacherDto delete(int id) {
        return teacherDao.delete(id);
    }

    // CHOOISE(Switch-case)
    @Override
    public void choose() {
        teacherDao.choose();
    }
}
