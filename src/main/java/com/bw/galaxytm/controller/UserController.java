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

import com.bw.galaxytm.entity.User1;
import com.bw.galaxytm.service.User1Service;

@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("user")
@RestController
public class UserController {
	
	@Autowired
	private User1Service userService;
	
	@PostMapping("/save")
	public User1 save(@RequestBody User1 user) {
		return userService.saveUser(user);
	}
	
	@PutMapping("/update")
	public User1 update(@RequestBody User1 user) {
		return userService.updateUser(user);
	}
	
	@GetMapping("/all")
	public List<User1> getAlluser() {
		return userService.getAllUserList();
	}
	
	@CrossOrigin(origins = "http://localhost:8081")
	@GetMapping("/by/{userId}")
	public Optional<User1> getuser(@PathVariable(name= "userId") Long userId) {
		return userService.getUser(userId);
	}
	
	@DeleteMapping("/delete/{userId}")
	public void deleteuser(@PathVariable(name = "userId") Long userId) {
		userService.deleteUser(userId);
	}

}
