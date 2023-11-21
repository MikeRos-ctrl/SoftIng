package com.ApiRest.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ApiRest.entity.Sucursal;
import com.ApiRest.repository.SucursalRepo;

@Service
public class ImpSucursal implements ISucursal {

	@Autowired
	private SucursalRepo repo;

	@Override
	public Sucursal findById(Long id) {
		return repo.findById(id).orElse(null);
	}

}
