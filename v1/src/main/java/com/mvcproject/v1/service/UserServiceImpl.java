package com.mvcproject.v1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.mvcproject.v1.model.UserModel;
import com.mvcproject.v1.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
     
    UserRepository userRepository;


    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
        

    }


    @Override
    public List<UserModel> listar() {
        return (List<UserModel>) userRepository.findAll();

    }


    @Override
    public UserModel listarId(Long id) {
        return userRepository.findById(id).get();
    }
    
}
