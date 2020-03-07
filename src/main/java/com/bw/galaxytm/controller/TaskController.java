package com.bw.galaxytm.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bw.galaxytm.dao.TaskDao;
import com.bw.galaxytm.entity.Task;
import com.bw.galaxytm.service.TaskService;
import com.bw.galaxytm.service.impl.TaskServiceImpl;

@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("task")
@RestController
public class TaskController {
	
	@Autowired
	private TaskDao taskDao;
	
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
	
	@GetMapping("/by/{taskId}")
	@PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
	public Optional<Task> getTask(@PathVariable(name= "taskId") Long taskId) {
		return taskService.getTask(taskId);
	}
	
	@DeleteMapping("/delete/{taskId}")
	public void deletetask(@PathVariable(name = "taskId") Long taskId) {
		taskService.deleteTask(taskId);
	}
	
	@GetMapping("/user/{userId}")
	public List<Task> getTasksByUser(@PathVariable(name = "userId") Long userId){
		
		return taskDao.findByOwner(userId);
	
	}

}
