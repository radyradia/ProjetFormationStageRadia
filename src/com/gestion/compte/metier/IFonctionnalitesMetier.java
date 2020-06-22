package com.gestion.compte.metier;

import java.util.List;

import com.gestion.compte.entity.Client;
import com.gestion.compte.entity.Compte;
import com.gestion.compte.entity.Operation;

public interface IFonctionnalitesMetier {

	public Client addClient(Client client);
	public Compte addCompte(Compte compte, int codeClient);
	
	public void verser(double montant, String compte);
	public void retirer(double montant, String compte);
	public void virement(double montant, String compte1, String compte2);
	
	public Compte consulterCompte(String codeCompte);
	public List<Operation> consulterOperations(String codeCompte);
}
