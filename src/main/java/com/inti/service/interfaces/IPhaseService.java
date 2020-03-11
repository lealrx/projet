package com.inti.service.interfaces;

import java.util.List;

public interface IPhaseService {
	List<IPhaseService> findAll();
	IPhaseService findOne(Long id);
	IPhaseService save(IPhaseService phase);
	void delete(Long id);
}
