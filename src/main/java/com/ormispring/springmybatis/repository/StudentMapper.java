package com.ormispring.springmybatis.repository;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StudentMapper {
    int countStudents();
}
