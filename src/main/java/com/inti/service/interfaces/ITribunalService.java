package com.inti.service.interfaces;

import java.util.List;

public interface ITribunalService {
	List<ITribunalService> findAll();
	ITribunalService findOne(Long id);
	ITribunalService save(ITribunalService tribunal);
	void delete(Long id);
}
