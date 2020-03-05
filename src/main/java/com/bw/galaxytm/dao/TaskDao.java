package com.bw.galaxytm.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bw.galaxytm.entity.Task;

@Repository
public interface TaskDao extends JpaRepository<Task, Long> {

	List<Task> findByOwner(Long userId);
}
