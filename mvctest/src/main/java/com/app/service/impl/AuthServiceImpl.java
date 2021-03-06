package com.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.app.dao.UserDao;
import com.app.model.User;
import com.app.service.AuthService;

@Component
public class AuthServiceImpl implements AuthService {
	@Autowired
	UserDao userDao;
	public User isValid(String email, String password) {
		User user = null;
		List<User> users = userDao.loginUser(email, password);
		System.out.println(users);
		for(User u: users) {
			if(u.getEmail().equals(email) && u.getPassword().equals(password)) {
				user = u;
			}
		}
		return user;
	}
	
}
