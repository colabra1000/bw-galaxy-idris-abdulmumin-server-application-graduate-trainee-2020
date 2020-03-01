package com.bw.galaxytm.service;

import java.util.List;
import java.util.Optional;

import com.bw.galaxytm.entity.Student;

public interface StudentService {
	Student saveStudent(Student student);
	
	Student updateStudent(Student student);
	
	List<Student>getAllStudentList();
	
	Optional<Student> getStudent(Long StudentId);
	
	void deleteStudent(Long StudentId);
	
}
