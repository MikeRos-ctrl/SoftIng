package com.ApiRest.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ApiRest.entity.*;
import com.ApiRest.repository.CodigoPostalRepo;

@Service
public class ImpCodigoPostal implements ICodigoPostal {

	@Autowired
	private CodigoPostalRepo repo;

	@Override
	public CodigoPostal findById(String codigo) {
		return repo.findById(codigo).orElse(null);
	}
}
