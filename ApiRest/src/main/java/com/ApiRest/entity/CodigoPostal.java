package com.ApiRest.entity;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
public class CodigoPostal implements Serializable {

	@Id
	@Column(unique = true)
	private String codigo;

	@NotNull(message = "Pais de origen es requerido")
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "pais_id")
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	private Pais pais;

	@NotNull(message = "Estado de origen es requerido")
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "estado_id")
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	private Estado estado;

	@NotNull(message = "Ciudad de origen es requerido")
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ciudad_id")
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	private Ciudad ciudad;

	private List<Colonia> listaDeColonias;

	// -----------------------------------------------//

	public String getCodigo() {
		return codigo;
	}

	public List<Colonia> getListaDeColonias() {
		return listaDeColonias;
	}

	public void setListaDeColonias(List<Colonia> listaDeColonias) {
		this.listaDeColonias = listaDeColonias;
	}

	public Ciudad getCiudad() {
		return ciudad;
	}

	public void setCiudad(Ciudad ciudad) {
		this.ciudad = ciudad;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	private static final long serialVersionUID = 1L;
}