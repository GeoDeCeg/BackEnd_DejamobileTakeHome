package com.ecommerce.microcommerce.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table (name="tb_client")
public class Client implements Serializable {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Long idClient;
	private String email;
	private String login;
	private String password;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getIdClient() {
		return idClient;
	}
	
	public void setIdClient(Long idClient) {
		this.idClient = idClient;
	}
	
	public void setIdClient(long idClient) {
		this.idClient = idClient;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getLogin() {
		return login;
	}
	
	public void setLogin(String login) {
		this.login = login;
	}


	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Client [idClient=" + idClient + ", email=" + email + ", login=" + login + ", password=" + password
				+ "]";
	}
	
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	

}
