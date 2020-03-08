package com.bw.galaxytm.controller;

import org.mockito.Mockito;
import org.skyscreamer.jsonassert.JSONAssert;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;


import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.security.test.context.support.WithMockUser;
import static org.mockito.ArgumentMatchers.any;


import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.hamcrest.core.Is.is;

import com.bw.galaxytm.entity.Task;
import com.bw.galaxytm.security.services.UserDetailsServiceImpl;
import com.bw.galaxytm.service.TaskService;
import com.bw.galaxytm.service.impl.TaskServiceImpl;



@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
@AutoConfigureMockMvc
//@WebMvcTest(TaskController.class)
class TaskControllerTest {
	
	@Autowired
	private MockMvc mockMvc;
	
	@Autowired
	private UserDetailsServiceImpl i;
	
	@MockBean
	private TaskServiceImpl taskService;
	
	
	@Test
	@WithMockUser(roles= {"ADMIN"})
	void testSave() throws Exception {
		Task task = new Task("description", "short description", false, 1L);
		
		String taskJSON = "{\"name\":\"Task\",\"description\":\"desc\",\"short_description\":\"I am a task\",\"completed\":\"false\",\"owner\":\"1\"}";
		
		given(taskService.saveTask(task)).willReturn(task);
		
		
		RequestBuilder requestBuilder = MockMvcRequestBuilders.post("/task/save").accept(MediaType.APPLICATION_JSON)
				.content(taskJSON).contentType(MediaType.APPLICATION_JSON)
				.accept(MediaType.APPLICATION_JSON);
				
				
		MvcResult result = mockMvc.perform(requestBuilder).andExpect(status().isOk()).andReturn();
		
		System.out.println(result);

	
	}

	@Test
	@WithMockUser(roles= {"ADMIN"})
	void testGetAlltask() throws Exception {
		

		Task task = new Task("description", "short description", false, 1L);
		
		List<Task> allTasks = Arrays.asList(task);
		
		given(taskService.getAllTaskList()).willReturn(allTasks);
		
		mockMvc.perform(get("/task/all")
				.contentType(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(jsonPath("$", hasSize(1)))
			      .andExpect(jsonPath("$[0].description", is(task.getDescription())));

		
	}


}
