package com.ApiRest.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ApiRest.entity.Persona;
import com.ApiRest.repository.PersonaRepo;

@Service
public class ImpPersona implements IPersona {

	@Autowired
	private PersonaRepo repo;

	@Override
	public Persona save(Persona persona) {
		return repo.save(persona);
	}

	@Override
	public Persona findById(String curp) {
		return repo.findById(curp).orElse(null);
	}
}