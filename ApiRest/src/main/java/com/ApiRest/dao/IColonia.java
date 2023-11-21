package com.ApiRest.dao;

import java.util.List;

import com.ApiRest.entity.Colonia;

public interface IColonia {

	public List<Colonia> findAllColonias(String ciudad_id);
}
