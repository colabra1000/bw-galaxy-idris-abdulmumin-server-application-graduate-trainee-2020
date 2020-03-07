package com.bw.galaxytm.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bw.galaxytm.dao.UserRepository;
import com.bw.galaxytm.entity.User;
import com.bw.galaxytm.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Override
	public User saveUser(User user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}

	@Autowired
	private UserRepository userRepository;

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	@Override
	public Optional<User> getUser(Long userId) {
		// TODO Auto-generated method stub
		return userRepository.findById(userId);
	}
	
	
}
