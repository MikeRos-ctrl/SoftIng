package com.ApiRest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ApiRest.entity.Domicilio;

public interface DomicilioRepo extends JpaRepository<Domicilio, Long> {

}
