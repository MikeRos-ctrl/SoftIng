package com.ApiRest.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ApiRest.entity.Colonia;
import com.ApiRest.repository.ColoniaRepo;

@Service
public class ImpColonia implements IColonia {

	@Autowired
	private ColoniaRepo repo;

	@Override
	public List<Colonia> findAllColonias(String ciudad_id) {

		return repo.findAllColonias(ciudad_id);
	}

}
