package com.inti.service.interfaces;

import java.util.List;

public interface ITacheService {
	List<ITacheService> findAll();
	ITacheService findOne(Long id);
	ITacheService save(ITacheService tache);
	void delete(Long id);
}
