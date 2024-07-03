package com.ormispring.springdatajpaexample.repository;

import com.ormispring.springdatajpaexample.domain.Students;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Students, Long> {   // JpaRepository
    List<Students> findByName(String name);
}
