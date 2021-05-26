package com.mytion.vaccination.service;

import java.util.List;

import com.mytion.vaccination.dao.UserRepository;
import com.mytion.vaccination.model.entity.User;

public interface UserService {

	User register(User user);
	
	List<User> getAll();
}
