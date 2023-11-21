package com.ApiRest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.ApiRest.entity.Promotor;

public interface PromotorRepo extends JpaRepository<Promotor, String>{

	@Query("SELECT new Promotor(id,nombre,apellidoPaterno,apellidoMaterno) FROM Promotor WHERE nombre LIKE %:nombre%")
	List<Promotor> getPromotorByName(@Param("nombre")String nombre);
}
