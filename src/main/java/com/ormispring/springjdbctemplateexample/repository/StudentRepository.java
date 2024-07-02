package com.ormispring.springjdbctemplateexample.repository;

import com.ormispring.springjdbctemplateexample.domain.Student;

import java.util.List;

public interface StudentRepository {

    List<Student> findAll();

    int insertStudent(Student student);

//    List<Student> findStudents(String name);
}
