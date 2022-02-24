package com.contact.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.contact.model.Contracts;
import com.contact.repo.ContractRepo;
import com.contact.service1.ContractService;

@Service
public class ContractServiceImp implements ContractService{

	@Autowired
	private ContractRepo repo;

	@Override
	public Contracts search(Long id) {
        
		return repo.getById(id);
	}

	@Override
	public Contracts addContact(Contracts st) {
		return repo.save(st);
	}
}
