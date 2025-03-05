package com.berruhanedar.exceptions;

// Custom exception to be thrown when a student is not found
public class StudentNotFoundException extends RuntimeException {
    public StudentNotFoundException(String message) {
        super(message);
    }
}
