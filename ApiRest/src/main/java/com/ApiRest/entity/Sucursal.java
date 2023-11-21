package com.ApiRest.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;

@Entity
public class Sucursal implements Serializable {

	@Id
	@NotEmpty(message = "se requiere el numero de la sucursal")
	private Long numero;

	@NotEmpty(message = "se requiere la direccion de la sucursal")
	private String direccion;

	// -----------------------------------------------//

	public String getDireccion() {
		return direccion;
	}

	public Long getNumero() {
		return numero;
	}

	public void setNumero(Long numero) {
		this.numero = numero;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	private static final long serialVersionUID = 1L;
}
