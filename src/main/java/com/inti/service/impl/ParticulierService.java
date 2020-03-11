package com.inti.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.repositories.ParticulierRepository;
import com.inti.service.interfaces.IParticulierService;

@Service
public class ParticulierService implements IParticulierService {

	@Autowired
	ParticulierRepository particulierRepository;

	@Override
	public List<IParticulierService> findAll() {
		return null;
	}

	@Override
	public IParticulierService findOne(Long id) {
		return null;
	}

	@Override
	public IParticulierService save(IParticulierService particulier) {
		return null;
	}

	@Override
	public void delete(Long id) {

	}

}
