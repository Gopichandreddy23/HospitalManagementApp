package com.vedait.hospitalmanagement.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.vedait.hospitalmanagement.model.UserModel;



@Service
public interface UserService {
	List<UserModel> getAllUsers();

	UserModel saveUser(UserModel u);

	UserModel updateUser(UserModel u);

	void deleteUser(int user_id);

	UserModel getUserById(int user_id);

}
