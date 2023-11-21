package com.ApiRest.entity;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

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
public class Cuenta implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotEmpty(message = "se requiere un tipo de cuenta")
	private String tipo;
	
	@NotEmpty(message = "se requiere un tipo de cuenta")
	private String fechaOperacion;	
	
	@NotNull(message = "Curp del usuario requerida")
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="persona_curp")
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private Persona persona;
	
	@NotNull(message = "Promotor que lo registro es requerido")
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="promotor_id")
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private Promotor promotor;
	
	@NotNull(message = "Sucursal donde se dio de alta es requerido")
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="sucursal_id")
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private Sucursal sucursal;
	
	//-----------------------------------------------//

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getFechaOperacion() {
		return fechaOperacion;
	}

	public void setFechaOperacion(String fechaOperacion) {
		this.fechaOperacion = fechaOperacion;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public Promotor getPromotor() {
		return promotor;
	}

	public void setPromotor(Promotor promotor) {
		this.promotor = promotor;
	}

	public Sucursal getSucursal() {
		return sucursal;
	}

	public void setSucursal(Sucursal sucursal) {
		this.sucursal = sucursal;
	}
	
	private static final long serialVersionUID = 1L;
}
