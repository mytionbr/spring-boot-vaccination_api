package com.mytion.vaccination.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mytion.vaccination.dao.UserRepository;
import com.mytion.vaccination.model.entity.User;


@Service
public class UserServiceImpl implements UserService{
	
	private final UserRepository userRespository;
	
	@Autowired
	public UserServiceImpl(UserRepository userRepository) {
		this.userRespository = userRepository;
	}
	
	@Override
	public User register(User user) {
		return this.userRespository.save(user);
	}

	@Override
	public List<User> getAll() {
		return this.userRespository.findAll();
	}

}
