package com.gestion.compte.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="operation")
public class Operation {
 
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="numoperation")
	private int numOperation;
	
	
	@Column(name="libeleoperation")
	private String libeleOperation;
	
	@Column(name="sensoperation")
	private String sensOperation;
	
	@Column(name="montantoperation")
	private int montantOperation;
	
	@Column(name="dateoperation")
	private Date dateOperation;
	
	@ManyToOne
	@JoinTable(name="codecompte")
	private Compte compte;
	public Operation(int montantOperation, Date dateOperation) {
		super();
		this.montantOperation = montantOperation;
		this.dateOperation = dateOperation;
	}

	public int getNumOperation() {
		return numOperation;
	}

	public void setNumOperation(int numOperation) {
		this.numOperation = numOperation;
	}

	public String getLibeleOperation() {
		return libeleOperation;
	}

	public void setLibeleOperation(String libeleOperation) {
		this.libeleOperation = libeleOperation;
	}

	public String getSensOperation() {
		return sensOperation;
	}

	public void setSensOperation(String sensOperation) {
		this.sensOperation = sensOperation;
	}

	public int getMontantOperation() {
		return montantOperation;
	}

	public void setMontantOperation(int montantOperation) {
		this.montantOperation = montantOperation;
	}

	public Date getDateOperation() {
		return dateOperation;
	}

	public void setDateOperation(Date dateOperation) {
		this.dateOperation = dateOperation;
	}

	public Compte getCompte() {
		return compte;
	}

	public void setCompte(Compte compte) {
		this.compte = compte;
	}
	@Override
	public String toString() {
		return this.getClass().getSimpleName();
	}
}
