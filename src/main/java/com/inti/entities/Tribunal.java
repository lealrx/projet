package com.inti.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Tribunal implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idTribunal;
	private String adresse;
	private Double fax;
	private Double telTribunal;
	private String region;
	@OneToMany(mappedBy = "tribunalTache")
	private Set<Tache> tachess = new HashSet<>();

	public Tribunal() {
	}

	public Tribunal(String adresse, Double fax, Double telTribunal, String region) {
		this.adresse = adresse;
		this.fax = fax;
		this.telTribunal = telTribunal;
		this.region = region;
	}

	public Long getIdTribunal() {
		return idTribunal;
	}

	public void setIdTribunal(Long idTribunal) {
		this.idTribunal = idTribunal;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public Double getFax() {
		return fax;
	}

	public void setFax(Double fax) {
		this.fax = fax;
	}

	public Double getTelTribunal() {
		return telTribunal;
	}

	public void setTelTribunal(Double telTribunal) {
		this.telTribunal = telTribunal;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public Set<Tache> getTachess() {
		return tachess;
	}

	public void setTachess(Set<Tache> tachess) {
		this.tachess = tachess;
	}

	@Override
	public String toString() {
		return "Tribunal [adresse=" + adresse + ", fax=" + fax + ", telTribunal=" + telTribunal + ", region=" + region
				+ "]";
	}

}
