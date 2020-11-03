package com.ecommerce.microcommerce.service;

import java.util.List;

import com.ecommerce.microcommerce.model.Carte;

public interface ICarteService {
	
	public Carte saveOrUpdateCarte(Carte carte);
	
	public boolean deleteCarte(Long idCarte);
	
	public List<Carte> getAllCartes ();
	
	public Carte getCarteById(Long idCarte);
	
	public boolean affecterClientCarte(Long idClient, Long idCarte);
		

}
