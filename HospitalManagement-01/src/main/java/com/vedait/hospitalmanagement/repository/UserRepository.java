package com.vedait.hospitalmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vedait.hospitalmanagement.entity.UserEntity;
@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer> {
	

}