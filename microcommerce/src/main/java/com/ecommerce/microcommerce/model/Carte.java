package com.ecommerce.microcommerce.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table (name="tb_carte")
public class Carte implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	private Long id;
	private String numeroCarte;
	private Client client;
	private String nomSurCarte;
	private int cvc;
	private String date;
	
	
	
	public void setDate(String date) {
		this.date = date;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getNumeroCarte() {
		return numeroCarte;
	}
	public void setNumeroCarte(String numeroCarte) {
		this.numeroCarte = numeroCarte;
	}
	
	@OneToOne
	@JoinColumn(name="id_client")
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	
	public String getNomSurCarte() {
		return nomSurCarte;
	}
	public void setNomSurCarte(String nomSurCarte) {
		this.nomSurCarte = nomSurCarte;
	}
	public int getCvc() {
		return cvc;
	}
	public void setCvc(int cvc) {
		this.cvc = cvc;
	}
	public String getDate() {
		return date;
	}
	
	@Override
	public String toString() {
		return "Carte [id=" + id + ", numeroCarte=" + numeroCarte + ", client=" + client + "]";
	}
	
	
	

}
