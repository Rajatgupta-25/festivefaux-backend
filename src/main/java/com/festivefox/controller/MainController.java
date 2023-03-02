package com.festivefox.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.festivefox.entities.User;
import com.festivefox.services.UserService;
import com.festivefox.temporary.UserLogin;

@RestController
@CrossOrigin(origins = "*")
public class MainController {

	@Autowired
	private UserService userService;
	
	@PostMapping("/register")
	public String registerUser(@RequestBody User user) {
		return userService.userRegistration(user);
	}
	
	@PostMapping("/login")
	public User userLogin(@RequestBody UserLogin userLogin) {
		return userService.userLogin(userLogin.getUserEmail(), userLogin.getUserPassword());
	}
	
}
