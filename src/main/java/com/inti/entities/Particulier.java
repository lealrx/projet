package com.inti.entities;

import java.io.Serializable;

import javax.persistence.Entity;

@Entity
public class Particulier extends Client implements Serializable {

	private static final long serialVersionUID = 1L;
	private String nomPart;
	private String prenomPart;
	private Long cin;

	public Particulier() {
		super();
	}

	public Particulier(String nomPart, String prenomPart, Long cin) {
		super();
		this.nomPart = nomPart;
		this.prenomPart = prenomPart;
		this.cin = cin;
	}


	public String getNomPart() {
		return nomPart;
	}

	public void setNomPart(String nomPart) {
		this.nomPart = nomPart;
	}

	public String getPrenomPart() {
		return prenomPart;
	}

	public void setPrenomPart(String prenomPart) {
		this.prenomPart = prenomPart;
	}

	public Long getCin() {
		return cin;
	}

	public void setCin(Long cin) {
		this.cin = cin;
	}

	@Override
	public String toString() {
		return "Particulier [nomPart=" + nomPart + ", prenomPart=" + prenomPart + ", cin=" + cin + "]";
	}

	

}
