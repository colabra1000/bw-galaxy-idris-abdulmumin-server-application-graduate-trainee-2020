package com.bw.galaxytm.service;

import java.util.List;
import java.util.Optional;

import com.bw.galaxytm.entity.User;

public interface UserService {
	
	List<User>getAllUsers();
	
	Optional<User> getUser(Long userId);
	
	User saveUser(User user);
	
	
}
