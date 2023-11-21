package com.ApiRest.dao;

import org.springframework.http.ResponseEntity;

import com.ApiRest.entity.Promotor;

public interface IPromotor {

	public ResponseEntity<?> findPromotor(String idOrName);

	public Promotor findById(String id);

}
