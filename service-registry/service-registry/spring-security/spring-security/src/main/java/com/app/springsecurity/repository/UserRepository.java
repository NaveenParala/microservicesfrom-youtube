package com.app.springsecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.springsecurity.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{

	User findByUserName(String username);

}
