package com.ApiRest.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ApiRest.entity.Telefono;
import com.ApiRest.repository.TelefonoRepo;

@Service
public class ImpTelefono implements ITelefono {

	@Autowired
	private TelefonoRepo repo;

	@Override
	public Telefono save(Telefono telefono) {
		return repo.save(telefono);
	}
}