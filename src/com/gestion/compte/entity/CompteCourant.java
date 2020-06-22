package com.gestion.compte.entity;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="compte_courant")
@DiscriminatorValue("CC")
public class CompteCourant  extends Compte{
	
	private double decouvert;
	
	public double getDecouvert() {
		return decouvert;
	}

	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}

	public CompteCourant() {
	
	}

	public CompteCourant(String codeCompte, String libeleCompte, Date dateCreation, int soldeCompte, double decouvert) {
		super(codeCompte,libeleCompte,dateCreation,soldeCompte);
		this.decouvert = decouvert;
	}
}
