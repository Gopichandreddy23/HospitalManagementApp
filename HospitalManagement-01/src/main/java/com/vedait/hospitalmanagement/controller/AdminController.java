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

import com.vedait.hospitalmanagement.model.AdminModel;
import com.vedait.hospitalmanagement.model.DoctorModel;
import com.vedait.hospitalmanagement.service.AdminService;

@RestController
public class AdminController {
	@Autowired
	AdminService adminservice;
	
	@GetMapping("/admin")
	public List<AdminModel> getAllAdmin(){
		List<AdminModel> admin=adminservice.getAllAdmins();
		return admin;
	}
	@GetMapping("/admin/{admin_id}")
	public AdminModel getAdminModel(@PathVariable("admin_id") int  admin_id) {
		AdminModel admin=adminservice.getAdminById(admin_id);
		return admin;
		
	}
	@PostMapping("/admin")
	public AdminModel saveAdminModel(@RequestBody AdminModel d) {
		AdminModel saveadmin = adminservice.saveAdmin(d);
		return saveadmin;
	}
	@PutMapping("/admin")
	public AdminModel upDateAdminModel(@RequestBody AdminModel d) {
		AdminModel updateadmin = adminservice.updateAdmin(d);
		return updateadmin;
	}
	@DeleteMapping("/admin/{admin_id}")
	public void deleteAdmin(@PathVariable("admin_id")int admin_id ) {
		adminservice.deleteAdmin(admin_id);
		
	}


}
