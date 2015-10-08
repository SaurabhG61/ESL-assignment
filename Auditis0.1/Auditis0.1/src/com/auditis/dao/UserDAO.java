package com.auditis.dao;

import java.util.List;

import com.auditis.model.User;

public interface UserDAO {
	public List<User> getAllUsers();

	public User getUser(String username);
}
