package com.ecommerce.microcommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.microcommerce.model.Carte;
import com.ecommerce.microcommerce.model.Client;
import com.ecommerce.microcommerce.repository.ICarteRepository;
import com.ecommerce.microcommerce.repository.IClientRepository;


@Service
public class CarteService implements ICarteService{

	@Autowired
	ICarteRepository carteRepository;
	@Autowired
	IClientRepository clientRepository;
	
	@Override
	public Carte saveOrUpdateCarte(Carte carte) {
		
		return carteRepository.save(carte);
	}

	@Override
	public boolean deleteCarte(Long idCarte) {
		carteRepository.deleteById(idCarte);
		return true;
	}

	@Override
	public List<Carte> getAllCartes() {
		return carteRepository.findAll();
	}

	@Override
	public Carte getCarteById(Long idCarte) {
		
		return carteRepository.findById(idCarte).get();
	}

	@Override
	public boolean affecterClientCarte(Long idClient, Long idCarte) {


		Carte carte = carteRepository.findById(idClient).get();
		Client client = clientRepository.findById(idClient).get();
		
		carte.setClient(client);
		carteRepository.save(carte);
		
		return true;
	}

}
