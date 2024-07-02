package com.ormispring.springjdbctemplateexample.repository;

import com.ormispring.springjdbctemplateexample.domain.Student;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentJdbcTemplateRepository implements StudentRepository {
    private JdbcTemplate jdbcTemplate;

    public StudentJdbcTemplateRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Student> findAll() {
//        jdbcTemplate.query("select * from student",(rs, rowNum) -> rs.getInt())
        return List.of();
    }
}
