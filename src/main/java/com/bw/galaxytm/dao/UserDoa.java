package com.bw.galaxytm.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bw.galaxytm.entity.User;


@Repository
public interface UserDoa extends JpaRepository<User, Long> {
	Optional<User> findByUsername(String username);
	
	Boolean existsByUsername(String username);
	
	Boolean existsByEmail(String email);
	
	
	
	
}
