package com.inti.service.interfaces;

import java.util.List;

public interface IProfessionnelService {
	List<IProfessionnelService> findAll();
	IProfessionnelService findOne(Long id);
	IProfessionnelService save(IProfessionnelService professionnel);
	void delete(Long id);
}
