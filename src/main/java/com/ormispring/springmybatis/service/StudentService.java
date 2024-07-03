package com.ormispring.springmybatis.service;

import com.ormispring.springmybatis.repository.StudentRepository;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public int countStudent() {
        return studentRepository.countStudents();
    }
}
