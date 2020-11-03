package com.ecommerce.microcommerce.service;

import java.util.List;

import com.ecommerce.microcommerce.model.Client;

public interface IClientService {

	public Client saveOrUpdateClient(Client Client);

	public boolean deleteClient(Long idClient);

	public List<Client> getAllClients();

	public Client getClientById(Long idClient);

	public List<Client> findByLogin(String login);

	public boolean existsClientByLogin(String login);

	public Client findByLoginAndPassword(String login, String password);

}
