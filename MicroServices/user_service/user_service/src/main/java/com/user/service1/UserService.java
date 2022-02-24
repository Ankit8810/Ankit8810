package com.user.service1;

import org.springframework.stereotype.Service;

import com.user.model.User;

@Service
public interface UserService {
	
	public User search(Long id);
    public User addUser(User user);
}
