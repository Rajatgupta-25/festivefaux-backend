package com.festivefox.services;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.festivefox.dao.UserDao;
import com.festivefox.entities.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	public String userRegistration(User user) {
		String response = "";
		List<User> list = userDao.findAll();
		try {
			for(User u : list) {
				if(u.getEmail().equalsIgnoreCase(user.getEmail())) {
					return "already exist";
				}
			}
			String fname = user.getFirstName().substring(0, 1).toUpperCase() + user.getFirstName().substring(1);
			String lname = user.getLastName().substring(0, 1).toUpperCase() + user.getLastName().substring(1);
			user.setUserName(fname + " " + lname);
			user.setCreatedAt(new Timestamp(System.currentTimeMillis()));
			userDao.save(user);
			response = "saved";
		}catch(Exception e) {
			response = "error";
		}
		return response;
	}

	public User userLogin(String userEmail, String userPassword) {
		List<User> list = userDao.findAll();
		try {
			for(User u : list) {
				if((userEmail.equalsIgnoreCase(u.getEmail()) 
						|| userEmail.equals(u.getPhoneNumber())) 
						&& userPassword.equals(u.getPassword())) {
					return u;
				}
			}
		}catch(Exception e) {
			return null;
		}
		return null;
	}

}
