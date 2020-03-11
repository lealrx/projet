package com.inti.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.repositories.ProfessionnelRepository;
import com.inti.service.interfaces.IProfessionnelService;

@Service
public class ProfessionnelService implements IProfessionnelService {

	@Autowired
	ProfessionnelRepository professionnelRepository;

	@Override
	public List<IProfessionnelService> findAll() {
		return null;
	}

	@Override
	public IProfessionnelService findOne(Long id) {
		return null;
	}

	@Override
	public IProfessionnelService save(IProfessionnelService professionnel) {
		return null;
	}

	@Override
	public void delete(Long id) {

	}

}
