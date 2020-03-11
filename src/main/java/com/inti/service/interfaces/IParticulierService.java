package com.inti.service.interfaces;

import java.util.List;

public interface IParticulierService {
	List<IParticulierService> findAll();
	IParticulierService findOne(Long id);
	IParticulierService save(IParticulierService particulier);
	void delete(Long id);
}
