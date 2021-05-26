package com.mytion.vaccination.api;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mytion.vaccination.model.entity.User;
import com.mytion.vaccination.service.UserService;

@RestController
public class UserController extends ApiController{
	
	private final UserService userService;
	
	public UserController(UserService userService) {
		this.userService = userService;
	}
	
	@PostMapping(value = "/users")
	public ResponseEntity<User> registerUser(@RequestBody User user){
		User userResponse = userService.register(user);
		return new ResponseEntity<>(userResponse,HttpStatus.CREATED);
	}
	@GetMapping(value = "/users")
	public ResponseEntity<List<User>> getAll(){
		List<User> userResponse = userService.getAll();
		return new ResponseEntity<>(userResponse,HttpStatus.OK);
	}
}
