package com.ormispring.springjdbctemplateexample.repository;

import com.ormispring.springjdbctemplateexample.domain.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StudentJdbcTemplateRepositoryTest {

    @Autowired
    @Qualifier("studentJdbcTemplateRepository")
    private StudentRepository studentRepository;

    @Test
    void insertTest() {
        Student student = new Student();
        student.setName("장이수");
        student.setAge(40);
        student.setAddress("제주도");
        studentRepository.insertStudent(student);
    }

    @Test
    void selectTest() {

    }
}