package com.app.dao;

import java.util.List;

import com.app.model.User;

public interface UserDao {
	List<User> loginUser(String email, String password);
	int addUser(User user);
}
