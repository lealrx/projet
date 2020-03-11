package com.inti.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Document implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idDocument;
	@Temporal(TemporalType.DATE)
	private Date dateCreationDocument;
	private String descriptionDocument;
	private String nomDocument;
	@ManyToOne(fetch = FetchType.EAGER)
	private Affaire affaireDoc;
	
	public Document() {
	}

	public Document(Date dateCreationDocument, String descriptionDocument, String nomDocument) {
		this.dateCreationDocument = dateCreationDocument;
		this.descriptionDocument = descriptionDocument;
		this.nomDocument = nomDocument;
	}

	public Long getIdDocument() {
		return idDocument;
	}

	public void setIdDocument(Long idDocument) {
		this.idDocument = idDocument;
	}

	public Date getDateCreationDocument() {
		return dateCreationDocument;
	}

	public void setDateCreationDocument(Date dateCreationDocument) {
		this.dateCreationDocument = dateCreationDocument;
	}

	public String getDescriptionDocument() {
		return descriptionDocument;
	}

	public void setDescriptionDocument(String descriptionDocument) {
		this.descriptionDocument = descriptionDocument;
	}

	public String getNomDocument() {
		return nomDocument;
	}

	public void setNomDocument(String nomDocument) {
		this.nomDocument = nomDocument;
	}

	public Affaire getAffaireDoc() {
		return affaireDoc;
	}

	public void setAffaireDoc(Affaire affaireDoc) {
		this.affaireDoc = affaireDoc;
	}

	@Override
	public String toString() {
		return "Document [dateCreationDocument=" + dateCreationDocument + ", descriptionDocument=" + descriptionDocument
				+ ", nomDocument=" + nomDocument + "]";
	}
	
	
	
	
	
	
	

}
