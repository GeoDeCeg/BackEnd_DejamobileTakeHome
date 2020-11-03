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

import com.ecommerce.microcommerce.model.Client;
import com.ecommerce.microcommerce.service.ClientService;
import com.ecommerce.microcommerce.service.IClientService;

@RestController
@RequestMapping("client")
public class ClientController {

	@Autowired
	IClientService clientService;
	
	@GetMapping
	public List<Client> getAllClient(){
		return clientService.getAllClients();
	}
	
	@GetMapping("/{idClient}")
	public Client getClientById(@PathVariable Long idClient) {
		return clientService.getClientById(idClient);
	}
	
	@PostMapping
	public Client addClient(@RequestBody Client client) {
		return clientService.saveOrUpdateClient(client);
	}
	
	@DeleteMapping("/{idClient}")
	public boolean deleteClientById(@PathVariable Long idClient) {
		clientService.deleteClient(idClient);
		return true;
	}
	
	@PutMapping("/{idClient}")
	public boolean updateClient(@RequestBody Client client, @PathVariable Long idClient) {
		client.setIdClient(idClient);
		clientService.saveOrUpdateClient(client);
		return true;
		
	}
	
	@PostMapping("/login")
	public Client findByLoginAndMdp(@RequestBody Client client) {
		
		Client c = clientService.findByLoginAndPassword(client.getLogin(), client.getPassword());
		
		if (c.getIdClient() !=0) {
			return c;
		}else {
			return null;
		}
		
	}
 
}
