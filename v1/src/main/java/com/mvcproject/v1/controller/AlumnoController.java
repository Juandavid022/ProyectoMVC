package com.mvcproject.v1.controller;


import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.security.core.Authentication;
// import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;




import com.mvcproject.v1.model.AlumnoModel;
import com.mvcproject.v1.service.AlumnoService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;

import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "Alumnos", description = "Operaciones sobre el manejo y recursos de los alumnos")
@Controller
@RequestMapping(value = "/student")
public class AlumnoController {

     @Autowired 
     private AlumnoService alumnoService;



          @Operation(
        summary = "Obtener todos los Alumnos",
        description = "Devuelve una lista de Alumnos registrados.",
        responses = {
            @ApiResponse(responseCode = "200", description = "Lista de alumnos obtenida correctamente",
                content = @Content(schema = @Schema(implementation = AlumnoModel.class))),
            @ApiResponse(responseCode = "500", description = "Error interno del servidor")
        }
    ) 

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

    @Operation(
        summary = "Guardar arreglo floral",
        description = "Recolecta variables del formulario para la creaci[on del arreglo floral.",
        responses = {
            @ApiResponse(responseCode = "200", description = "Lista de arreglos florales obtenida correctamente",
                content = @Content(schema = @Schema(implementation = AlumnoModel.class))),
            @ApiResponse(responseCode = "500", description = "Error interno del servidor")
        }
    )
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