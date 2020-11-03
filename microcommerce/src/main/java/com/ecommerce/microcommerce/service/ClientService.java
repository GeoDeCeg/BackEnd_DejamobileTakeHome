package com.ecommerce.microcommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.microcommerce.model.Client;
import com.ecommerce.microcommerce.repository.ICarteRepository;
import com.ecommerce.microcommerce.repository.IClientRepository;

@Service
public class ClientService implements IClientService{

	@Autowired
	IClientRepository clientRepository;
	
	@Autowired
	ICarteRepository carteRepository;
	
	@Override
	public Client saveOrUpdateClient(Client client) {
		
		return clientRepository.save(client);
	}

	@Override
	public boolean deleteClient(Long idClient) {
		clientRepository.deleteById(idClient);
		return true;
	}

	@Override
	public List<Client> getAllClients() {
		return clientRepository.findAll();
	}

	@Override
	public Client getClientById(Long idClient) {
		return clientRepository.findById(idClient).get();
	}
	

	@Override
	public List<Client> findByLogin(String login) {
		
		return clientRepository.findByLogin(login);
	}

	@Override
	public boolean existsClientByLogin(String login) {
		clientRepository.existsClientByLogin(login);
		return true;
	}

	@Override
	public Client findByLoginAndPassword(String login, String password) {
		
		return clientRepository.findByLoginAndPassword(login, password);
	}


}
