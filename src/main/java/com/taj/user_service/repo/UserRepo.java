package com.taj.user_service.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.taj.user_service.modal.User;

public interface UserRepo extends JpaRepository<User, Long> {
	
	public User FindByemail(String email);
}
