package com.ApiRest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ApiRest.entity.*;

public interface CodigoPostalRepo extends JpaRepository<CodigoPostal, String> {

}
