package com.inti.service.interfaces;

import java.util.List;

public interface IUtilisateurService {
	List<IUtilisateurService> findAll();
	IUtilisateurService findOne(Long id);
	IUtilisateurService save(IUtilisateurService user);
	void delete(Long id);
}
