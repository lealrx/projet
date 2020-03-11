package com.inti.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.repositories.DocumentRepository;
import com.inti.service.interfaces.IDocumentService;

@Service
public class DocumentService implements IDocumentService {

	@Autowired
	DocumentRepository documentRepository;

	@Override
	public List<IDocumentService> findAll() {
		return null;
	}

	@Override
	public IDocumentService findOne(Long id) {
		return null;
	}

	@Override
	public IDocumentService save(IDocumentService document) {
		return null;
	}

	@Override
	public void delete(Long id) {

	}

}
