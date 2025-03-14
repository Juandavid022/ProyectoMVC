package com.mvcproject.v1.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mvcproject.v1.model.InstructorModel;


@Repository
public interface InstructorRepository extends CrudRepository<InstructorModel, Long> {
 
    
}