package com.hamdi.clients.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
//import lombok.NoArgsConstructor;

@Data
//@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Command {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long idCom;
	private String nomCom;
	private String descriptionCom;
	
	@JsonIgnore
	@OneToMany(mappedBy = "command")
	private List<Client> clients;


	public Command() {
	}


	public Command(String nomCom, String descriptionCom, List<Client> clients) {
		super();
		this.nomCom = nomCom;
		this.descriptionCom = descriptionCom;
		this.clients = clients;
	}


	public Long getIdCom() {
		return idCom;
	}


	public void setIdCom(Long idCom) {
		this.idCom = idCom;
	}


	public String getNomCom() {
		return nomCom;
	}


	public void setNomCom(String nomCom) {
		this.nomCom = nomCom;
	}


	public String getDescriptionCom() {
		return descriptionCom;
	}


	public void setDescriptionCom(String descriptionCom) {
		this.descriptionCom = descriptionCom;
	}


	public List<Client> getClients() {
		return clients;
	}


	public void setClients(List<Client> clients) {
		this.clients = clients;
	}
	
	
}
