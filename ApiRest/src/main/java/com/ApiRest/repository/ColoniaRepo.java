package com.ApiRest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ApiRest.entity.Colonia;

public interface ColoniaRepo extends JpaRepository<Colonia, String> {
	
//  @Query("SELECT new Colonia(nombre) FROM Colonia WHERE ciudad_id=:ciudad_id")
	
	@Query("SELECT new Colonia(c.nombre) FROM Colonia c WHERE c.ciudad.id = :ciudad_id")	
	List<Colonia> findAllColonias(@Param("ciudad_id") String ciudad_id);
}