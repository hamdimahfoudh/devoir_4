package com.hamdi.clients.service;

import java.util.List;

import com.hamdi.clients.entities.Client;
import com.hamdi.clients.entities.Command;

public interface ClientService {
	Client saveClient(Client c);
	Client updateClient(Client c);
	void deleteClient(Client c);
	void deleteClientById(Long id);
	Client getClient(Long id);
	List<Client> getAllClients();
	List<Client> findByNomClient(String nom);
	List<Client> findByNomClientContains(String nom);
	List<Client> findByNomPrenom (String nom, String prenom);
	List<Client> findByCommand (Command command);
	List<Client> findByCommandIdCom(Long id);
	List<Client> findByOrderByNomClientAsc();
	List<Client> trierClientsNomsPrenoms();
}
