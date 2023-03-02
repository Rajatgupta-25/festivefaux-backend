package com.festivefox.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.festivefox.entities.User;

public interface UserDao extends JpaRepository<User, Integer> {

}
