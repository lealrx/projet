package com.inti.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.repositories.RoleRepository;
import com.inti.service.interfaces.IRoleService;

@Service
public class RoleService implements IRoleService {

	@Autowired
	RoleRepository roleRepository;

	@Override
	public List<IRoleService> findAll() {
		return null;
	}

	@Override
	public IRoleService findOne(Long id) {
		return null;
	}

	@Override
	public IRoleService save(IRoleService role) {
		return null;
	}

	@Override
	public void delete(Long id) {

	}

}
