package com.bw.galaxytm.service;

import java.util.List;
import java.util.Optional;

import com.bw.galaxytm.entity.User;

public interface UserService {
	User saveUser(User user);
	
	User updateUser(User user);
	
	List<User>getAllUserList();
	
	Optional<User> getUser(Long userId);
	
	void deleteUser(Long userId);
	
}
