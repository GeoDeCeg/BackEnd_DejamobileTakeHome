package com.ecommerce.microcommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.microcommerce.model.Carte;
import com.ecommerce.microcommerce.model.Client;
import com.ecommerce.microcommerce.service.ICarteService;
import com.ecommerce.microcommerce.service.IClientService;

@RestController
@RequestMapping("carte")
public class CarteController {

	@Autowired
	ICarteService carteService;
	@Autowired
	IClientService clientService;
	
	
	@GetMapping
	public List<Carte> getAllCarte(){
		return carteService.getAllCartes();
	}
	
	@GetMapping("/{idCarte}")
	public Carte getCarteById(@PathVariable Long idCarte) {
		return carteService.getCarteById(idCarte);
	}
	
	@GetMapping("/client/{idCarte}")
	public Client getClientByCarteId(@PathVariable Long idClient, Long idCarte) {
		Carte carte = carteService.getCarteById(idCarte);
		return carte.getClient();
	}
	
	@PostMapping
	public Carte addCarte(@RequestBody Carte carte) {
		return carteService.saveOrUpdateCarte(carte);
	}
	
	@PutMapping("/{idCarte}")
	public boolean updateCarte(@RequestBody Carte carte, @PathVariable Long idCarte) {
		carte.setId(idCarte);
		carteService.saveOrUpdateCarte(carte);
		return true;
	}
	
	@DeleteMapping("/{idCarte}")
	public boolean deleteCarte(@PathVariable Long idCarte) {
		carteService.deleteCarte(idCarte);
		return true;
	}
	
	@PutMapping("/client/{idCarte}/{idClient}")
	public boolean affecterClientCarte(@PathVariable Long idCarte, @PathVariable Long idClient) {
		
		carteService.affecterClientCarte(idClient, idCarte);
		return true;
	}
}
