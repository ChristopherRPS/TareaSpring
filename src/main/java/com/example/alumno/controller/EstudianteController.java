package com.example.alumno.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.alumno.Estudiante;
import com.example.alumno.service.EstudianteService;


@Controller 
@RequestMapping("/")
public class EstudianteController {
	
	@Autowired
	private EstudianteService estudianteService;
	
	
	@GetMapping 
	public List<Estudiante> getAll(){
		return estudianteService.getEstudiante();
	}
	
	@GetMapping ("/{id}")
	public Optional<Estudiante> getById(@PathVariable("id") Integer id){
		return estudianteService.getEstudiante(id);
	}
	
	@PostMapping 
	public void saveUpdate(@RequestBody Estudiante estudiante){
		estudianteService.saveOrUpdate(estudiante);
	}
	
	@DeleteMapping("/{id}") 
	public void saveUpdate(@PathVariable("id") Integer id){
		estudianteService.delete(id);
	}
	
}
