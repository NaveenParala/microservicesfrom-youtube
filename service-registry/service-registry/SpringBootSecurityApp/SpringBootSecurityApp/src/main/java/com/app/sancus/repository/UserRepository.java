package com.app.sancus.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.sancus.moddel.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	Optional<User> findByUsername(String username);

}
