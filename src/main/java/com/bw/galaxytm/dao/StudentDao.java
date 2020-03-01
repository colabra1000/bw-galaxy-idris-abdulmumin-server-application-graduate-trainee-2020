package com.bw.galaxytm.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bw.galaxytm.entity.Student;

@Repository
public interface StudentDao extends JpaRepository<Student, Long> {

}
