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
import com.vedait.hospitalmanagement.service.DoctorService;

@RestController
public class DoctorController {
	@Autowired
	DoctorService doctorService;
	
	@GetMapping("/doctor")
	public List<DoctorModel> getAllDoctors(){
		List<DoctorModel> doctor=doctorService.getAllDoctors();
		return doctor;
	}
	@GetMapping("/doctor/{doctor_id}")
	public DoctorModel getDoctorModel(@PathVariable("doctor_id") int  doctor_id) {
		DoctorModel doctor=doctorService.getDoctorById(doctor_id);
		return doctor;
		
	}
	@PostMapping("/doctor")
	public DoctorModel saveDoctorModel(@RequestBody DoctorModel d) {
		DoctorModel saveDoctor = doctorService.saveDoctor(d);
		return saveDoctor;
	}
	@PutMapping("/doctor")
	public DoctorModel upDateDoctorModel(@RequestBody DoctorModel d) {
		DoctorModel updateDoctor = doctorService.updateDoctor(d);
		return updateDoctor;
	}
	@DeleteMapping("/doctor/{doctor_id}")
	public void deleteDoctor(@PathVariable("doctor_id")int doctor_id ) {
		doctorService.deleteDoctor(doctor_id);
		
	}

}
