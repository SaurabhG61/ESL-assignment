package com.auditis.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.auditis.dao.UserDAO;
import com.auditis.model.User;
import com.auditis.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserDAO userDAO;
	
	@Override
	public List<User> getAllUsers() {
		return userDAO.getAllUsers();
	}

	@Override
	public User getUser(String username) {
		return userDAO.getUser(username);
	}

}
