package com.ApiRest.entity;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

@Entity
public class Estado implements Serializable {

	@Id
	@NotEmpty(message = "Nombre del estado requerido")
	@Column(unique = true)
	private String nombre;

	@NotNull(message = "Pais de origen es requerido")
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "pais_id")
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	private Pais pais;

	// -----------------------------------------------//

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@JsonIgnore
	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}
	
	private static final long serialVersionUID = 1L;
}