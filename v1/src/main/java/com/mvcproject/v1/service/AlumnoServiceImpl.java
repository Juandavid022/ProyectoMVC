package com.mvcproject.v1.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.mvcproject.v1.model.AlumnoModel;
import com.mvcproject.v1.repository.AlumnoRepository;


@Service
public class AlumnoServiceImpl implements AlumnoService {

    AlumnoRepository alumnoRepository;
     
    @Autowired
    public AlumnoServiceImpl(AlumnoRepository alumnoRepository){
        this.alumnoRepository = alumnoRepository;

    }

    @Override
    public List<AlumnoModel> listar() {
        return (List<AlumnoModel>) alumnoRepository.findAll();
    }

    // Método para obtener un alumno por ID
    @Override
    public AlumnoModel listarId(Long id) {
        Optional<AlumnoModel> alumnoOptional = alumnoRepository.findById(id);
        return alumnoOptional.orElseThrow(() -> new RuntimeException("Alumno no encontrado con ID: " + id));
    }

    // Método para guardar o registrar un alumno
    @Override
    public AlumnoModel guardar(AlumnoModel alumno) {
        return alumnoRepository.save(alumno);
    }

      
}
