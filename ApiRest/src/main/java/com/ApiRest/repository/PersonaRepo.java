package com.ApiRest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ApiRest.entity.Persona;

public interface PersonaRepo extends JpaRepository<Persona, String>{

}