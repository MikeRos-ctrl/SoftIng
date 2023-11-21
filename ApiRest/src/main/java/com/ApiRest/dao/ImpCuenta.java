package com.ApiRest.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ApiRest.entity.Cuenta;
import com.ApiRest.repository.CuentaRepo;

@Service
public class ImpCuenta implements ICuenta{
	
	@Autowired
	private CuentaRepo repo;

	@Override
	public Cuenta insert(Cuenta cuenta) {
		return repo.save(cuenta);
	}

}
