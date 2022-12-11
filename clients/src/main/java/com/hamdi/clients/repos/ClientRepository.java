package com.hamdi.clients.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.hamdi.clients.entities.Client;
import com.hamdi.clients.entities.Command;

@RepositoryRestResource(path = "rest")
public interface ClientRepository extends JpaRepository<Client,Long> {
	
	List<Client> findByNomClient(String nom);
	List<Client> findByNomClientContains(String nom);
	
	/*@Query("select p from Client p where p.nomClient like %?1 and p.prenomClient like %?2")
	List<Client> findByNomPrenom(String nom, String prenom);*/
	
	@Query("select p from Client p where p.nomClient like %:nom and p.prenomClient like %:prenom")
	List<Client> findByNomPrenom (@Param("nom") String nom,@Param("prenom") String prenom);

	@Query("select p from Client p where p.command = ?1")
	List<Client> findByCommand (Command command);
	
	List<Client> findByCommandIdCom(Long id);
	
	List<Client> findByOrderByNomClientAsc();
	
	@Query("select p from Client p order by p.nomClient ASC, p.prenomClient ASC")
	List<Client> trierClientsNomsPrenoms ();
}
