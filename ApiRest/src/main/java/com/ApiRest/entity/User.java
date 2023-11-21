package com.ApiRest.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(unique = true)
	@NotEmpty(message = "se requiere un nombre de usuario")
	private String USERNAME;

	@NotEmpty(message = "se requiere una contraseña11")
	private String PWD;

	public User() {
		
	}
	
	public User(Long id, @NotEmpty(message = "se requiere un nombre de usuario") String uSERNAME,
			@NotEmpty(message = "se requiere una contraseña11") String pWD) {
		this.id = id;
		this.USERNAME = uSERNAME;
		this.PWD = pWD;
	}

	// -----------------------------------------------//

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUSERNAME() {
		return USERNAME;
	}

	public void setUSERNAME(String uSERNAME) {
		USERNAME = uSERNAME;
	}

	public String getPWD() {
		return PWD;
	}

	public void setPWD(String pWD) {
		PWD = pWD;
	}

}
