package com.user.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.model.User;
import com.user.repo.UserRepo;
import com.user.service1.UserService;

@Service
public class UserServiceImp implements UserService  {
	
	@Autowired
   private UserRepo repo;

	@Override
	public User search(Long id) {
		
		
			return repo.getById(id);
		
		
	}

	@Override
	public User addUser(User user) {
		
		return repo.save(user);
	}

}
