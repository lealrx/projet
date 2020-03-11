package com.inti.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.repositories.TribunalRepository;
import com.inti.service.interfaces.ITribunalService;

@Service
public class TribunalService implements ITribunalService {

	@Autowired
	TribunalRepository tribunalRepository;

	@Override
	public List<ITribunalService> findAll() {
		return null;
	}

	@Override
	public ITribunalService findOne(Long id) {
		return null;
	}

	@Override
	public ITribunalService save(ITribunalService tribunal) {
		return null;
	}

	@Override
	public void delete(Long id) {

	}

}
