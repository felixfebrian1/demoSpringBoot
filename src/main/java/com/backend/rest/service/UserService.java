package com.backend.rest.service;

import java.util.List;

import com.backend.rest.models.User;

public interface UserService {
	
	public User addUser(User user);
	public List<User> getAllUser();
	public String deleteUser(int id);
	public User updateUser(User user);
}
