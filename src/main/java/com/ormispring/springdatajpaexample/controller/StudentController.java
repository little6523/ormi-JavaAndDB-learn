package com.ormispring.springdatajpaexample.controller;

import com.ormispring.springdatajpaexample.domain.Students;
import com.ormispring.springdatajpaexample.service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//@Controller    return 값을 "hello" -> view로 리턴
@RestController     // return 값을 json 값으로 변경
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/students")
    public List<Students> getAllStudents() {
        return studentService.selectAllStudents();
    }
}
