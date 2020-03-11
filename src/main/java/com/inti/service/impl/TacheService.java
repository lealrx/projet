package com.inti.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.repositories.TacheRepository;
import com.inti.service.interfaces.ITacheService;

@Service
public class TacheService implements ITacheService {

	@Autowired
	TacheRepository tacheRepository;

	@Override
	public List<ITacheService> findAll() {
		return null;
	}

	@Override
	public ITacheService findOne(Long id) {
		return null;
	}

	@Override
	public ITacheService save(ITacheService tache) {
		return null;
	}

	@Override
	public void delete(Long id) {

	}

}
