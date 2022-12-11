package com.hamdi.clients.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hamdi.clients.entities.Client;
import com.hamdi.clients.entities.Command;
//import com.hamdi.clients.entities.Command;
import com.hamdi.clients.repos.ClientRepository;


@Service
public class ClientServiceImpl implements ClientService{

	@Autowired
	ClientRepository clientRepository;
	
	@Override
	public Client saveClient(Client p) {
		return clientRepository.save(p);
	}

	@Override
	public Client updateClient(Client p) {
		return clientRepository.save(p);
	}

	@Override
	public void deleteClient(Client p) {
		clientRepository.delete(p);
		
	}

	@Override
	public void deleteClientById(Long id) {
		clientRepository.deleteById(id);
		
	}

	@Override
	public Client getClient(Long id) {
		return clientRepository.findById(id).get();
	}

	@Override
	public List<Client> getAllClients() {
		
		return clientRepository.findAll();
	}
/*
	@Override
	public List<Client> findByNomProduit(String nom) {
		
		return produitRepository.findByNomProduit(nom);
	}

	@Override
	public List<Client> findByNomProduitContains(String nom) {
		
		return produitRepository.findByNomProduitContains(nom);
	}

	@Override
	public List<Client> findByNomPrix(String nom, Double prix) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Client> findByCategorie(Command categorie) {
		
		return produitRepository.findByCategorie(categorie);
	}

	@Override
	public List<Client> findByCategorieIdCat(Long id) {
	
		return produitRepository.findByCategorieIdCat(id);
	}

	@Override
	public List<Client> findByOrderByNomProduitAsc() {
		
		return produitRepository.findByOrderByNomProduitAsc();
	}

	@Override
	public List<Client> trierProduitsNomsPrix() {
	
		return produitRepository.trierProduitsNomsPrix();
	}
	
	
*/

	@Override
	public List<Client> findByNomClient(String nom) {
		return clientRepository.findByNomClient(nom);
	}

	@Override
	public List<Client> findByNomClientContains(String nom) {
		return clientRepository.findByNomClientContains(nom);
	}

	@Override
	public List<Client> findByNomPrenom(String nom, String prenom) {
		return clientRepository.findByNomPrenom(nom,prenom);
	}

	@Override
	public List<Client> findByCommand(Command command) {
		return clientRepository.findByCommand(command);

	}

	@Override
	public List<Client> findByCommandIdCom(Long id) {
		return clientRepository.findByCommandIdCom(id);
	}

	@Override
	public List<Client> findByOrderByNomClientAsc() {
		return clientRepository.findByOrderByNomClientAsc();

	}

	@Override
	public List<Client> trierClientsNomsPrenoms() {
		return clientRepository.trierClientsNomsPrenoms();
	}
}
