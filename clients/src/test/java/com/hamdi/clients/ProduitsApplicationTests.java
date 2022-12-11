package com.hamdi.clients;


//import java.util.List;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.hamdi.clients.entities.Client;
import com.hamdi.clients.entities.Command;
import com.hamdi.clients.repos.ClientRepository;


@SpringBootTest
class ProduitsApplicationTests {

	@Autowired
	private ClientRepository clientRepository;
	
	@Test
	public void testCreateClient() {
	Client prod = new Client("ahmed","mohsen",(long)23712734,"rue l ommem l motahida");
	clientRepository.save(prod);
	}
	
	@Test
	public void testFindClient()
	{
	Client c = clientRepository.findById(2L).get();
	System.out.println(c);
	}
	
	@Test
	public void testUpdateClient()
	{
	Client c = clientRepository.findById(1L).get();
	c.setPrenomClient("mokchekh");
	clientRepository.save(c);
	System.out.println(c);
	}
	
	@Test
	public void testDeleteClient()
	{
		clientRepository.deleteById(1L);
	}
	
	@Test
	public void testFindAllClient()
	{
		List<Client> client = clientRepository.findAll();
		
		for (Client c:client)
			 System.out.println(c);
		
	}
	
	
	@Test
	public void testFindClientByNom()
	{
	List<Client> client = clientRepository.findByNomClient("ah");
	
	for (Client c:client)
		 System.out.println(c);
	
	}
	
	@Test
	public void testFindClientByNomContains()
	{
	List<Client> client = clientRepository.findByNomClientContains("ah");
	
	for (Client c:client)
		 System.out.println(c);

	}
	
	
	@Test
	public void testfindByNomPrenom()
	{
	List<Client> client = clientRepository.findByNomPrenom("ahmed","tawi");
	for (Client c:client)
		 System.out.println(c);

	}
	
	
	@Test
	public void testfindByCommand()
	{
	Command com = new Command();
	com.setIdCom(1L);
	
	List<Client> client = clientRepository.findByCommand(com);
	for (Client c:client)
		 System.out.println(c);

	}
	
	
	@Test
	public void findByCommandIdCom()
	{
	List<Client> client = clientRepository.findByCommandIdCom(1L);
	for (Client c:client)
		 System.out.println(c);

	}
	
	
	
	@Test
	public void testfindByOrderByNomClientAsc()
	{
	List<Client> client =  clientRepository.findByOrderByNomClientAsc();
	for (Client c:client)
		 System.out.println(c);
	}
	
	
	@Test
	public void trierClientsNomsPrenoms()
	{
	List<Client> clt = clientRepository.trierClientsNomsPrenoms();
	for (Client c : clt)
	{
	System.out.println(c);
	}
	
}
}
