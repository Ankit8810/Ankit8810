package com.contact.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.contact.model.Contracts;

@Repository
public interface ContractRepo extends JpaRepository<Contracts, Long>{

	
}
