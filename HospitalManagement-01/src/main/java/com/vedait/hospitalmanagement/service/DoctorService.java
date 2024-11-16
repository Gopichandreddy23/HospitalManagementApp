package com.vedait.hospitalmanagement.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.vedait.hospitalmanagement.model.DoctorModel;


@Service
public interface DoctorService {
	List<DoctorModel> getAllDoctors();

	DoctorModel saveDoctor(DoctorModel d);

	DoctorModel updateDoctor(DoctorModel d);

	void deleteDoctor(int doctor_id);

	DoctorModel getDoctorById(int doctor_id);




}
