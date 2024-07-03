package com.ormispring.springmybatis.service;

import com.ormispring.springmybatis.domain.Students;
import com.ormispring.springmybatis.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public int countStudent() {
        return studentRepository.countStudents();
    }

    public List<Students> getStudents(Long id) {
        return studentRepository.findStudents(id);
    }

    public void saveStudent(Students students) {
        studentRepository.saveStudent(students);
    }
}
