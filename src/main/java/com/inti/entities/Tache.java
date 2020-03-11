package com.inti.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class Tache implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idTache;
	@Temporal(TemporalType.DATE)
	private Date dateCreationTache;
	private String Titre;
	private String description;
	private boolean statutAudience;
	@ManyToOne(fetch = FetchType.EAGER)
	private Utilisateur userClient;
	@ManyToOne(fetch = FetchType.EAGER)
	private Affaire affaireTache;
	@ManyToOne(fetch = FetchType.EAGER)
	private Tribunal tribunalTache;
	@OneToMany(mappedBy = "tachePhase")
	private Set<Phase> phases = new HashSet<>();

	public Tache() {
	}

	public Tache(Date dateCreationTache, String titre, String description, boolean statutAudience) {
		this.dateCreationTache = dateCreationTache;
		Titre = titre;
		this.description = description;
		this.statutAudience = statutAudience;

	}

	public Long getIdTache() {
		return idTache;
	}

	public void setIdTache(Long idTache) {
		this.idTache = idTache;
	}

	public Date getDateCreationTache() {
		return dateCreationTache;
	}

	public void setDateCreationTache(Date dateCreationTache) {
		this.dateCreationTache = dateCreationTache;
	}

	public String getTitre() {
		return Titre;
	}

	public void setTitre(String titre) {
		Titre = titre;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isStatutAudience() {
		return statutAudience;
	}

	public void setStatutAudience(boolean statutAudience) {
		this.statutAudience = statutAudience;
	}

	public Utilisateur getUserClient() {
		return userClient;
	}

	public void setUserClient(Utilisateur userClient) {
		this.userClient = userClient;
	}

	public Affaire getAffaireTache() {
		return affaireTache;
	}

	public void setAffaireTache(Affaire affaireTache) {
		this.affaireTache = affaireTache;
	}

	public Tribunal getTribunalTache() {
		return tribunalTache;
	}

	public void setTribunalTache(Tribunal tribunalTache) {
		this.tribunalTache = tribunalTache;
	}

	public Set<Phase> getPhases() {
		return phases;
	}

	public void setPhases(Set<Phase> phases) {
		this.phases = phases;
	}

	@Override
	public String toString() {
		return "Tache [dateCreationTache=" + dateCreationTache + ", Titre=" + Titre + ", description=" + description
				+ ", statutAudience=" + statutAudience + "]";
	}

}
