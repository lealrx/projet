package com.inti.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.repositories.UtilisateurRepository;
import com.inti.service.interfaces.IUtilisateurService;

@Service
public class UtilisateurService implements IUtilisateurService {

	@Autowired
	UtilisateurRepository utilisateurRepository;

	@Override
	public List<IUtilisateurService> findAll() {
		return null;
	}

	@Override
	public IUtilisateurService findOne(Long id) {
		return null;
	}

	@Override
	public IUtilisateurService save(IUtilisateurService user) {
		return null;
	}

	@Override
	public void delete(Long id) {

	}

}
