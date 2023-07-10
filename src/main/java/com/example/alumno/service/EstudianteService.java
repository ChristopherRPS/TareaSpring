package com.example.alumno.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.alumno.Estudiante;
import com.example.alumno.repository.EstudianteRepository;

@Service 

public class EstudianteService {
	@Autowired
	EstudianteRepository estudianteRepository;
	
	public List<Estudiante> getEstudiante()
	{
		return estudianteRepository.findAll();
	} 
	
	public Optional<Estudiante> getEstudiante(Integer id)
	{
		return estudianteRepository.findById(id);
	} 
	
	public void saveOrUpdate(Estudiante estudiante)
	{
		estudianteRepository.save(estudiante);
	}
	
	public void delete(Integer id)
	{
		estudianteRepository.deleteById(id);
	}
}
