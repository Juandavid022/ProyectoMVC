package com.mvcproject.v1.model;

import java.time.LocalDate;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "students_tbl")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AlumnoModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true, length = 50)
    private String username;

    @Column(nullable = false)
    private LocalDate birthdate;  // Validación de fecha para que sea en el pasado

    @Column(nullable = false, length = 50)
    private String gender;

    @Column(nullable = false, unique = true, length = 50)
    private String email;  // Validación de correo electrónico

    @Column(nullable = false, length = 50)
    private String phone;

    @Column(nullable = false, length = 50)
    private String paymentMethod;  // Enum para tipos de métodos de pago
    
}
