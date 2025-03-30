package com.mvcproject.v1.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mvcproject.v1.model.AlumnoModel;


@Service
public interface AlumnoService {
    List<AlumnoModel> listar();
    AlumnoModel listarId(Long id);
    AlumnoModel guardar(AlumnoModel alumno);
    


    
}
