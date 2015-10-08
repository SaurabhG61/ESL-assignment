package com.auditis.service;

import java.util.List;

import com.auditis.model.User;

public interface UserService {
	public List<User> getAllUsers();

	public User getUser(String username);
}
