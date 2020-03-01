package com.bw.galaxytm.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bw.galaxytm.dao.UserDao;
import com.bw.galaxytm.entity.User1;
import com.bw.galaxytm.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao UserDao;
	
	@Override
	public User1 saveUser(User1 user) {
		// TODO Auto-generated method stub
		return UserDao.save(user);
	}

	@Override
	public User1 updateUser(User1 user) {
		// TODO Auto-generated method stub
		return UserDao.saveAndFlush(user);
	}

	@Override
	public List<User1> getAllUserList() {
		// TODO Auto-generated method stub
		return UserDao.findAll();
	}

	@Override
	public Optional<User1> getUser(Long userId) {
		// TODO Auto-generated method stub
		return UserDao.findById(userId);
	}

	@Override
	public void deleteUser(Long userId) {
		// TODO Auto-generated method stub
		UserDao.deleteById(userId);
	}

}
