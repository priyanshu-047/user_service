package com.taj.user_service.controller;

import org.springframework.web.bind.annotation.RestController;

import com.taj.user_service.modal.User;
import com.taj.user_service.security.UserService;

import ch.qos.logback.core.status.Status;
import jakarta.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/user-service")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/adduser")
	public ResponseEntity<User> postMethodName(@Valid @RequestBody User user 
			) {
		return new ResponseEntity<User>(userService.setUser(user), HttpStatusCode.valueOf(200)) ;
	}
	

}
