package com.gestion.compte.entity;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="client")
public class Client {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="codeclient")
	private int codeClient;
	
	@Column(name="nomclient")
	private String nomClient;
	
	@Column(name="prenomclient")
	private String prenomClient;
	
	@Column(name="adresseclient")
	private String adresseClient;
	
	@ManyToOne
	@JoinColumn(name="codeagence")
	private Agence codeAgence;
	
	@OneToMany(mappedBy="compteID", fetch=FetchType.LAZY)
	private Collection<Compte> comptes;
	
public Client() {
		
	}
		
	
	@Override
	public String toString() {
		return "Client [codeClient=" + codeClient + ", nomClient=" + nomClient + ", prenomClient=" + prenomClient
				+ ", adresseClient=" + adresseClient + ", codeAgence=" + codeAgence + "]";
	}


	public int getCodeClient() {
		return codeClient;
	}


	public void setCodeClient(int codeClient) {
		this.codeClient = codeClient;
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


	public String getAdresseClient() {
		return adresseClient;
	}


	public void setAdresseClient(String adresseClient) {
		this.adresseClient = adresseClient;
	}


	public Agence getCodeAgence() {
		return codeAgence;
	}


	public void setCodeAgence(Agence codeAgence) {
		this.codeAgence = codeAgence;
	}
	public void setComptes(Collection<Compte> comptes) {
		this.comptes = comptes;
	}
	
	public Collection<Compte> getComptes() {
		return comptes;
	}

	public Client(String nomClient, String prenomClient, String adresseClient, Agence codeAgence) {
		super();
		this.nomClient = nomClient;
		this.prenomClient = prenomClient;
		this.adresseClient = adresseClient;
		this.codeAgence = codeAgence;
	}


	
	
}
