package com.gestion.compte.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="agence")

public class Agence {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="codeagence")
	private int codeAgence;
	
	@Column(name="nomagence")
	private String nomAgence;
	
	@Column(name="adresseagence")
	private String adresseAgence;
	
	//no-arg constructeur
	public Agence() {
	
	}

	public Agence(String nomAgence, String adresseAgence) {
		this.nomAgence = nomAgence;
		this.adresseAgence = adresseAgence;
	}

	public int getCodeAgence() {
		return codeAgence;
	}

	public void setCodeAgence(int codeAgence) {
		this.codeAgence = codeAgence;
	}

	public String getNomAgence() {
		return nomAgence;
	}

	public void setNomAgence(String nomAgence) {
		this.nomAgence = nomAgence;
	}

	public String getAdresseAgence() {
		return adresseAgence;
	}

	public void setAdresseAgence(String adresseAgence) {
		this.adresseAgence = adresseAgence;
	}

	@Override
	public String toString() {
		return "Agence [codeAgence=" + codeAgence + ", nomAgence=" + nomAgence + ", adresseAgence=" + adresseAgence
				+ "]";
	}
}
