package com.mvcproject.v1.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "class_tbl")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class ClaseModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = false, length = 50)
    private String className;

    @Column(nullable = false)
    private LocalDate level; 

    @Column(nullable = false, unique = false, length = 50)
    private String schedule;

    
    @Column(nullable = false, unique = false, length = 50) 
    private String teacher; 

    @Column(nullable = false, unique = false, length = 50)
    private String student;

}



    
