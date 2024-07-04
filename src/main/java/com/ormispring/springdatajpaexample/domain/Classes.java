package com.ormispring.springdatajpaexample.domain;

import jakarta.persistence.*;

@Entity
public class Classes {

    @Id
    @GeneratedValue
    private long classId;

    private String name;

    @ManyToOne
    @JoinColumn(name = "STUDENTS_ID")
    private Students students;
}
