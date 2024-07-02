package com.ormispring.springjdbctemplateexample.repository;

import com.ormispring.springjdbctemplateexample.domain.Student;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
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
        return jdbcTemplate.query("select * from students", (rs, rowNum) ->
                new Student(rs.getInt("id"),
                        rs.getString("name"),
                        rs.getInt("age"),
                        rs.getString("address")));
    }

    @Override
    public int insertStudent(Student student) {
        return jdbcTemplate.update(
                "Insert into students (name, age, address) values (?, ?, ?)",
                student.getName(), student.getAge(), student.getAddress());
    }

//    @Override
//    public List<Student> findStudents(String name) {
//        MapSqlParameterSource mapSqlParameterSource = new MapSqlParameterSource().addValue("name", name);
//        return jdbcTemplate.query("SELECT * FROM students WHERE name = :name",
//                mapSqlParameterSource,
//                (rs, rowNum) -> new Student(rs.getLong("id"), rs.getString("name"),
//                        rs.getInt("age"), rs.getString("address"), rs.getDate("created_at")));
//    }
}
