package com.mvcproject.v1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mvcproject.v1.model.AlumnoModel;

@Repository
public interface AlumnoRepository extends JpaRepository <AlumnoModel, Long> {
 
    
}