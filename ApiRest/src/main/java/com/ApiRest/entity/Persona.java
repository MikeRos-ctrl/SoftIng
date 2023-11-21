package com.ApiRest.entity;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
public class Persona implements Serializable {

	@Id
	@Column(unique = true)
	@Size(min = 18, max = 18, message = "Debe tener 18 caracteres")
	private String curp;

	@NotEmpty(message = "se requiere un nombre")
	private String nombre;

	@NotEmpty(message = "se requiere un apellido paterno")
	private String apellidoPaterno;

	private String apellidoMaterno;

	@Column(unique = true)
	@NotEmpty(message = "se requiere un correo")
	@Email(message = "formato de correo invalido")
	private String correo;

	@Column(unique = true)
	@NotEmpty(message = "se requiere un rfc")
	@Size(min = 12, max = 12, message = "rfc debe tener 18 caracteres")
	private String rfc;

	@NotEmpty(message = "se requiere un fecha de nacimiento")
	private String fechaNacimiento;

	@NotEmpty(message = "se requiere un genero")
	private String sexo;

	// -----------------------------------------------//

	public String getCurp() {
		return curp;
	}

	public void setCurp(String curp) {
		this.curp = curp;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public String getApellidoMaterno() {
		return apellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getRfc() {
		return rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	private static final long serialVersionUID = 1L;
}