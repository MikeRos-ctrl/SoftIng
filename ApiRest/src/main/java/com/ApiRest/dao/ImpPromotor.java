package com.ApiRest.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.ApiRest.entity.Promotor;
import com.ApiRest.repository.PromotorRepo;

@Service
public class ImpPromotor implements IPromotor {

	@Autowired
	private PromotorRepo repo;
	
	@Override
	public ResponseEntity<?> findPromotor(String idOrName) {

		Map<String, Object> response = new HashMap<>();
		HttpStatus status = null;
		Optional<?> data;

		try {

			// First we search by id
			data = repo.findById(idOrName);

			// If it's null we search by the name
			if (!data.isPresent()) {
				List<Promotor> promotors = repo.getPromotorByName(idOrName);
			
				// Didn't find anything
				if (promotors.isEmpty()) {
					response.put("Mensaje", "No se encontro a ningun promotor con la informacion proporcionada");
					status = HttpStatus.NOT_FOUND;
				}
				// we found something
				else {
					data = Optional.of(promotors);
					response.put("Mensaje", "Informacion encontrada");
					response.put("Promotor", data);
					status = HttpStatus.OK;
				}

			}
			// we are ready to go
			else {
				response.put("Mensaje", "Promotor encontrado");
				response.put("Promotor", data);
				status = HttpStatus.OK;
			}

		} catch (Exception e) {
			response.put("Mensaje", "Error interno");
			response.put("Error", e.getMessage());
			status = HttpStatus.INTERNAL_SERVER_ERROR;
		}

		return new ResponseEntity<Map<String, Object>>(response, status);
	}



	@Override
	public Promotor findById(String id) {
		return repo.findById(id).orElse(null);
	}
}