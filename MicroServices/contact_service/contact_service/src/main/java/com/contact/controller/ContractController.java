package com.contact.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.contact.model.Contracts;
import com.contact.service.imp.ContractServiceImp;

@RestController
@RequestMapping("/contract")
public class ContractController {

	@Autowired
	private ContractServiceImp service;
	
	
	
	@GetMapping("/{userId}")
	public String getuser(@PathVariable("userId") Long userId) {
		Contracts con=service.search(userId);
		return "customerId:"+con.getCustomerId()+",contactName:"+con.getContactName()+",userId:"+con.getUserId()+",email:"+con.getEmail();
	}
	@PostMapping("/insert")
	public Contracts addUser(@RequestBody Contracts contract) {
		return service.addContact(contract);
	}
}
