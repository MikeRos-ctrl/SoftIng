package com.ApiRest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ApiRest.entity.Cuenta;

public interface CuentaRepo extends JpaRepository<Cuenta, Long>{

}
