package com.mytion.vaccination.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mytion.vaccination.dao.UserRepository;
import com.mytion.vaccination.model.entity.User;

import com.mytion.vaccination.model.response.user.UserResponse;
import com.mytion.vaccination.converter.user.UserResponseConverter;

@Service
public class UserServiceImpl implements UserService{
	
	private final UserRepository userRespository;
	private final UserResponseConverter userResponseConverter;

	@Autowired
	public UserServiceImpl(UserRepository userRepository,
						   UserResponseConverter userResponseConverter) {
		this.userRespository = userRepository;
		this.userResponseConverter = userResponseConverter;
	}
	
	@Override
	public UserResponse register(User user) {
		User userData = this.userRespository.save(user);
		UserResponse userResponse = userResponseConverter.apply(userData);
		return userResponse;
	}

	@Override
	public List<User> getAllUsers() {
		return this.userRespository.findAll();
	}

}
