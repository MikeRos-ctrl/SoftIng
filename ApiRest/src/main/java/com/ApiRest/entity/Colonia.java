package com.ApiRest.entity;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotNull;

@Entity
public class Colonia implements Serializable {

	@Id
	// @Column(unique = true)
	private String nombre;

	@NotNull(message = "Ciudad de origen es requerido")
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ciudad_id")
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	private Ciudad ciudad;

	// -----------------------------------------------//

	public Colonia() {
	}

	public Colonia(String nombre, Ciudad ciudad) {
		this.nombre = nombre;
		this.ciudad = ciudad;
	}

	public Colonia(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@JsonIgnore
	public Ciudad getCiudad() {
		return ciudad;
	}

	public void setCiudad(Ciudad ciudad) {
		this.ciudad = ciudad;
	}

	private static final long serialVersionUID = 1L;

}
