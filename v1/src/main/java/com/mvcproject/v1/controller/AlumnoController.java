package com.mvcproject.v1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


import com.mvcproject.v1.model.AlumnoModel;
import com.mvcproject.v1.service.AlumnoService;


@Controller
@RequestMapping(value = "/student")
public class AlumnoController {

     @Autowired 
     private AlumnoService alumnoService;

    @GetMapping("/getStudents")
    public String listarAlumnos(Model model) {
        System.out.println("Estudiantes: " + alumnoService.listar());  // Agrega esto para ver si hay datos en la lista
        model.addAttribute("students", alumnoService.listar());
        return "students/getStudents";
    }

     @GetMapping("/register-student")
    public String mostrarFormularioRegistro(Model model) {
        model.addAttribute("students", new AlumnoModel());
        return "students/register-student"; 
    }

    @PostMapping("/register-student")
    public String registrarAlumno(@ModelAttribute AlumnoModel alumno 
       // , BindingResult result,
        //RedirectAttributes redirectAttributes
        ) {
        
        alumnoService.guardar(alumno);
        System.out.println("Guardar: " + alumno);  // Agrega esto para ver si hay datos en la lista
        return "redirect:getStudents";
        
    }
        

}