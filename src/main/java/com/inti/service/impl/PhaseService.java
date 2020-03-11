package com.inti.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.repositories.PhaseRepository;
import com.inti.service.interfaces.IPhaseService;

@Service
public class PhaseService implements IPhaseService {

	@Autowired
	PhaseRepository phaseRepository;

	@Override
	public List<IPhaseService> findAll() {
		return null;
	}

	@Override
	public IPhaseService findOne(Long id) {
		return null;
	}

	@Override
	public IPhaseService save(IPhaseService phase) {
		return null;
	}

	@Override
	public void delete(Long id) {

	}

}
