package com.begumkaratas.controller;

import com.begumkaratas.dao.IDaoGenerics;
import com.begumkaratas.dao.StudentDao;
import com.begumkaratas.dto.StudentDto;
import com.begumkaratas.utils.SpecialColor;

import java.util.List;

public class StudentController implements IDaoGenerics<StudentDto> {

    // INJECTION
    private final StudentDao studentDao;

    // Parametresizz Constructor
    public StudentController() {
        this.studentDao = new StudentDao();
    }

    // CREATE
    @Override
    public StudentDto create(StudentDto studentDto) {
        StudentDto createdStudent = studentDao.create(studentDto);
        if (createdStudent == null) {
            System.out.println(SpecialColor.RED + "❌ Öğrenci oluşturulamadı. Geçerli bilgiler giriniz." + SpecialColor.RESET);
        }
        return createdStudent;
    }


    // FIND BY NAME
    @Override
    public StudentDto findByName(String name) {
        return studentDao.findByName(name);
    }

    @Override
    public StudentDto findById(int id) {
        return null;
    }

    // LIST
    @Override
    public List<StudentDto> list() {
        return studentDao.list();
    }

    // UPDATE
    @Override
    public StudentDto update(int id, StudentDto studentDto) {
        return studentDao.update(id, studentDto);
    }

    // DELETE
    @Override
    public StudentDto delete(int id) {
        return studentDao.delete(id);
    }

    // CHOOISE(Switch-case)
    @Override
    public void chooise() {
        studentDao.chooise();
    }
}
