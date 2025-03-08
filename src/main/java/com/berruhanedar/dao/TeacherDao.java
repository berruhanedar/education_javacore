package com.berruhanedar.dao;

import com.berruhanedar.dto.PersonDto;
import com.berruhanedar.dto.TeacherDto;
import com.berruhanedar.exceptions.TeacherNotFoundException;
import com.berruhanedar.tutorials._2_week._15_4_SpecialColor;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * TeacherDao , Generics
 * Lambda Expression
 */

public class TeacherDao implements IDaoGenerics<TeacherDto> {

    // Field
    private ArrayList<TeacherDto> teacherDtoList = new ArrayList<>();
    int maxId = 0;
    private static final String FILE_NAME = "teacher.txt";

    private void saveToFile() {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (TeacherDto teacher : teacherDtoList) {
                bufferedWriter.write(teacherToCsv(teacher) + "\n");
            }
            System.out.println(_15_4_SpecialColor.GREEN + "Teachers have been saved to the file." + _15_4_SpecialColor.RESET);
        } catch (IOException e) {
            System.out.println(_15_4_SpecialColor.RED + "File saving error!" + _15_4_SpecialColor.RESET);
            e.printStackTrace();
        }
    }


    @Override
    public TeacherDto create(TeacherDto teacherDto) {
        try {
            teacherDto = new TeacherDto(new PersonDto(
                    maxId++,
                    teacherDto.personDto().getName(),
                    teacherDto.personDto().getSurname(),
                    teacherDto.personDto().getBirthDate()),
                    teacherDto.subject(), teacherDto.yearsOfExperience(), teacherDto.isTenured(), teacherDto.salary());
            t
            teacherDtoList.add(teacherDto);

            saveToFile();
            System.out.println(teacherDto + " Teacher added");
            return teacherDto;

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    @Override
    public List<TeacherDto> list() {
        if (teacherDtoList.isEmpty()) throw new TeacherNotFoundException("Teacher not found");
        teacherDtoList.forEach(System.out::println);
        return teacherDtoList;
    }

    @Override
    public TeacherDto findByName(String name) {
        if (teacherDtoList.isEmpty()) throw new TeacherNotFoundException("Teacher not found");
        return teacherDtoList.stream().filter(temp -> temp.personDto().getName().equalsIgnoreCase(name))
                .findFirst()
                .orElseThrow(() -> new TeacherNotFoundException(name + " not found"));
    }

    @Override
    public TeacherDto findById(int id) {
        if (teacherDtoList.isEmpty()) throw new TeacherNotFoundException("Teacher not found");
        return teacherDtoList.stream().filter(temp -> temp.personDto().getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new TeacherNotFoundException(id + " not found"));
    }

    @Override
    public TeacherDto update(int id, TeacherDto teacherDto) {
        TeacherDto updateTeacher = new TeacherDto(new PersonDto(
                maxId++,
                teacherDto.personDto().getName(),
                teacherDto.personDto().getSurname(),
                teacherDto.personDto().getBirthDate()),
                teacherDto.subject(), teacherDto.yearsOfExperience(), teacherDto.isTenured(), teacherDto.salary());
        return null;
    }

    @Override
    public TeacherDto delete(int id) {
        try {
            Predicate<TeacherDto> isMatch = temp -> temp.personDto().getId().equals(id);
            TeacherDto foundUpdate = teacherDtoList.stream().filter(isMatch).findFirst().orElseThrow(() -> new TeacherNotFoundException(id + " not found"));
            teacherDtoList.removeIf(isMatch);
            saveToFile();
            return foundUpdate;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void chooise() {

    }
}
