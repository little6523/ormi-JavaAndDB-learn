package com.ormispring.springmybatis.controller;

import com.ormispring.springmybatis.domain.Students;
import com.ormispring.springmybatis.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/students/count")
    public int countStudents() {
        return studentService.countStudent();
    }

    // students DB 전체 정보 출력     /students?id=1 or /students
    @GetMapping("/students")
    public List<Students> getStudents(@RequestParam(required = false) Long id) {
        return studentService.getStudents(id);
    }

    @PostMapping("/students")   // POST /students {"name": "이름", "age": 20, "address": "서울시"}
    public String addStudent(@RequestBody Students students) {
        // INSERT
        studentService.saveStudent(students);
        return "OK";
    }

}
