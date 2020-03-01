package com.bw.galaxytm;

import org.springframework.beans.factory.annotation.Autowired;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.bw.galaxytm.entity.Task;
import com.bw.galaxytm.entity.User1;
import com.bw.galaxytm.service.impl.TaskServiceImpl;
import com.bw.galaxytm.service.impl.UserServiceImpl;

import jdk.internal.jline.internal.Log;

@SpringBootApplication
//@RestController
public class GalaxytmApplication implements CommandLineRunner {
	
//	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
//	@Autowired
//	private UserServiceImpl userServiceImpl;
//	private User1 user;
//	
//	@Autowired
//	private TaskServiceImpl taskServiceImpl;
//	private Task task;

	public static void main(String[] args) {
		SpringApplication.run(GalaxytmApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
//		user = new User1("james");
//		user = userServiceImpl.saveUser(user);
//		
//		
//		
//		task = new Task("ilyamin", "this is the end", true, user.getId());
//		taskServiceImpl.saveTask(task);
//			
	}
	
	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**").allowedOrigins("");
			}
		};
	}
	

	

}
