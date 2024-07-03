package com.ormispring.springmybatis.repository;

import com.ormispring.springmybatis.domain.Students;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface StudentMapper {
    int countStudents();

    List<Students> findStudents(@Param("id") Long id);   // SELECT * FROM students WHERE id = #{id}

    void saveStudent(Students students);
}
