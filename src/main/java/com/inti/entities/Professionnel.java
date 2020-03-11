package com.inti.entities;

import java.io.Serializable;

import javax.persistence.Entity;

@Entity
public class Professionnel extends Client implements Serializable {

	private static final long serialVersionUID = 1L;

	private String nomEntreprise;

	public Professionnel() {
		super();
	}

	public Professionnel(String nomEntreprise) {
		super();
		this.nomEntreprise = nomEntreprise;
	}

	public String getNomEntreprise() {
		return nomEntreprise;
	}

	public void setNomEntreprise(String nomEntreprise) {
		this.nomEntreprise = nomEntreprise;
	}

	@Override
	public String toString() {
		return "Professionnel [nomEntreprise=" + nomEntreprise + "]";
	}

}
