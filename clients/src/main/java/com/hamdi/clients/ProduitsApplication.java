package com.hamdi.clients;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
//import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;

import com.hamdi.clients.entities.Client;

@Controller
@SpringBootApplication
@EnableAutoConfiguration
//@ComponentScan(basePackages={"/produits12/src/main/java/com/nadhem/produits/restcontrollers/ProduitRESTController.java"})
public class ProduitsApplication implements CommandLineRunner {
	
	@Autowired
	private RepositoryRestConfiguration repositoryRestConfiguration;


	public static void main(String[] args) {
		SpringApplication.run(ProduitsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		repositoryRestConfiguration.exposeIdsFor(Client.class);
	}
}
