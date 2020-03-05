package com.bw.galaxytm.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Example;

import com.bw.galaxytm.entity.Task;

public interface TaskService {
	Task saveTask(Task task);
	
	Task updateTask(Task task);
	
	List<Task>getAllTaskList();
	
	Optional<Task> getTask(Long taskId);
	
	List<Task> findByOwner(Long userId);
	
	void deleteTask(Long taskId);
	
}
