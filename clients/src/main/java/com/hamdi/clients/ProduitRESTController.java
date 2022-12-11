package com.hamdi.clients;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hamdi.clients.entities.Client;
import com.hamdi.clients.service.ClientService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class ProduitRESTController {
	
	@Autowired
	ClientService clientService;
	@RequestMapping(method = RequestMethod.GET)
	public List <Client> getAllClients() {
	return clientService.getAllClients();
	}
	
	
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public Client getClientById(@PathVariable("id") Long id) {
	return clientService.getClient(id);
	}
	
	
	@RequestMapping(method = RequestMethod.POST)
	public Client createProduit(@RequestBody Client cl) {
	return clientService.saveClient(cl);
	}

	
	@RequestMapping(method = RequestMethod.PUT)
	public Client updateProduit(@RequestBody Client cl) {
	return clientService.updateClient(cl);
	}
	
	
	@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	public void deleteProduit(@PathVariable("id") Long id)
	{
		clientService.deleteClientById(id);
	}
	
	@RequestMapping(value="/prodscat/{idCat}",method = RequestMethod.GET)
	public List<Client> getProduitsByCatId(@PathVariable("idC") Long idC) {
	return clientService.findByCommandIdCom(idC);

}
}
