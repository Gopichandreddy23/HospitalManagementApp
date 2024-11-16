package com.vedait.hospitalmanagement.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.vedait.hospitalmanagement.entity.AdminEntity;
import com.vedait.hospitalmanagement.entity.DoctorEntity;
import com.vedait.hospitalmanagement.entity.UserEntity;
import com.vedait.hospitalmanagement.model.AdminModel;
import com.vedait.hospitalmanagement.model.UserModel;
import com.vedait.hospitalmanagement.repository.UserRepository;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserRepository userrespository;

	@Override
	public List<UserModel> getAllUsers() {
	    List<UserEntity> userentity = userrespository.findAll();
	    ObjectMapper mapper = new ObjectMapper();
	    List<UserModel> adminModels = userentity.stream()
	            .map(x -> convert(x))
	            .collect(Collectors.toList());
	    return adminModels;
	}
	// Conversion method
	public UserModel convert(UserEntity a) {
	    return new UserModel(a.getUser_id(),a.getUser_name(),a.getEmail(),a.getRole());
	}

	@Override
	public UserModel saveUser(UserModel u) {
		UserEntity save = userrespository.save(new UserEntity(u.getUser_id(),u.getUser_name(),u.getEmail(),u.getRole()));
		return convert(save);
	}

	@Override
	public UserModel updateUser(UserModel u) {
		UserEntity save = userrespository.save(new UserEntity(u.getUser_id(),u.getUser_name(),u.getEmail(),u.getRole()));
	
		return convert(save);
	}

	@Override
	public void deleteUser(int user_id) { 
		UserEntity userEntity = userrespository.findById(user_id) 
				.orElseThrow(() -> new RuntimeException("User not found with id: " + user_id)); 
		userrespository.delete(userEntity); }

	@Override
	public UserModel getUserById(int user_id) {
		UserEntity byId = userrespository.getById(user_id);
		return convert(byId);
	}

}
