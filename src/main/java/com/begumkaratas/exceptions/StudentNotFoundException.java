package com.begumkaratas.exceptions;

// Öğrenci bulunamazsa Fırlatılacak Özel Exception
public class StudentNotFoundException extends RuntimeException {
    public StudentNotFoundException(String message) {
        super(message);
    }
}
