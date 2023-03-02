package com.festivefox.services;

import com.festivefox.entities.User;

public interface UserService {
	public String userRegistration(User user);
	
	public User userLogin(String email, String password);
	
}
