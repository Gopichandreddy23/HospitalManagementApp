package com.vedait.hospitalmanagement.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.vedait.hospitalmanagement.model.AdminModel;

@Service
public interface AdminService {
	List<AdminModel> getAllAdmins();

	AdminModel saveAdmin(AdminModel a);

	AdminModel updateAdmin(AdminModel a);

	void deleteAdmin(int admin_id);

	AdminModel getAdminById(int admin_id);

}
