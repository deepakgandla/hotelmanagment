package com.app.service;

import com.app.model.User;

public interface AuthService {
	User isValid(String email, String password);
}
