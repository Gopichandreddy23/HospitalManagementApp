package com.vedait.hospitalmanagement.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.vedait.hospitalmanagement.entity.AdminEntity;
import com.vedait.hospitalmanagement.entity.DoctorEntity;
import com.vedait.hospitalmanagement.model.AdminModel;
import com.vedait.hospitalmanagement.model.DoctorModel;
import com.vedait.hospitalmanagement.repository.DoctorRepository;
@Service
public class DoctorServiceImpl implements DoctorService{
	@Autowired
	DoctorRepository doctorrespository;

	@Override
	public List<DoctorModel> getAllDoctors() {
		  List<DoctorEntity> doctorentity = doctorrespository.findAll();
		    ObjectMapper mapper = new ObjectMapper();
		    List<DoctorModel> adminModels = doctorentity.stream()
		            .map(x -> convert(x))
		            .collect(Collectors.toList());
		    return adminModels;
	}
	public DoctorModel convert(DoctorEntity a) {
	    return new DoctorModel(a.getDoctor_id(),a.getDoctor_name(),a.getDoctor_phno(),a.getDoctor_specialization() );
	}

	@Override
	public DoctorModel saveDoctor(DoctorModel d) {
		DoctorEntity save = doctorrespository.save(new DoctorEntity(d.getDoctor_id(),d.getDoctor_name(),d.getDoctor_phno(),d.getDoctor_specialization()));
		return convert(save);
	}

	@Override
	public DoctorModel updateDoctor(DoctorModel d) {
		DoctorEntity save = doctorrespository.save(new DoctorEntity(d.getDoctor_id(),d.getDoctor_name(),d.getDoctor_phno(),d.getDoctor_specialization()));
		return convert(save);
	}

	@Override
	public void deleteDoctor(int doctor_id) {
	    // Fetch the DoctorEntity by ID
	    DoctorEntity doctorEntity = doctorrespository.findById(doctor_id)
	        .orElseThrow(() -> new RuntimeException("Doctor not found with id: " + doctor_id));

	    // Delete the fetched DoctorEntity
	    doctorrespository.delete(doctorEntity);
	}


	@Override 
	public DoctorModel getDoctorById(int doctor_id) {
		DoctorEntity doctorEntity =  doctorrespository.findById(doctor_id) .orElseThrow(() -> 
		new RuntimeException("Doctor not found with id: " + doctor_id)); 
		return convert(doctorEntity); 
		}

}
