package com.inti.service.interfaces;

import java.util.List;

public interface IRoleService {
	List<IRoleService> findAll();
	IRoleService findOne(Long id);
	IRoleService save(IRoleService role);
	void delete(Long id);
}
