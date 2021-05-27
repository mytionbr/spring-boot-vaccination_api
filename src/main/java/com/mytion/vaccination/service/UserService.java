package com.mytion.vaccination.service;

import java.util.List;

import com.mytion.vaccination.model.entity.User;
import com.mytion.vaccination.model.response.user.UserResponse;

public interface UserService {

	UserResponse register(User user);
	
	List<User> getAllUsers();
}
