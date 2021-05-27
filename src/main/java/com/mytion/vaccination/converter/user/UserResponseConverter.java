package com.mytion.vaccination.converter.user;

import com.mytion.vaccination.model.entity.User;
import com.mytion.vaccination.model.response.user.UserResponse;

import java.util.function.Function;

import org.springframework.stereotype.Component;

@Component
public class UserResponseConverter implements Function<User,UserResponse>{
	@Override
	public UserResponse apply(User user){
		
		UserResponse userResponse = new UserResponse();
				
				userResponse.setName(user.getName());
				userResponse.setEmail(user.getEmail());
				userResponse.setCpf(user.getEmail());
				userResponse.setBirthDate(user.getBirthDate());
		
		return userResponse;
	}
}