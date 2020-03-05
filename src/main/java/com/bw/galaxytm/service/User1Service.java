package com.bw.galaxytm.service;

import java.util.List;
import java.util.Optional;

import com.bw.galaxytm.entity.User1;

public interface User1Service {
	User1 saveUser(User1 user);
	
	User1 updateUser(User1 user);
	
	List<User1>getAllUserList();
	
	Optional<User1> getUser(Long userId);
	
	void deleteUser(Long userId);
	
}
