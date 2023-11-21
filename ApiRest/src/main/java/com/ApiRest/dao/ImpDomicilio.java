package com.ApiRest.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ApiRest.entity.Domicilio;
import com.ApiRest.repository.DomicilioRepo;

@Service
public class ImpDomicilio implements IDomicilio {

	@Autowired
	private DomicilioRepo repo;

	@Override
	public Domicilio save(Domicilio domicilio) {
		return repo.save(domicilio);
	}
}
