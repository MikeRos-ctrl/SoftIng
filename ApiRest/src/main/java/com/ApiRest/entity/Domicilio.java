package com.ApiRest.entity;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.NotNull;

@Entity
public class Domicilio implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull(message = "Calle es requerida")
	private String calle;

	@NotNull(message = "Numero exterior es requerido")
	private String numeroexterior;

	private String numerointerior;

	@NotNull(message = "referencia de la calle 1 es requerido")
	private String entrecalle1;

	private String entrecalle2;

	@NotNull(message = "Curp del usuario requerida")
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "persona_curp")
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	private Persona persona;

	@NotNull(message = "Codigo postal es requerido")
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codigo_id")
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	private CodigoPostal codigopostal;

	@NotNull(message = "Colonia es requerida")
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "colonia_id")
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	private Colonia colonia;

	// -----------------------------------------------//

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public String getNumeroexterior() {
		return numeroexterior;
	}

	public void setNumeroexterior(String numeroexterior) {
		this.numeroexterior = numeroexterior;
	}

	public String getNumerointerior() {
		return numerointerior;
	}

	public void setNumerointerior(String numerointerior) {
		this.numerointerior = numerointerior;
	}

	public String getEntrecalle1() {
		return entrecalle1;
	}

	public void setEntrecalle1(String entrecalle1) {
		this.entrecalle1 = entrecalle1;
	}

	public String getEntrecalle2() {
		return entrecalle2;
	}

	public void setEntrecalle2(String entrecalle2) {
		this.entrecalle2 = entrecalle2;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public CodigoPostal getCodigopostal() {
		return codigopostal;
	}

	public void setCodigopostal(CodigoPostal codigopostal) {
		this.codigopostal = codigopostal;
	}

	public Colonia getColonia() {
		return colonia;
	}

	public void setColonia(Colonia colonia) {
		this.colonia = colonia;
	}

	private static final long serialVersionUID = 1L;

}