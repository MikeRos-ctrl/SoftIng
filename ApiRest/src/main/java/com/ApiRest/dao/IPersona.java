package com.ApiRest.dao;

import com.ApiRest.entity.Persona;

public interface IPersona {

	public Persona save(Persona persona);
	
	public Persona findById(String curp);	
}
