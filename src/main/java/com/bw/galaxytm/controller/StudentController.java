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

import com.bw.galaxytm.entity.Student;
import com.bw.galaxytm.service.StudentService;

@RequestMapping("student")
@RestController
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@PostMapping("/save")
	public Student save(@RequestBody Student student) {
		return studentService.saveStudent(student);
	}
	
	@PutMapping("/update")
	public Student update(@RequestBody Student student) {
		return studentService.updateStudent(student);
	}
	
	@GetMapping("/all")
	public List<Student> getAllStudent() {
		return studentService.getAllStudentList();
	}
	
	@GetMapping("/by/{studentId}")
	public Optional<Student> getStudent(@PathVariable(name= "studentId") Long studentId) {
		return studentService.getStudent(studentId);
	}
	
	@DeleteMapping("/delete/{studentId}")
	public void deleteStudent(@PathVariable(name = "studentId") Long studentId) {
		studentService.deleteStudent(studentId);
	}

}
