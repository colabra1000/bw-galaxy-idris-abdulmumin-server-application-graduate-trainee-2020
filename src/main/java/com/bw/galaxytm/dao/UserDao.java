package com.bw.galaxytm.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bw.galaxytm.entity.User1;

@Repository
public interface UserDao extends JpaRepository<User1, Long> {

}
