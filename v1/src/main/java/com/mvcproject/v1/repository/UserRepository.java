package com.mvcproject.v1.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mvcproject.v1.model.UserModel;;

@Repository
public interface UserRepository extends CrudRepository<UserModel, Long> {
 
    
}