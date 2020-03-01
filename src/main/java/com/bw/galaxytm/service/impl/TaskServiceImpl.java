package com.bw.galaxytm.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bw.galaxytm.dao.TaskDao;
import com.bw.galaxytm.entity.Task;
import com.bw.galaxytm.service.TaskService;

@Service
public class TaskServiceImpl implements TaskService {

	@Autowired
	private TaskDao TaskDao;
	
	@Override
	public Task saveTask(Task task) {
		// TODO Auto-generated method stub
		return TaskDao.save(task);
	}

	@Override
	public Task updateTask(Task task) {
		// TODO Auto-generated method stub
		return TaskDao.saveAndFlush(task);
	}

	@Override
	public List<Task> getAllTaskList() {
		// TODO Auto-generated method stub
		return TaskDao.findAll();
	}

	@Override
	public Optional<Task> getTask(Long taskId) {
		// TODO Auto-generated method stub
		return TaskDao.findById(taskId);
	}

	@Override
	public void deleteTask(Long taskId) {
		// TODO Auto-generated method stub
		TaskDao.deleteById(taskId);
	}

}
