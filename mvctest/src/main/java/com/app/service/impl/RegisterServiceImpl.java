package com.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.app.dao.UserDao;
import com.app.model.User;
import com.app.service.RegisterService;

@Component
public class RegisterServiceImpl implements RegisterService {
	@Autowired
	UserDao userDao;
	public int registerUser(User user) {
		int result = 0;
		if(user.getName()!=null && user.getEmail()!=null && user.getPassword()!=null) {
			result = this.userDao.addUser(user);
		}
		return result;
	}

}
