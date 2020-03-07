package com.bw.galaxytm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.bw.galaxytm.entity.Task;
import com.bw.galaxytm.service.TaskService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("task")
@RestController
public class TaskController {
		
	@Autowired
	private TaskService taskService;
	
	@PostMapping("/save")
	@PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
	public Task save(@RequestBody Task task) {
		return taskService.saveTask(task);
	}
	
	@PutMapping("/update")
	@PreAuthorize("hasRole('USER')")
	public Task update(@RequestBody Task task) {
		return taskService.updateTask(task);
	}
	
	@PreAuthorize("hasRole('ADMIN')")
	@GetMapping("/all")
	public List<Task> getAlltask() {
		return taskService.getAllTaskList();
	}
		
	@GetMapping("/user/{userId}")
	@PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
	
	public List<Task> getTasksByUser(@PathVariable(name = "userId") Long userId){
		
		return taskService.findByOwner(userId);
	
	}

}
