package com.vedait.hospitalmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vedait.hospitalmanagement.model.DoctorModel;
import com.vedait.hospitalmanagement.model.UserModel;
import com.vedait.hospitalmanagement.service.UserService;

@RestController
public class UserController {
	@Autowired
	UserService userservice;
	
	
	@GetMapping("/user")
	public List<UserModel> getAllUser(){
		List<UserModel> user=userservice.getAllUsers();
		return user;
	}
	@GetMapping("/user/{user_id}")
	public UserModel getDoctorModel(@PathVariable("user_id") int  user_id) {
		UserModel user=userservice.getUserById(user_id);
		return user;
		
	}
	@PostMapping("/user")
	public UserModel saveUserModel(@RequestBody UserModel d) {
		UserModel save = userservice.saveUser(d);
		return save;
	}
	@PutMapping("/user")
	public UserModel upDateUserModel(@RequestBody UserModel d) {
		UserModel updateuser = userservice.updateUser(d);
		return updateuser;
	}
	@DeleteMapping("/user/{user_id}")
	public void deleteUser(@PathVariable("user_id")int user_id ) {
		userservice.deleteUser(user_id);
		
	}


}
