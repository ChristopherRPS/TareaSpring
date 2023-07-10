package com.example.alumno.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.alumno.Estudiante;

@Repository 
public interface EstudianteRepository extends JpaRepository <Estudiante , Integer>{

}
