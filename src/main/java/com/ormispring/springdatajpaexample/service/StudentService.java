package com.ormispring.springdatajpaexample.service;

import com.ormispring.springdatajpaexample.domain.RoleType;
import com.ormispring.springdatajpaexample.domain.Students;
import com.ormispring.springdatajpaexample.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Students> selectAllStudents() {
        return studentRepository.findByName("이름");
    }

    public List<Students> selectAllByName(String name) {
        return studentRepository.findByName(name);
    }

    public Students insertStudents(Students students) {
        RoleType.ADMIN.name(); // "ADMIN"
        return studentRepository.save(students);
    }
}
