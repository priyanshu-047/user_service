package com.taj.user_service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taj.user_service.modal.User;
import com.taj.user_service.repo.UserRepo;

@Service
public class UserService {
	
	@Autowired
	private UserRepo userRepo;
	
	public User setUser(User user) {
		return userRepo.save(user);
	}
      
	public List<User> getUsers() {
		return userRepo.findAll();
	}
}
