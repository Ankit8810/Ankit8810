package com.contact.service1;

import org.springframework.stereotype.Service;

import com.contact.model.Contracts;

@Service
public interface ContractService {

	public Contracts search(Long id);
	public Contracts addContact(Contracts st);

}
