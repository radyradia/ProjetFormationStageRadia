package com.gestion.compte.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="compte")
public class Compte {

	/*@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	*/
	@Id
	@Column(name="codecompte")
	private String codeCompte;
	
	@Column(name="dateCreation")
	private Date dateCreation;
	@Column(name="libelecompte")
	private String libeleCompte;
	
	
	@Column(name="soldecompte")
	private int soldeCompte;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="codeclient")
	private Client client;
	
	@OneToMany(mappedBy="numoperation")
	private List<Operation> operations;
	
	public List<Operation> getOperations() {
		return operations;
	}

	public void setOperations(List<Operation> operations) {
		this.operations = operations;
	}

	public Compte() {
		
	}

	public Compte(String codeCompte, String libeleCompte, Date dateCreation, int soldeCompte) {
		super();
		this.codeCompte = codeCompte;
		this.libeleCompte = libeleCompte;
		this.dateCreation = dateCreation;
		this.soldeCompte = soldeCompte;
		
	}

/*	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
*/
	public String getCodeCompte() {
		return codeCompte;
	}

	public void setCodeCompte(String codeCompte) {
		this.codeCompte = codeCompte;
	}

	public String getLibeleCompte() {
		return libeleCompte;
	}

	public void setLibeleCompte(String libeleCompte) {
		this.libeleCompte = libeleCompte;
	}

	

	public int getSoldeCompte() {
		return soldeCompte;
	}

	public void setSoldeCompte(int soldeCompte) {
		this.soldeCompte = soldeCompte;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	@Override
	public String toString() {
		return "Compte [codeCompte=" + codeCompte + ", libeleCompte=" + libeleCompte +" soldeCompte=" + soldeCompte + ", client=" + client + "]";
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	
}
