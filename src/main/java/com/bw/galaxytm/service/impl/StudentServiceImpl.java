package com.bw.galaxytm.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bw.galaxytm.dao.StudentDao;
import com.bw.galaxytm.entity.Student;
import com.bw.galaxytm.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDao studentDao;
	
	@Override
	public Student saveStudent(Student student) {
		// TODO Auto-generated method stub
		return studentDao.save(student);
	}

	@Override
	public Student updateStudent(Student student) {
		// TODO Auto-generated method stub
		return studentDao.saveAndFlush(student);
	}

	@Override
	public List<Student> getAllStudentList() {
		// TODO Auto-generated method stub
		return studentDao.findAll();
	}

	@Override
	public Optional<Student> getStudent(Long studentId) {
		// TODO Auto-generated method stub
		return studentDao.findById(studentId);
	}

	@Override
	public void deleteStudent(Long StudentId) {
		// TODO Auto-generated method stub
		studentDao.deleteById(StudentId);
	}

}
