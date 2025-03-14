package com.mvcproject.v1.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mvcproject.v1.model.UserModel;

@Service
public interface UserService {
    List<UserModel> listar();
    UserModel listarId(Long id);

    
}
