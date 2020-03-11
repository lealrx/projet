package com.inti.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Client implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idClient;
	private String adresseClient;
	private Long telClient;
	@ManyToOne(fetch = FetchType.EAGER)
	private Utilisateur userClient;

	public Client() {
	}

	public Client(String adresseClient, Long telClient) {
		this.adresseClient = adresseClient;
		this.telClient = telClient;
	}

	public Long getIdClient() {
		return idClient;
	}

	public void setIdClient(Long idClient) {
		this.idClient = idClient;
	}

	public String getAdresseClient() {
		return adresseClient;
	}

	public void setAdresseClient(String adresseClient) {
		this.adresseClient = adresseClient;
	}

	public Long getTelClient() {
		return telClient;
	}

	public void setTelClient(Long telClient) {
		this.telClient = telClient;
	}

	public Utilisateur getUserClient() {
		return userClient;
	}

	public void setUserClient(Utilisateur userClient) {
		this.userClient = userClient;
	}

	@Override
	public String toString() {
		return "Client [adresseClient=" + adresseClient + ", telClient=" + telClient + "]";
	}

}
