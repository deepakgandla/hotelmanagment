package com.app.dao.impl;

import java.io.Serializable;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.app.dao.UserDao;
import com.app.model.User;


@Component
public class UserDaoImpl implements UserDao {
	@Autowired
	HibernateTemplate hibernateTemplate;
	
	public List<User> loginUser(String email, String password) {
		String queryString = "select user.id, user.name, user.email, user.password from user where email=? and password=?";
		Object[] values = {email, password}; 
		List<User> users = hibernateTemplate.loadAll(User.class);
		return users;
	}
	
	@Transactional
	public int addUser(User user) {
		Integer result = (Integer) hibernateTemplate.save(user);
		return result;
	}

}
