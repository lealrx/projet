package com.inti.service.interfaces;

import java.util.List;

public interface IAffaireService {
	List<IAffaireService> findAll();
	IAffaireService findOne(Long id);
	IAffaireService save(IAffaireService affaire);
	void delete(Long id);
}
