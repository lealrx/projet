package com.inti.service.interfaces;

import java.util.List;

public interface IDocumentService {
	List<IDocumentService> findAll();
	IDocumentService findOne(Long id);
	IDocumentService save(IDocumentService document);
	void delete(Long id);
}
