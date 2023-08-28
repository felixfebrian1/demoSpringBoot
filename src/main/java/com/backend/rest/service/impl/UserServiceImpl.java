package com.backend.rest.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.rest.models.User;
import com.backend.rest.repository.UserRepository;
import com.backend.rest.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public User addUser(User user) {
		return userRepository.save(user);
	}
	
	@Override
	public String deleteUser(int id) {
		String msg = "";
		if(userRepository.existsById(id)) {
			msg = "delete Success";
			userRepository.deleteById(id);
			return msg +" "+ id;
		}else {
			msg = "not founds";
			return msg+" "+id;
		}
	}
	
	@Override
	public List<User> getAllUser(){
		return userRepository.findAll();
	}

	@Override
	public User updateUser(User user) {
		return userRepository.save(user);
	}

}
