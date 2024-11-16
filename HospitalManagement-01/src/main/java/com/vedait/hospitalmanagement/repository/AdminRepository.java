package com.vedait.hospitalmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vedait.hospitalmanagement.entity.AdminEntity;

public interface AdminRepository extends JpaRepository<AdminEntity, Integer> {

}
