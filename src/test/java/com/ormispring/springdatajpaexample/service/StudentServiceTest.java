package com.ormispring.springdatajpaexample.service;

import com.ormispring.springdatajpaexample.domain.Students;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StudentServiceTest {

    @Autowired
    private StudentService studentService;

    @Test
    public void insertTest() {
        Students students = new Students("메시", 37, "아르헨티나");
        studentService.insertStudents(students);
    }
}