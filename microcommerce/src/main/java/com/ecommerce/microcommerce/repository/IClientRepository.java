package com.ecommerce.microcommerce.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.microcommerce.model.Client;

public interface IClientRepository extends JpaRepository<Client, Long> {

	public List<Client> findByLogin(String login);

	public boolean existsClientByLogin(String login);
	
	public Client findByLoginAndPassword(String login, String password);
}
