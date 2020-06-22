package com.gestion.compte.entity;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("CE")
public class CompteEpargne extends Compte {

	private double taux;

	public double getTaux() {
		return taux;
	}

	public void setTaux(double taux) {
		this.taux = taux;
	}

	public CompteEpargne() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CompteEpargne(String codeCompte,String libeleCompte, Date dateCreation, int soldeCompte,
			double taux) {
		super(codeCompte,libeleCompte,dateCreation,soldeCompte);
		this.taux = taux;
	}
}
