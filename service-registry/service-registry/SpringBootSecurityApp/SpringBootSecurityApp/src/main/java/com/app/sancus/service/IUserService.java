package com.app.sancus.service;

import java.util.Optional;

import com.app.sancus.moddel.User;

public interface IUserService {

 Integer save(User user);
 Optional<User> findByUsername(String username);
}
