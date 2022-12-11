package com.hamdi.clients.entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Client {	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long idClient;
	private String nomClient;
	private String prenomClient;
	private Long numtelClient;
	private String adresseClient;

	
	@ManyToOne
	private Command command;
	
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Client(String nomClient, String prenomClient, Long numtelClient, String adresseClient) {
		super();
		this.nomClient = nomClient;
		this.prenomClient = prenomClient;
		this.numtelClient = numtelClient;
		this.adresseClient = adresseClient;
	}



	public Long getIdClient() {
		return idClient;
	}

	public void setIdClient(Long idClient) {
		this.idClient = idClient;
	}

	public String getNomClient() {
		return nomClient;
	}

	public void setNomClient(String nomClient) {
		this.nomClient = nomClient;
	}

	public String getPrenomClient() {
		return prenomClient;
	}

	public void setPrenomClient(String prenomClient) {
		this.prenomClient = prenomClient;
	}


	public Long getNumtelClient() {
		return numtelClient;
	}


	public void setNumtelClient(Long numtelClient) {
		this.numtelClient = numtelClient;
	}


	public String getAdresseClient() {
		return adresseClient;
	}


	public void setAdresseClient(String adresseClient) {
		this.adresseClient = adresseClient;
	}



	@Override
	public String toString() {
		return "Client [idClient=" + idClient + ", nomClient=" + nomClient + ", prenomClient=" + prenomClient
				+ ", dateNaiss=" + numtelClient + ", adresseClient=" + adresseClient + "]";
	}
	
}

	