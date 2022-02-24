package com.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.user.model.User;
import com.user.service.imp.UserServiceImp;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserServiceImp service;
	
	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("/{userid}")
	public String getUser(@PathVariable("userid") Long userid) {
		User user=service.search(userid);
		//String url="http://USER-CONTRACT/contract/13";
	   // restTemplate.getForEntity(url, Long.class);
	    //.getForObject(url,Object.class);
    	
		//user.setContracts(obj);
		return "user_id:"+user.getUser_id() +",user_name:"+ user.getUser_name() +",phone:" +user.getPhone();	
	}
	@PostMapping("/insert")
	public String addUser(@RequestBody User user) {

		service.addUser(user);
		return "inserted";
				
	}
}
