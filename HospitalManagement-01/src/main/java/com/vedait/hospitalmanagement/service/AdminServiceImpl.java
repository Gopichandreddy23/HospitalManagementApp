package com.vedait.hospitalmanagement.service;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.vedait.hospitalmanagement.entity.AdminEntity;
import com.vedait.hospitalmanagement.model.AdminModel;
import com.vedait.hospitalmanagement.repository.AdminRepository;
@Service
public class AdminServiceImpl implements AdminService{
	@Autowired
	AdminRepository adminrespository;
	@Override
	public List<AdminModel> getAllAdmins() {
	    List<AdminEntity> adminentity = adminrespository.findAll();
	    ObjectMapper mapper = new ObjectMapper();
	    List<AdminModel> adminModels = adminentity.stream()
	            .map(x -> convert(x))
	            .collect(Collectors.toList());
	    return adminModels;
	}
	// Conversion method
	public AdminModel convert(AdminEntity a) {
	    return new AdminModel(a.getAdmin_id(), a.getAdmin_username(), a.getAdmin_password(), a.getAdmin_email(), a.getAdmin_role());
	}
	@Override
	public AdminModel saveAdmin(AdminModel a) {
		AdminEntity save = adminrespository.save(new AdminEntity(a.getAdmin_id(),a.getAdmin_username(),a.getAdmin_password(),a.getAdmin_email(),a.getAdmin_role()));
		
		return convert(save);
	}
	@Override
	public AdminModel updateAdmin(AdminModel a) {
		AdminEntity save = adminrespository.save(new AdminEntity(a.getAdmin_id(),a.getAdmin_username(),a.getAdmin_password(),a.getAdmin_email(),a.getAdmin_role()));
		
		return convert(save);
	}
	@Override
	public void deleteAdmin(int admin_id ) {
		AdminModel ad= getAdminById(admin_id);
		adminrespository.delete(new AdminEntity(ad.getAdmin_id(),ad.getAdmin_username(),ad.getAdmin_password(),ad.getAdmin_email(),ad.getAdmin_role()));
		
	}
	@Override
	public AdminModel getAdminById(int admin_id) {
		AdminEntity byId = adminrespository.getById(admin_id);
		
		return convert(byId);
	}
}
