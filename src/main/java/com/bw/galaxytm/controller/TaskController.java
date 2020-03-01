package com.bw.galaxytm.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bw.galaxytm.entity.Task;
import com.bw.galaxytm.service.TaskService;

@RequestMapping("task")
@RestController
public class TaskController {
	
	@Autowired
	private TaskService taskService;
	
	@PostMapping("/save")
	public Task save(@RequestBody Task task) {
		return taskService.saveTask(task);
	}
	
	@PutMapping("/update")
	public Task update(@RequestBody Task task) {
		return taskService.updateTask(task);
	}
	
	@GetMapping("/all")
	public List<Task> getAlltask() {
		return taskService.getAllTaskList();
	}
	
	@GetMapping("/by/{taskId}")
	public Optional<Task> getTask(@PathVariable(name= "taskId") Long taskId) {
		return taskService.getTask(taskId);
	}
	
	@DeleteMapping("/delete/{taskId}")
	public void deletetask(@PathVariable(name = "taskId") Long taskId) {
		taskService.deleteTask(taskId);
	}

}
