package com.begumkaratas;

import com.begumkaratas.controller.StudentController;
import com.begumkaratas.dto.PersonDto;

//
public class Main {
    public static void main(String[] args) {
        try {
            StudentController studentController = new StudentController();
            studentController.chooise();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}