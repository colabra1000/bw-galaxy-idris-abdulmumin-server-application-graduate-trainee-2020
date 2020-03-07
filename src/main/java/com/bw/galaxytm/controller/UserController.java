package com.bw.galaxytm.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bw.galaxytm.entity.User;
import com.bw.galaxytm.service.UserService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("user")
@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	
	@GetMapping("/all")
	public List<User> getAlluser() {
		return userService.getAllUsers();
	}
	
	@GetMapping("/by/{userId}")
	public Optional<User> getuser(@PathVariable(name= "userId") Long userId) {
		return userService.getUser(userId);
	}

}
