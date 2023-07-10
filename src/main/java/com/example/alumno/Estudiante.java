package com.example.alumno;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity 
@Table(name = "tbl_estudiante")
public class Estudiante {

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Integer id;
	
	private String nombre;
	
	private String apellido;
	
	private String correo;
	
}
