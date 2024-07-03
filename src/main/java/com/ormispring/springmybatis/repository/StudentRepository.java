package com.ormispring.springmybatis.repository;

import org.springframework.stereotype.Repository;

@Repository
public class StudentRepository {

    private StudentMapper studentMapper;

    public StudentRepository(StudentMapper studentMapper) {
        this.studentMapper = studentMapper;
    }

    public int countStudents() {
        return studentMapper.countStudents();
    }
}
